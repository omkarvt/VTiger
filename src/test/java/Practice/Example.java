package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Revision.ExelUtility;
import genericUtility.ExellUtility;

public class Example {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExelUtility ex=new ExelUtility();
		String s=ex.getDataFromEx("Actors", 0, 0);
		String s1=ex.getDataFromEx("Actors", 0, 3);
		System.out.println(s);
		System.out.println(s1);
	}

}
