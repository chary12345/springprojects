package prac.spring.idao;

import java.util.List;

import prac.spring.pojo.SpringPracticePojo;

public interface ILoginDao {
public List<SpringPracticePojo> loginUser(SpringPracticePojo sp,long mobile);
public List<SpringPracticePojo> getAllUser(SpringPracticePojo sp);
}
