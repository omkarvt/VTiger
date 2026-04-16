package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExelUtility;

public class Fachingdatafromexel02 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExelUtility eutility=new ExelUtility();
	String value=eutility.getDataFromeXel("Actors", 2, 1);
	String value2=eutility.getDataFromeXel("cartoons", 5, 3);
	System.out.println(value);
	System.out.println(value2);
	}

}
