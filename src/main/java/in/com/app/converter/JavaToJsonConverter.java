package in.com.app.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.com.app.model.Student;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setSid(101);
		student.setName("Kalidas");
		student.setRank(255900);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("student.json"), student);
		System.out.println("JSON file created");
	}

}
