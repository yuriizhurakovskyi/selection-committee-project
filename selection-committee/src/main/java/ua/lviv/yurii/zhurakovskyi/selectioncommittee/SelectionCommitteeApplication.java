package ua.lviv.yurii.zhurakovskyi.selectioncommittee;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelectionCommitteeApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(SelectionCommitteeApplication.class, args);
	}
}
