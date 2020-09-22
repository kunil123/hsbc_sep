package whatsapp_dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import UserDefinedException.UserDefinedException;
import whatsapp_Pojo.Pojo;

public class WhatsappDao implements WhatsappDaoInterface {

	@Override
	public int CreateProfileDao(Pojo p) throws Exception {
		
		/*Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement("insert into whatsapp values(?,?,?)");
		ps.setString(1, p.getEmail());
		ps.setString(2, p.getName());
		ps.setString(3, p.getPassword());
		ps.executeUpdate();*/
		
		
		
		File f = new File("d:/hsbc/one.txt");
		if(f.createNewFile()) {
			System.out.println("File Created");
		}
		else
		{
			System.out.println("Creation Failed or File already Exists");
		}
		FileOutputStream out = new FileOutputStream(f,true);
		String n=p.getName();
		String em=p.getEmail();
		String pass=p.getPassword();
		ArrayList<String> a=new ArrayList<>();
		a.add(n);
		a.add(em);
		a.add(pass);
		for(String st:a) {
			for(int i=0;i<st.length();i++) {
				out.write(st.charAt(i));
			}
			out.write('\n');
		}
		out.write('\n');
		
	System.out.println();
	System.out.println("The content of the file is :");
		
		FileInputStream in = new FileInputStream(f);
		
		int c=0;
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		
		
		
		
		return 1;
		
	}

	@Override
	public void UpdateProfileDao(Pojo p) throws Exception {
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		System.out.println("Driver done");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		System.out.println("Connection done");
		PreparedStatement ps = con.prepareStatement("update  whatsapp set name=? where email=?");
		System.out.println("Prepared done");
	
		ps.setString(1,p.getName());
		
		ps.setString(2,p.getEmail());
		
		
		System.out.println("Query done");
		ps.executeUpdate();
		System.out.println("Exec done");
	}

	@Override
	public void DeleteProfileDao(Pojo p) throws Exception {
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement(" update  whatsapp set name =? where email=?");
		ps.setString(1, p.getName());
		ps.setString(2, p.getEmail());
		ps.executeUpdate();
		System.out.println(" delete done");
	
		
	}

	@Override
	public void SearchProfileDao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pojo ViewProfileDao(Pojo p) throws UserDefinedException  {
		Connection con=null;
		Pojo n = new Pojo();

		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		 con = DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		PreparedStatement ps = con.prepareStatement("Select * from whatsapp where email=? ");
		ps.setString(1,p.getEmail());
		ResultSet rs = ps.executeQuery();
		int i=0;
		if(rs.next()) {
			
			n.setEmail(rs.getString(1));
			n.setName(rs.getString(2));
			n.setPassword(rs.getString(3));
			i++;
		}
		if(i==0) {
			throw new UserDefinedException();
		}
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return n;
	}

	@Override
	public void ViewallProfileDao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateProfileDao2(Pojo p) throws Exception {
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		System.out.println("Driver done");
		Connection con = DriverManager.getConnection("jdbc:derby:d:/firstdb","kunil","kunil ");
		System.out.println("Connection done");
		PreparedStatement ps = con.prepareStatement("update  whatsapp set password=? where email=?");
		System.out.println("Prepared done");
	
		ps.setString(1,p.getPassword());
		
		ps.setString(2,p.getEmail());
		
		
		System.out.println("Query done");
		ps.executeUpdate();
		System.out.println("Exec done");
		
	}

}
