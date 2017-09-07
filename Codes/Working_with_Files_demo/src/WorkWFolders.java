import java.io.File;

public class WorkWFolders {
	public void get_content_files(String dir_add) {
		
		File dir_path = new File(dir_add);
		File[] content = dir_path.listFiles();
		
		for (File file : content) {
			if (file.isFile()) {
				System.out.println(file);
				System.out.println(file.getName());
			}
		}
		
	}
	
	public void get_content_dir(String dir_add) {
		
		File dir_path = new File(dir_add);
		File[] content = dir_path.listFiles();
		
		for (File file : content) {
			if (file.isDirectory()) {
				System.out.println(file);
				System.out.println(file.getName());
			}
		}
		
	}

	public void delete(String dir_add) {
		
	}
	
	public void cut(String dir_add) {
		// Auto-generated method stub

	}
	
	public void copy(String dir_add) {
		
	}
	
	public void create_newDir(String dir_path, String dir_name) {
		
	}
	
}
