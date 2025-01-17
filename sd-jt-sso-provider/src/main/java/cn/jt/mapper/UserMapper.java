package cn.jt.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.jt.pojo.User;

public interface UserMapper {
	
	@Select("select count(*) from tb_user where ${type}=#{param}")
	public int check(@Param("param") String param,@Param("type") String type);
	
	@Insert("insert into tb_user (username, password, phone, email, created, updated)"
			+ " values(#{username},#{password},#{phone},"
			+ "#{email},#{created},#{updated})")
	public void insert(User user);
	
	@Select("select * from tb_user where username=#{username}")
	public User login(String username);

}
