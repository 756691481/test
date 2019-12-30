package task.Dao;

import org.apache.ibatis.annotations.Mapper;
import task.Entity.JobsUser;

import java.util.List;

public interface JobsMapper {
    List<JobsUser> getListJob();
}

