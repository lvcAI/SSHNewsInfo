package party.pjc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import party.pjc.dao.BaseDao;
import party.pjc.entity.User;
import party.pjc.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private BaseDao<User> baseDao;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		baseDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		baseDao.update(user);
	}

	@Override
	public User findUserById(int id) {
		return baseDao.get(User.class, id);
	}

	@Override
	public void deleteUser(User user) {
		baseDao.delete(user);
	}

	@Override
	public List<User> findAllList() {
		return baseDao.find("from User");
	}

	@Override
	public User findUserByNameAndPassword(User user) {
		return baseDao.get("from User u where u.userName=? and u.password=?", new Object[]{user.getUsername(),user.getPassword()});
	}

}
