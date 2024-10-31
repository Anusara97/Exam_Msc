public class Author {
    private String authorName;
    private Contacts contact;

    public Author (String authorName) {
        this(authorName, null);
    }

    public Author(String authorName, Contacts contact) {
        setAuthorName(authorName);
        setContact(contact);
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        String msg = "The author: " + authorName + ",  and his/her contact details are " +contact.toString();
        return msg;
    }
}
