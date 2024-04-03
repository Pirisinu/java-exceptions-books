package www.experis.library;

public class Book {
    // Attributes
    private String title, author, editor;
    private int numPage;

    // Constructor
    public Book(String title, String author, String editor, int numPage) throws NotEmptyStringPls, NoZeroPage {
        if (title.trim().isEmpty()) {
            throw new NotEmptyStringPls("Il titolo non può essere vuoto.");
        }
        if (author.trim().isEmpty()) {
            throw new NotEmptyStringPls("L'autore non può essere vuoto.");
        }
        if (editor.trim().isEmpty()) {
            throw new NotEmptyStringPls("L'editore non può essere vuoto.");
        }
        if (numPage <= 0) {
            throw new NoZeroPage("Il numero di pagine non può essere zero o negativo.");
        }
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
    public class NoZeroPage extends Exception {
        public NoZeroPage(String message) {
            super(message);
        }
    }


    // Getter e Setter
    public String getFullInfo(){
        return  "Titolo: " + this.title + " || "
                + "Autore: " + this.author + " || "
                + "Editore: " + this.editor + " || "
                + "Numero pagine: " + this.numPage +"; ||";
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws NotEmptyStringPls {
        if (title.trim().isEmpty()) {
            throw new NotEmptyStringPls("Il titolo non può essere vuoto.");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws NotEmptyStringPls {
        if (author.trim().isEmpty()) {
            throw new NotEmptyStringPls("Il nome dell'autore non può essere vuoto.");
        }
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws NotEmptyStringPls {
        if (editor.trim().isEmpty()) {
            throw new NotEmptyStringPls("Il nome dell'editore non può essere vuoto.");
        }
        this.editor = editor;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) throws NoZeroPage {
        if (numPage <= 0) {
            throw new NoZeroPage("Il numero delle pagine deve essere superiore allo 0.");
        }
        this.numPage = numPage;
    }
}
