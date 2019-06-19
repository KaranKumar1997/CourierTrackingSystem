package co.cts.dao;

import java.util.ArrayList;

import com.cts.vo.Package;
import com.cts.vo.User;

public interface UserDAO {
	
	public int insertion(User u);
	public ArrayList<Package> retrive(User u);

}
