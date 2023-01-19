package com.Exception;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class ThrowsExample1 {
    void open() throws IOException
    {
    	System.out.println("writing into file");
    	FileOutputStream p=new FileOutputStream("D:\\testfile.txt");
    	p.write(97);
    }
    void useClass() throws ClassNotFoundException
    {
    	
    }
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ThrowsExample1 t=new ThrowsExample1();
		t.open();
		t.useClass();
	}

}
