package com.yupi.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author cat
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-04-10 14:58:28
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




