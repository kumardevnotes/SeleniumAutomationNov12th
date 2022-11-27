package com.practice.files.io;

import java.io.File;

public class FoldersIODemo {

	public static void main(String[] args) {
		
		File obj =  new File ("C:/NewSelFolder");
		boolean createdFolder = obj.mkdir();
		System.out.println("folder created at given localtion " + createdFolder);
		
		obj.delete();
		
		System.out.println("folder deleted at given localtion ");
	}

}
