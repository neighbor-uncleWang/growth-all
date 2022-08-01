/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.wjw.duboo.bizservice;

import org.apache.dubbo.metadata.report.identifier.KeyTypeEnum;
import org.apache.dubbo.metadata.report.identifier.MetadataIdentifier;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

import static org.apache.dubbo.common.constants.CommonConstants.PATH_SEPARATOR;

/**
 * @author wjw01019072
 * @version : ZkUtil.java, v 0.1 2022年08月01日 17:19 wjw01019072 Exp $
 */
public class ZkUtil {

    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");
    private static CuratorFramework client;

    static {
        initClient();
    }

    public static void initClient() {
        client = CuratorFrameworkFactory.newClient(zookeeperHost + ":2181", 60 * 1000, 60 * 1000,
                new ExponentialBackoffRetry(1000, 3));
        client.start();
    }

    public static String getMetadata(String root, String serviceInterface, String side, String app) throws Exception {
        String path = getNodePath(root, new MetadataIdentifier(serviceInterface, null, null, side, app));
        return new String(client.getData().forPath(path));
    }

    public static String getNodePath(String root, MetadataIdentifier metadataIdentifier) {
        return toRootDir(root) + metadataIdentifier.getUniqueKey(KeyTypeEnum.PATH);
    }

    private static String toRootDir(String root) {
        if (root.equals(PATH_SEPARATOR)) {
            return root;
        }
        return root + PATH_SEPARATOR;
    }

    private static void removeGlobalConfig() {
        try {
            client.delete().forPath("/dubbo/config/dubbo/dubbo.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}