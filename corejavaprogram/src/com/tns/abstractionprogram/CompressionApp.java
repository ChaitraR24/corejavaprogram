package com.tns.abstractionprogram;


abstract class FileCompressor{
	abstract void compress(String filename);
	
	void showDetails() {
		System.out.println("Compression Starated...");
	}
}


class ZipCompressor extends FileCompressor{

	@Override
	void compress(String filename) {
	System.out.println("Compressing using zip...");
	
	int originbalSize = 100;
	int compressed = originbalSize * 60/100;
	System.out.println("original size " + originbalSize + " MB");
	System.out.println("compressed size " + compressed + "MB");
		
	}
	
}

class Gzipcompressor extends FileCompressor{

	@Override
	void compress(String filename) {
		System.out.println("compressing using Gzip...");
		int originalsize = 100;
		int compressidesize = originalsize *60/100;
		System.out.println("original size " + originalsize + "MB");
		System.out.println("compressed size " + compressidesize + "MB");
		
	}
	
}

public class CompressionApp {
public static void main(String[] args) {
	ZipCompressor zipCompressor = new ZipCompressor();
	zipCompressor.compress("project.zip");
	System.out.println();
	
	Gzipcompressor gzipcompressor = new Gzipcompressor();
	gzipcompressor.compress("project.gz");
}
}
