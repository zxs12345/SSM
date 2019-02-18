package com.zxs.service;

import com.zxs.entity.Book;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 图书表 服务类
 * </p>
 *
 * @author zengxs
 * @since 2019-02-17
 */
public interface BookService extends IService<Book> {
	List<Book> selectAll();
}
