package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

//mybatis接口，通过注解方式写sql语句，实现CRUD
public interface UserMapper {

	//查询所有方法
	@Select("select * from user")
	public List<User> findAll();

	@Select("select * from user where id = #{id}")
	public User findUserById(Integer id);

	@Insert("insert into user (name,birthday,address) values(#{name},#{birthday},#{address})")
	public void insertUser(User user);

	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
}
