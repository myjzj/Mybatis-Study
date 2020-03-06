package com.myj.dao;

import com.myj.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    int updateBlog(Map map);


    List<Blog> queryBlogChoose(Map map);

    //查询第1-2-3的博客
    List<Blog> queryBlogForeach(Map map);

}
