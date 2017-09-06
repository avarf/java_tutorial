import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String file_add = "";
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("please insert the operation");
//		String operation = sc.nextLine();
		
		System.out.println("Enter the folder name:");
		String src_add = sc.nextLine();
				
//		System.out.println("Insert the destination");
//		String dest_add = sc.nextLine();
	
		File src_path = new File(src_add);		
//		System.out.println(src_path.getName());
//		System.out.println(src_path.toPath().getFileName());
		System.out.println(src_path.toPath().getName());
		
//		WorkWFiles fileObj = new WorkWFiles();
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
//		
//		System.out.println("Finished");
		sc.close();
	}

}
