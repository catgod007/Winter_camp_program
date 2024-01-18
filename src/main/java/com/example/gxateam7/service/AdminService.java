package com.example.gxateam7.service;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.utils.model.R;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/1510:05
 * Description:
 */
public interface AdminService {
    R login(String username, String password);

    R findByPage(AdminQueryDto queryDto);

    R save(Admin admin);

    R update(Admin admin);

    R delById(Integer id);

    R delBatch(String arrStr);

}
