package com.zzq.springcloud.utils;

import java.io.*;
import java.util.Date;

public class RecordToFile {
	public static void main(String[] args) {
		String[] strs = {"开始时间=1564798","结束时间=54798764"};
		RecordToFile.record(new String[]{"开始时间=1564798","结束时间=54798764"}, "countTime.txt",true);
	}
	/**
	 * 记录东西到文件
	 */
	public static void record(String[] recStrs,String fileLocation,boolean append) {
		 File file = new File(fileLocation);// 要写入的文件路径
	        if (!file.exists()) {// 判断文件是否存在  
	            try {  
	                file.createNewFile();// 如果文件不存在创建文件  
	                System.out.println("文件"+file.getName()+"不存在已为您创建!");  
	            } catch (IOException e) {  
	                System.out.println("创建文件异常!");  
	                e.printStackTrace();  
	            }  
	        } else {  
	            System.out.println("文件"+file.getName()+"已存在!");  
	        }
		FileOutputStream fos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file,append);// 文件输出流  追加
			ps = new PrintStream(fos);
			ps.print(new Date()+ "\r\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (String str : recStrs) {// 遍历listStr集合
	            String string  = "	"+str + "\r\n";// +换行
	            ps.print(string); // 执行写操作  
		}
		ps.close(); // 关闭流
		System.out.println("文件写入完毕!");
	}
	public static void record(String[] recStrs,String fileLocation) {
		File file = new File(fileLocation);// 要写入的文件路径
		if (!file.exists()) {// 判断文件是否存在
			try {
				file.createNewFile();// 如果文件不存在创建文件
				System.out.println("文件"+file.getName()+"不存在已为您创建!");
			} catch (IOException e) {
				System.out.println("创建文件异常!");
				e.printStackTrace();
			}
		} else {
			System.out.println("文件"+file.getName()+"已存在!");
		}

		for (String str : recStrs) {// 遍历listStr集合
			FileOutputStream fos = null;
			PrintStream ps = null;
			try {
				fos = new FileOutputStream(file,true);// 文件输出流  追加
				ps = new PrintStream(fos);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String string  = str + "\r\n";// +换行
			ps.print(string); // 执行写操作
			ps.close(); // 关闭流

		}

		System.out.println("文件写入完毕!");
	}
}
