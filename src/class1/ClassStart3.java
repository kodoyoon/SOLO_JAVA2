package class1;

public class ClassStart3 {

  public static void main(String[] args) {
    Student student1; //학생을 담을 변수를 선언, Student 타입을 받을 수 있는 변수를 선언
    student1 = new Student(); //Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다. , student1 이 포스트잇, 변수
    student1.name = "학생1"; // . 은 인스턴스로 접근하는 방법, //x001
    student1.age = 15;
    student1.grade = 90; //객체 내부의 변수 //stduent1 이 인스턴스 왜냐하면 인스턴스를 담아서

    Student student2 = new Student();  //Student = student2
    //------------------------------- // student2 = new Student2;

    student2.name = "학생2"; //x002
    student2.age = 16;
    student2.grade = 80;

    System.out.println("이름:" +student1.name + " 나이:" + student1.age + "성적:" + student1.grade );
    System.out.println("이름:" +student2.name + " 나이:" + student2.age + "성적:" + student2.grade );
  }
}
