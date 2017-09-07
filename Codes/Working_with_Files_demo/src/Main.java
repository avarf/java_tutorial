import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String file_add = "";
		WorkWFiles fileObj = new WorkWFiles();
		WorkWFolders foldObj = new WorkWFolders();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please insert the operation");
		String operation = sc.nextLine();
		
		System.out.println("Enter the folder name:");
		String src_add = sc.nextLine();
		
		
		foldObj.get_content_files(src_add);
		foldObj.get_content_dir(src_add);
				
//		System.out.println("Insert the destination");
//		String dest_add = sc.nextLine();
//			
//		if(operation.equals("copy")) {
//			fileObj.copy_File(src_add, dest_add);
//		}else if (operation.equals("cut")) {
//			fileObj.cut_File(src_add, dest_add);
//		}else if (operation.equals("delete")) {
//			file_add = src_add;
//			fileObj.delete_File(file_add);
//		}else if (operation.equals("create")) {
//			file_add = src_add;
//			fileObj.create_File(file_add);
//		}
//		
		
		System.out.println("Finished");
		sc.close();
	}

}
