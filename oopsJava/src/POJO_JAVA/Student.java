package POJO_JAVA;
import java.util.*;
public class Student {
    public Student(int sno, String name) {
		
		this.sno = sno;
		this.name = name;
	}
	int sno;
    String name;
    int phone;
    
    public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}