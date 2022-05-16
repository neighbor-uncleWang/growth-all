package com.wjw.all.springbootall.select;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;

/**
 * @author laoWang
 * @ClassName select.java
 * @createTime 2022-05-16 19:21
 */
public class DeferredImportSelectorDemo implements DeferredImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("=========================DeferredImportSelectorDemo.selectImports=========================");
        return new String[]{DeferredBean.class.getName()};
    }

    /**
     * 返回实现Group的类
     *
     * @return
     */
    @Override
    public Class<? extends Group> getImportGroup() {
        return DeferredImportSelectorGroup.class;
    }


    private static class DeferredImportSelectorGroup implements Group {

        private List<Entry> list = Lists.newArrayList();

        /**
         * 收集需要实例化的类
         *
         * @param annotationMetadata
         * @param deferredImportSelector
         */
        @Override
        public void process(AnnotationMetadata annotationMetadata, DeferredImportSelector deferredImportSelector) {
            System.out.println("===================DeferredImportSelectorGroup.process===================");
            String[] strArr = deferredImportSelector.selectImports(annotationMetadata);
            for (String str : strArr) {
                list.add(new Entry(annotationMetadata, str));
            }
        }

        /**
         * 负责把收集的结果返回，返回的类必须包装城entry对象
         *
         * @return
         */
        @Override
        public Iterable<Entry> selectImports() {
            System.out.println("===================DeferredImportSelectorGroup.selectImports===================");
            return list;
        }
    }
}
