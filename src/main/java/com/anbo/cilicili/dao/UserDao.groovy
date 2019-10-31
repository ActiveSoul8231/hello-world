package com.anbo.cilicili.dao

import com.anbo.cilicili.bean.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Select

/*mapper 用于springMVC 自动装配（自动扫描时所使用）
springMVC 会自动扫描带有@Mapper的文件  注入到mybatis
 */
@Mapper
public interface UserDao {
    /*
    @Select("""
    select * from tb_user where 1=1 
    <if test=userName != null> and user_name = #{userName} </if>
    """)
    List<User> selectUser(String userName);

  */
    @ResultMap("userMap")
    @Select("select * from tb_users where user_name = #{userName}")
    def User getUserByName(@Param("userName")String userName)

//    User getUserByName(String userName)

//    @ResultMap("userMap")
//    @Select("")
//    User getUserByName()
}