package com.wjw.all.springbootall.select;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Import(DeferredImportSelectorDemo.class)
public class ImportBean {
}
