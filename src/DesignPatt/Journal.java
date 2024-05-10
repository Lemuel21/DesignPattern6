package DesignPatt;

public class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkOut(String studentId) {
        System.out.println("Journal '" + title + "' checked out by student " + studentId);
    }
}

