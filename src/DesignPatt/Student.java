package DesignPatt;

public class Student {
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public void checkOutResource(Resource resource) {
        resource.checkOut(studentId);
    }
}

