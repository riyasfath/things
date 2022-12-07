import java.io.*;

class CreateNew{
public static void main (String args[]) throws IOException{

File f1 = new File("Gg.txt");
f1.createNewFile();
System.out.println("File Created");

FileWriter f2 = new FileWriter(f1);
f2.write("GGGG");
f2.flush();
f2.close();

FileReader f3 = new FileReader(f1);
BufferedReader f4 = new BufferedReader(f3);
String gokul;
while((gokul=f4.readLine())!=null){
System.out.println(gokul);

FileInputStream fis = null;
		FileOutputStream fos = null;

	
	try {
		fis = new FileInputStream("/Volumes/Unni/java/Gg.txt");
		fos = new FileOutputStream("/Volumes/Unni/java/Gg.txt");
	
	int c;
	System.out.println("file copied");
	while((c = fis.read()) != -1){
		fos.write(c);
	}
}
	finally{
		if(fis != null){
			fis.close();
		}
		if(fos != null){
			fos.close();
		}
	}
}

PrintWriter pw = new PrintWriter("3.txt");

BufferedReader br1 = new BufferedReader(new FileReader("1.txt"));
BufferedReader br2 = new BufferedReader(new FileReader("2.txt"));


String sas = br1.readLine();
String sas2 = br2.readLine();


while( sas != null || sas2 != null)

{

if(sas!=null){
pw.println(sas);
sas = br1.readLine();


}
if(sas2 != null){
pw.println(sas2);
sas2= br2.readLine();


}


}
pw.flush();
br1.close();
br2.close();
pw.close();

}
}