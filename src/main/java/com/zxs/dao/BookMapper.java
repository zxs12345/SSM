package com.zxs.dao;

import com.zxs.entity.Book;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 图书表 Mapper 接口
 * </p>
 *
 * @author zengxs
 * @since 2019-02-17
 */
public interface BookMapper extends BaseMapper<Book> {
List<Book> selectAll();
}
