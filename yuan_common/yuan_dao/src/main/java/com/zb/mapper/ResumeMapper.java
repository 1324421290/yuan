package com.zb.mapper;
import com.zb.entity.Resume;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeMapper {

	public Resume getResumeById(@Param(value = "resumeId") Integer resumeId)throws Exception;

	public List<Resume>	getResumeList();

	public List<Resume>	getResumeListByMap(Map<String,Object> param)throws Exception;

	public Integer getResumeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertResume(Resume resume)throws Exception;

	public Integer updateResume(Resume resume)throws Exception;


}
