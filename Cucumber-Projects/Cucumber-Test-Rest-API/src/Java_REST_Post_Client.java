import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection; 
import java.net.URL;

import org.json.JSONObject;

public class Java_REST_Post_Client {

	public static void main(String[] args) throws IOException {
		 // post User json object
	  	 
		URL postUrl = new URL("http://localhost:8090/UserApp/rs/users/add");

		HttpURLConnection conn = (HttpURLConnection) postUrl.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");		 
	 	 
		//String newCust = "{\"firstName\":\"Vijay\",\"lastName\":\"More\",\"street\":\"MughalStreet\",\"city\":\"Delhi\",\"zip\":\"1222\",\"id\":12,\"state\":\"MP\",\"country\":\"India\"}";
		//we can also use json translator
		  JSONObject obj = new JSONObject(); 
		  obj.put("addrerss", "Pune");
		  obj.put("num", 105); 
		  obj.put("name", "asgy"); 		  
		  String dataJson = obj.toString();	 	  
		 
		  System.out.println("The user posted is  "+dataJson);		 

		OutputStream os = conn.getOutputStream();		 
		os.write(dataJson.getBytes());
		os.flush();
		System.out.println("The http status respopnse in post code is  "
				+ conn.getResponseCode());		 

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output = null;
		System.out.println("Output from the Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();
		
		 
				 	  
				  

				 


	}

}
