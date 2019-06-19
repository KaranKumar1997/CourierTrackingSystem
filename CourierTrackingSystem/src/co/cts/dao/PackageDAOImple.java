package co.cts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cts.util.Db;
import com.cts.vo.Package;


public class PackageDAOImple implements PackageDAO
{

	@Override
			

	public int insertion(Package p) {
		int result=0;
		try
			{
			PreparedStatement pst=Db.getDb().prepareStatement("insert into package(acceptDate,packageWeight,cost,receiverAddress,employeeId,customerId,currentLocation,packageStatus) values('"+p.getAcceptDate()+"','"+p.getPackageWeight()+"','"+p.getCost()+"','"+p.getReceiverAddress()+"','"+p.getEmployeeId()+"','"+p.getCustomerId()+"','"+p.getCurrentLocation()+"','"+p.getPackageStatus()+"');");
			result=pst.executeUpdate();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			return result;
	}

	@Override
	/*public ArrayList<Package> viewAll()
	{
		
		//int result=0;
 
		ArrayList<Package> al=new ArrayList<>();
		try	
		{
			PreparedStatement pst=Db.getDb().prepareStatement("select * from package");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Package q=new Package(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getLong(7),rs.getLong(8),rs.getString(9),rs.getString(10));
				al.add(q);
			}
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return al;
	}*/

	public int updation(Package p) {
		int result=0;
		try
			{
			PreparedStatement pst=Db.getDb().prepareStatement("update package set employeeId='"+p.getEmployeeId()+"' , currentlocation='"+p.getCurrentLocation()+"', packagestatus='"+p.getPackageStatus()+"' where consignmentId='"+p.getCosignmentId()+"';");
			result=pst.executeUpdate();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			return result;
	}
}
		
	

