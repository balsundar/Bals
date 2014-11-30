package moh.sample.SampleThreads;

import org.s2n.ddt.util.http.HttpData;
import org.s2n.ddt.util.http.NetSend;

public class GetFromWeb {

	public static void main(String[] args){
		HttpData hDat = new HttpData();
		try{
			
			hDat.setUrl("https://sel2in.com/up6.php?a=b");
			
			String s=NetSend.send(hDat,"", null,"Get");
			
			
			System.out.println("Got: "+s+" ");
//			NetSend.send(hDat, "");
//			System.out.println();
		}
		catch (Exception e){
			System.out.println("Error: "+e);
			e.printStackTrace();
		}
	}
	
}
