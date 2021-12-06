import java.io.*;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//knoldus//Desktop//Java_Assignments_Kup//ReadFileTransformationAssignment//file.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        String st;

        while ((st = br.readLine()) != null) {
            String[] arr=st.split("\\s");
            for(int i=0;i< arr.length;i++) {
                if (!map.containsKey(arr[i]))
                    map.put(arr[i],1);
                else
                    map.put(arr[i],map.get(arr[i])+1);
            }
        }

        System.out.println(map);

    }
}
