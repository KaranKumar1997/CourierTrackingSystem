package co.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cts.util.Db;
import com.cts.vo.Admin;

public class StaffDAOImple implements StaffDAO {
 
	int result=0;
	@Override
	public int adminValidation(Admin a)
	{
		try
		{
			PreparedStatement pst=Db.getDb().prepareStatement("select * from staff");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				//if(a.getEmployeeId()==(rs.getLong(6)) && a.getPassword().equals(rs.getString(7)) && a.getLoginType()=='S')
				{
					result=1;
				}
					
			}
		}catch(Exception e)
		{
			System.err.println(e);
		}
		return result;
		
	}

}
