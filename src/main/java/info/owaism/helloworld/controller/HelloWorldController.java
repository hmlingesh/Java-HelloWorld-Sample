package info.owaism.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
/**
 * Created by Owais on 4/21/15.
 */
@Controller
public class HelloWorldController {
	
	private static final String RESPONSE = "Hello World!!!!";

    @RequestMapping(value = {"/**/*","/"}, method = RequestMethod.GET)
    @ResponseBody
    public String justSayIt() throws Exception{
       try {
         readMyFile();
       }catch (Exception e) { 
        e.printStackTrace();
       } 
       throw new Exception("Got an IOException: *********\n****************************\n************************\n********************************************90329*************3232******************93292************************902390230**************************************** *****************************************************************12345678910*********************************************************************************987654321?????????????????????????????????????????????????????????????????????????????********************123456789*****");

       // return RESPONSE;
    }

void readMyFile() { 

      DataInputStream dis = null; 
      String record = null; 
      int recCount = 0; 

      try { 

         File f = new File("fred.txt");  
         FileInputStream fis = new FileInputStream(f);  
         BufferedInputStream bis = new BufferedInputStream(fis);  
         dis = new DataInputStream(bis);  

         while ( (record=dis.readLine()) != null ) { 
         recCount++; 
            System.out.println(recCount + ": " + record); 
         } 

      } catch (IOException e) { 

	 //-----------------------------//
	 // output with e.getMessage()  //
	 //-----------------------------//
	 //
          // throw new Exception("Got an IOException: *********************************************************************************************************90329*************3232******************93292************************902390230**************************************** " + 
             //                e.getMessage()); 

	 //----------------------------------//
	 // output with e.printStackTrace()  //
	 //----------------------------------//

	 e.printStackTrace();

      } // end try/catch statement

   } // end readFile()

}
