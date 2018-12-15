package com.test;

import java.io.IOException;

public class ImageOperation {
	
	 private static final String FILE_NAME = "D://app//static_content//activity_documents//santosh.jpg";
	 private static final String output = "D://app//static_content//seva_mitra_documents";
     
	public static void main(String[] args) throws IOException {
		
    	   ImageFileUtils.writeFileIntoImageFormatByImageIO(FILE_NAME, output);
    	   
    	   String base64Str = ImageFileUtils.getImageIntoBase64Format(FILE_NAME);
    	   
    	   ImageFileUtils.writeBase64ToImageFile(base64Str, output+"/file1.jpg");
	}
	 

	 

}
