package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.mapper.BrandMapper;
import cn.itsource.aigou.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author mc
 * @since 2019-08-01
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
