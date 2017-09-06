import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class WorkWFiles {
	

	public void copy_File(String src_add, String dest_add) throws IOException {
		
		File src_path = new File(src_add);
		File dest_path = new File(dest_add);
		
		if(Files.notExists(dest_path.toPath())){
            Files.createDirectory(dest_path.toPath());
        } else if (Files.notExists(src_path.toPath())) {
			System.out.println("Source path doesn't exist.");
			return;
		}
		
		String file_name = src_path.getName();
		File final_dest_path = new File(dest_add+file_name);

		Files.copy(src_path.toPath(), final_dest_path.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
	}

	public void cut_File(String src_add, String dest_add) throws IOException {
		/*
		 * Empty directories can be moved. If the directory is not empty, 
		 * the move is allowed when the directory can be moved 
		 * without moving the contents of that directory. On UNIX systems, 
		 * moving a directory within the same partition generally consists of renaming the directory. 
		 * In that situation, this method works even when the directory contains files.
		 */
		File src_path = new File(src_add);
		File dest_path = new File(dest_add);
		
		if(Files.notExists(dest_path.toPath())){
			System.out.println("INSIDE THE IF");
            Files.createDirectory(dest_path.toPath());
        } else if (Files.notExists(src_path.toPath())) {
			System.out.println("Source path doesn't exist.");
			return;
		}
		
		String file_name = src_path.getName();
		File final_dest_path = new File(dest_add+file_name);
		Files.move(src_path.toPath(), final_dest_path.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
	}

	public void delete_File(String file_add) throws IOException{
		// TODO Auto-generated method stub
		
	}

	public void create_File(String file_add) throws IOException{
		// TODO Auto-generated method stub
		
	}

}
