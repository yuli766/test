package pojo;

public class Book {
    private Integer bid;
    private String name;
    private Integer price;

    public Book(Integer bid, String name, Integer price) {
        this.bid = bid;
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
