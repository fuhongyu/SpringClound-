package cn.tedu.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

//���ð�ɨ����ƣ��Զ�������������
@Service
public class UserServiceImpl implements UserService{
	//spring ע��,ͨ��ע�뷽ʽ��Mybatis�ӿڶ���ע�뵽service�㣬ֱ�ӵ���
	@Autowired
	private UserMapper userMapper;

	public List<User> find() {
		
		return userMapper.findAll();
	}

	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findUserById(id);
	}

	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insertUser(user);
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

}