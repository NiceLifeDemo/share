 package com.techrc.controller;

 import com.techrc.dto.CommLogDTO;
 import com.techrc.mapper.LogMapper;
 import com.techrc.model.CommonLog;
 import com.techrc.service.LogService;
 import com.techrc.vo.CommonLogVO;
 import io.swagger.annotations.ApiOperation;
 import java.util.List;
 import java.util.Map;
 import java.util.concurrent.ConcurrentHashMap;
 import javax.validation.Valid;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PostMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/log"})
 public class CommonLogController
{
  @Autowired
private LogMapper logMapper;

 @Autowired
 private LogService logService;

 @PostMapping({"addLog"})
 @ApiOperation(value="新增日志", tags={"日志"})
 public String addLogInfo(@Valid @org.springframework.web.bind.annotation.RequestBody CommLogDTO commLogDTO)
  {
   CommonLog commonLog = new CommonLog();

   Map map=new ConcurrentHashMap();
    commonLog.setTag(commLogDTO.getTag());
    commonLog.setContent(commLogDTO.getContent());
  try
    {
     logService.addLogInfo(commonLog);
     } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }

     return "success";
  }

   @GetMapping({"getLogInfo"})
   @ApiOperation(value="查询日志列表", tags={"日志"})
   public List<CommonLogVO> getLogInfo()
   {
    List<CommonLogVO> logVOS = this.logMapper.getLogInfo();
     return logVOS;
   }
}


