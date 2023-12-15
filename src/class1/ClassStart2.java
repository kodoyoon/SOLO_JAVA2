package class1;

public class ClassStart2 {
  public static void main(String[] args) {
    String[] studentNames = {"학생1", "학생2"};
    int[] studentAges = {15,16};
    int[] studentGrades = {90,70};

    for(int i=0; i < studentNames.length; i++) { // -> 어차피 학생이 추가되면 나이랑 등급을 추가할거니까
      System.out.println("이름: " + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);

    }
  }
}
