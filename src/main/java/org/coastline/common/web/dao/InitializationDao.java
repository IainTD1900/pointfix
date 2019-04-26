package org.coastline.common.web.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jay.H.Zou
 * @date 2019/1/28
 */
@Repository
public interface InitializationDao {

    /**
     * 判断表是否存在
     *
     * @return
     */
    List isExistTable();

    /**
     * 创建表
     * @return
     */
    void createClusterTable();

}