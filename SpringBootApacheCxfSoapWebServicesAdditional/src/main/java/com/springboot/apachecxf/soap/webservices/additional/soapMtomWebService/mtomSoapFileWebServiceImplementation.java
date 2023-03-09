package com.springboot.apachecxf.soap.webservices.additional.soapMtomWebService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;

public class mtomSoapFileWebServiceImplementation implements mtomSoapFileWebService {

	@Override
	public void uploadFileAttachment(DataHandler fileAttachmentHandler) 
	{
		InputStream fileInputStream = null;
		OutputStream fileOutputStream = null;

		try
		{
			fileInputStream = fileAttachmentHandler.getInputStream();
			fileOutputStream = new FileOutputStream(new File("D:/miscReact/mtomFileSoapWebServices/uploaded/test.jpg"));
			byte[] b = new byte[120000];
			int fileBytesRead = 0;
			while((fileBytesRead = fileInputStream.read(b)) != -1)
			{
				fileOutputStream.write(b, 0, fileBytesRead);
			}
		}
		catch(IOException ioex)
		{
			ioex.printStackTrace();
		}
		finally
		{
			try 
			{
				fileInputStream.close();
				fileOutputStream.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public DataHandler downloadFileAttachment() 
	{
		return new DataHandler(new FileDataSource(new File("D:/miscReact/mtomFileSoapWebServices/uploaded/test.jpg")));
	}

}
