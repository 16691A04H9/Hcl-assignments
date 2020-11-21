import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiless {
	static final String FILEPATH ="hello.TXT";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {  
	            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
	            writeToFile(FILEPATH, "hello world", 31);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	    private static byte[] readFromFile(String filePath, int position, int size)  
	            throws IOException {  
	        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
	        file.seek(position);  
	        byte[] bytes = new byte[size];  
	        file.read(bytes);  
	        file.close();  
	        return bytes;  
	    }  
	    private static void writeToFile(String filePath, String data, int position)  
	            throws IOException {  
	        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
	        file.seek(position);  
	        file.write(data.getBytes());  
	        file.close();  
	}

}
