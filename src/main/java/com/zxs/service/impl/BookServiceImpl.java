package com.zxs.service.impl;

import com.zxs.entity.Book;
import com.zxs.dao.BookMapper;
import com.zxs.datasource.DataSource;
import com.zxs.service.BookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author zengxs
 * @since 2019-02-17
 */
@Service
@DataSource(DataSource.TWO)
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
@Autowired
BookMapper bookMapper;
	@Override
	public List<Book> selectAll() {
		// TODO Auto-generated method stub
		return bookMapper.selectAll();
	}

}
