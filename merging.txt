import java.io.*;

class MERGE{
public static void main(String[] args)throws IOException{

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