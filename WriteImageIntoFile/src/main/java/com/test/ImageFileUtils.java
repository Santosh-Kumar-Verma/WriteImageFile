package com.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

public class ImageFileUtils {

	
	public static String getImageIntoBase64Format(String filePath) throws IOException {
		 
		byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
		return encodedString;
	}
	public static void writeBase64ToImageFile(String base64Str,String outputFileName) throws IOException {
		byte[] decodedBytes = Base64.getDecoder().decode(base64Str);
		FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
		System.out.println("File Written successfully ");
	}
	
	public static void writeFileIntoImageFormatByImageIO(String fileName,String outputFile) {
        BufferedImage bImage = null;
        try {

            File initialImage = new File(fileName);
            bImage = ImageIO.read(initialImage);

            ImageIO.write(bImage, "gif", new File(outputFile+"/image.gif"));
            ImageIO.write(bImage, "jpg", new File(outputFile+"/image.png"));
            ImageIO.write(bImage, "bmp", new File(outputFile+"/image.bmp"));

        } catch (IOException e) {
              System.out.println("Exception occured :" + e.getMessage());
        }
        System.out.println("Images written succesfully.");

   }
}
