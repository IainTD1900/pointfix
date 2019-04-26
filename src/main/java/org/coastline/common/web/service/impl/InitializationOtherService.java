package org.coastline.common.web.service.impl;

import org.coastline.common.web.dao.InitializationDao;
import org.coastline.common.web.service.InitializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jay.H.Zou
 * @date 2019/2/10
 */
@Service
public class InitializationOtherService implements InitializationService {


    @Override
    public boolean initialization() {
        // do others
        return false;
    }

}
