package com.github.dakuohao.bean;

import java.util.List;

/**
 * 分页对象 表示一页数据
 * @author Peng 1029538990@qq.com
 */
public class Page {
    /**
     * 数据总数，默认0
     */
    private Integer total = 0;
    /**
     * 数据列表
     */
    private List<Entity> list;
}
