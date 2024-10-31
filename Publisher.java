public class Publisher {
    private String  publisherName;
    private Contacts contact;

    public Publisher (String publisherName, Contacts contact) {
        setPublisherName(publisherName);
        this.contact = contact;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        String msg= "The publisher is " +publisherName + " and its contact details are " + contact.toString();
        return msg;
    }
}
