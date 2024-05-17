package com.example.ReadXLSFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadXlsFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadXlsFileApplication.class, args);
	}

}
        /*spring.jpa.hibernate.ddl-auto=update
		spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
		spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
		spring.datasource.username=system
		spring.datasource.password=SYSTEM
		#this shows the sql actions in the terminal logs


		#this shows the sql actions in the terminal logs
		spring.jpa.show-sql=true
		spring.servlet.multipart.enabled=true
		#Threshold after which files are written to disk.
		spring.servlet.multipart.file-size-threshold=2KB
		# Max file size.
		spring.servlet.multipart.max-file-size=20MB
		#max Request Size
		spring.servlet.multipart.max-request-size=20MB*/