package com.zb.mapper;
import com.zb.entity.Comment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

	public Comment getCommentById(@Param(value = "id") Long id)throws Exception;

	public List<Comment>	getCommentListByMap(Map<String,Object> param)throws Exception;

	public Integer getCommentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertComment(Comment comment)throws Exception;

	public Integer updateComment(Comment comment)throws Exception;


}
