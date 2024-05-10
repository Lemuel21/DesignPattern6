package DesignPatt;

public class Book implements Resource{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkOut(String studentId) {
        System.out.println("Book '" + title + "' checked out by student " + studentId);
    }
}

