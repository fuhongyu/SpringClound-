package cn.tedu.service;

import java.util.List;

import cn.tedu.pojo.User;

public interface UserService {
	//��ѯ����
	public List<User> find();

	//��ѯ����User
	public User findUserById(Integer id);

	//����һ��User
	public void insert(User user);

	//�����û�
	public void update(User user);

}