package co.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cts.util.Db;
import com.cts.vo.Package;
import com.cts.vo.User;

public class UserDAOImple implements UserDAO{
 
	int result=0;
	@Override
	public int insertion(User u) {
		
		
		try
		{
			PreparedStatement pst=Db.getDb().prepareStatement("insert into user(firstName,lastName,gender,email,contactNumber,password) values('"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getGender()+"','"+u.getEmail()+"','"+u.getContactNumber()+"','"+u.getPassword()+"');");
			result=pst.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return result;
		
	}
	public int validation(User u) {
	
		try
		{
			PreparedStatement pst=Db.getDb().prepareStatement("select * from user");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				if(u.getCustomerId()==(rs.getLong(6)) && u.getPassword().equals(rs.getString(7)))
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
	@Override
	public ArrayList<Package> retrive(User u) {
		ArrayList<Package> al=new ArrayList<>();
		
		try
		{
			PreparedStatement pst=Db.getDb().prepareStatement("select * from package where customerId='"+u.getCustomerId()+"'");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
			 Package p=new Package(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getString(9), rs.getString(10));
			 al.add(p);
			}
		}catch(Exception e)
		{
			System.err.println(e);
		}
		return al;
		
	
	}
	
	
	

}
