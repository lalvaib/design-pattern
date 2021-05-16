import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class PdfDeletionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("H:\\Vision IAS");
		for(String f :file.list())
		{
			File f1=new File(f);
		}
	}
}
