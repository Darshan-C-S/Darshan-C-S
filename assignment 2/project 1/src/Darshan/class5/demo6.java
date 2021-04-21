package Darshan.class5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java .util.*;

public class demo6 {
    public static void main(String[] args) {
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader("data.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(buf!=null){
                try {
                    buf.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
