package ParcelService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path( "ParcelSize" )

public class PackageSize {

	  @POST
	  @Produces( MediaType.TEXT_PLAIN )
	  @Consumes( MediaType.TEXT_PLAIN)
	  public String getParcelSize(String json) //(String length, String height, String  Size)
	  {
		  // Datenbankabfrage
		  
		  Connection connect = null;
		  Statement statement = null;
		  ResultSet resultSet = null;
		  
		  try {
			  connect = DriverManager.getConnection("http://localhost:4711/ParcelService", "sarah", "");
			  
			  
			  statement = connect.createStatement();
			  resultSet = statement.executeQuery("select * from parcelsize.parcelsizetable");
			 // writeResultsSet(resultSet);
			  
			  System.out.println("Connection success");
		  }
		  catch (Exception e) {
			  System.err.println(e);
		  }
//		  
		  
		  return "Test";
		  // get connnection (url, username, passwort)
		  
//		  connection con 
//		  statement
//		  resultset
//		  
//		  select
//		  from
//		  where
//		   and
//		  
		  
		  // Jdbc für mysql runter laden
	     
		  
	  }
	  

	
}


//@POST

//public Response calculateParcelSize(...){


