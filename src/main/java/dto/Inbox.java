package dto;

public class Inbox {

    private String header;
    private String date;
    private String body;
    public Inbox(String header, String date, String body){
        this.header = header;
        this.date = date;
        this.body = body;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Inbox{" +
                "header='" + header + '\'' +
                ", date='" + date + '\'' +
                ", Body='" + body + '\'' +
                '}';
    }
}
