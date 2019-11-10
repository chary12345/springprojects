package prac.spring.idao;

import java.util.List;

import prac.spring.pojo.SpringPracticePojo;

public interface ImodifyDao {
	public List<SpringPracticePojo> updateUser(SpringPracticePojo sp);
public List<SpringPracticePojo>	editUser(long mobile);
public List<SpringPracticePojo>	deleteUser(long mobile);
}
