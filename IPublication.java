public interface IPublication {
    public void setTitle(String title);

    public void setAuthors(Author[] authors);

    public void setPublisher(Publisher publisher);

    public void setYear(int year);

    public String getTitle();

    public Author[] geAuthors();

    public Publisher getPublisher();

    public int getYear();

    @Override
    public String toString();
}
