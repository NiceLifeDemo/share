package com.techrc.mapper;

import com.techrc.model.CommonLog;
import com.techrc.vo.CommonLogVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public abstract interface LogMapper
{

    void addLogInfo(CommonLog paramCommonLog);
  
    List<CommonLogVO> getLogInfo();
}

