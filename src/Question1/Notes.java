package Question1;

public class Notes {
    public int id;
    public String book;
    public int page;

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", book='" + book + '\'' +
                ", page=" + page +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getBook() {
        return book;
    }

    public int getPage() {
        return page;
    }

    public Notes(int id, String book, int page) {
        this.id = id;
        this.book = book;
        this.page = page;
    }
}
