import java.io.File;
import java.io.IOException;


class User{
	private String name;
	private String email;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class PostingSystem {
	void createPost(User user) {
		try {
			File emailFolder =new File("D:"+File.separator+user.getEmail());
			if(!emailFolder.exists()){
				emailFolder.mkdir();
			}	
			File postFolder=new File(emailFolder,"post");
			if(!postFolder.exists()){
				postFolder.mkdir();
			}
			File imageFile= File.createTempFile("image", ".jpg", postFolder);
			File descfile= File.createTempFile("description", ".txt", postFolder);
		}catch(IOException e)
		{
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	PostingSystem ps=new PostingSystem();
	for(int i=0;i<5;i++) {
		
		//p.setImage(image);
		//p.setDescription(description);
		User u=new User();
		u.setEmail("ajay@gmail.com"+i);
		
		ps.createPost(u);
	}
}
}
