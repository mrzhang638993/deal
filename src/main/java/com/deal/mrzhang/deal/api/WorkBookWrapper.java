package com.deal.mrzhang.deal.api;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkBookWrapper {

    private XSSFWorkbook xssfWorkbook;

    public  XSSFWorkbook wrapperWorkBook(){
        // 需要对于workbook执行装配操作处理
        return this.xssfWorkbook;
    }

    public XSSFWorkbook  wrapperSheet(){
        // 需要对于sheet执行操作处理
        return this.xssfWorkbook;
    }

    public XSSFWorkbook wrapperCell(){
        // 需要对于cell执行操作处理的
        return this.xssfWorkbook;
    }
}
