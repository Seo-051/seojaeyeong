package ch13_inheritance.products;
/*
    부모 클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain 클래스 생성

    Item 클래스에
    1. fireld 선언 private String name / private String category
    2. AllArgsConstructor
    3. getter / setter
 */
public class Item {
    private  String name;
    private  String category;

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
