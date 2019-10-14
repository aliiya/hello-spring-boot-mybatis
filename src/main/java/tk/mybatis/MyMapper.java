package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: aliya
 * @Description: 自己的mapper, 不能被扫描到，否则会报错
 * @Data: Create in 2019/10/10 17:06
 * @Modify By:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
