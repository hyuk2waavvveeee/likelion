public class Hello {
    //1.field 구성
    private String name;

    //2.getter 생성
    public String getName(){
        return name;
    }

    //2.setter 생성
    public void setName(String name){
        this.name = name;
    }

    //3.Method 만들기
    public void addName() {
        this.name = name + "!";
    }

    public static void main(String[] args){
        Hello hello = new Hello();  //객체생성
        hello.setName("hello!");    //setter 메소드 사용
        hello.addName();    //addName 메소드 사용
        System.out.println(hello.getName());    //getter 메소드 사용


    }
}
