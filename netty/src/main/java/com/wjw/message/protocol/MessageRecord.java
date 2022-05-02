package com.wjw.message.protocol;

import lombok.Data;

/**
 * @author wjw
 * @ClassName MessageRecord.java
 * @createTime 2022-04-30 09:32
 */
@Data
public class MessageRecord {
    private Header header;
    private Object body;


}
