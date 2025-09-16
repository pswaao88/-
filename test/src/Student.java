public class Student {
    private String name;

    public Student (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printName(){
        System.out.println("안녕하세요, " + this.name + "입니다. 반갑습니다.");
    }
}
