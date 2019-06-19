package co.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cts.util.Db;
import com.cts.vo.Admin;

public class AdminDAOImple implements AdminDAO {

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
				if(a.getEmployeeId()==(rs.getLong(6)) && a.getPassword().equals(rs.getString(7)) && a.getLoginType().equals(rs.getString(12)))
				{
					if(rs.getString(12).equals("A"))
					{
					result=1;
					}
					else
					{
				    result=2;
					}
					}
				}
				
					
			}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return result;
	}

	public int insertion(Admin a) {
	
		try
		{
			PreparedStatement pst=Db.getDb().prepareStatement("insert into staff(firstName,lastName,gender,email,contactNumber,password,salary,designation,correpondanceAddress,loginType) values('"+a.getFirstName()+"','"+a.getLastName()+"','"+a.getGender()+"','"+a.getEmail()+"','"+a.getContactNumber()+"','"+a.getPassword()+"','"+a.getSalary()+"','"+a.getDesignation()+"','"+a.getCorrepondanceAddress()+"','"+a.getLoginType()+"');");
			result=pst.executeUpdate();
			//System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}

	
		
	}
	
	


