package com.hjl.mapper;

import com.hjl.entity.Movie;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MovieMapper {


    List<Movie> findList(@Param("title") String title);
    List<Movie> findByParams(Map<String,Object> params);
    List<Movie> findByIdList(@Param("idList") List<Integer> idList);
    void insertBatch(List<Movie> movieList);



}
