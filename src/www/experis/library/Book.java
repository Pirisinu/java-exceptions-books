package www.experis.library;

public class Book {
    // Attributes
    private String title, author, editor;
    private int numPage;

    // Constructor
    public Book(String title, String author, String editor, int numPage) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.numPage = numPage;
    }

    // Exception

    public class NotEmptyStringPls extends Exception{
        public NotEmptyStringPls(String message){
            super(message);
        }
    }

    // Getter e Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
}
