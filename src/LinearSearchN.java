public class LinearSearchN {

    public static void main(String[] args) {

        Student[] secE = new Student[73];
        for (int i = 0; i < secE.length; i++) {

            secE[i] = new Student();
            secE[i].setName("Student" + (i+1));
            secE[i].setRollNo(i+1);
        }

        for (Student student : secE) {

            if(student != null){
                System.out.println(student);
            }
        }

        int position = -1;
        for (int i = 0; i < secE.length; i++) {

            if (secE[i].getName().equals(("Student22"))){
                position = i;
                break;
            }
        }
        if (position == -1){
            System.out.println("Student22 not found ");
        }
        else{
            System.out.println("Student22 Found , Roll No : "+ (position + 1));
        }
    }


}

class Student{
    private String name;
    private long rollNo;

    public String getName() {
        return name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return  ("("+this.rollNo+" , "+this.name+")");
    }
}
