package DesignPatt;

public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Lemmei");

        Resource book = new Book("Introduction to Programming");
        Resource journal = new Journal("Journal of Computer Science");

        student.checkOutResource(book);
        student.checkOutResource(journal);
    }
}

