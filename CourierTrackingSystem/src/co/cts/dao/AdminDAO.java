package co.cts.dao;

import com.cts.vo.Admin;

public interface AdminDAO {
	
	public int adminValidation(Admin a); 
	public int insertion(Admin a);

}
