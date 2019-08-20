package AssignmentSession8;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileCopyMain {

		

			public static void main(String[] args) {
				File f = new File("C:\\Users\\Zair\\eclipse-workspace\\Assignments\\src\\AssignmentSession8\\FirstMessage.txt");
				File f2 = new File("C:\\Users\\Zair\\eclipse-workspace\\Assignments\\src\\AssignmentSession8\\CopyOfFirstMessage.txt");
				if (f2.exists()) {
					System.out.println("This file already has a copy!...");
				} else {
					try {
						Files.copy(f.toPath(), f2.toPath());
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			}
}

