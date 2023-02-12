package shop.mtcoding.myblog2.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {

    public User findByUsername(@Param("username") String username);

    public int insert(@Param("username") String username, @Param("password") String password,
            @Param("email") String email);

    public User findById(int id);

    public int updateById(@Param("id") int id, @Param("password") String password, @Param("email") String eamil);

    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    public int deleteById(int id);

}
