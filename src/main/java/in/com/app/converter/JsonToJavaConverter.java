package in.com.app.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.com.app.model.Student;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(student);
	}
}
