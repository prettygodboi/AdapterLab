public class Document {
private String name;
private String text;
private String position;
private String fullName;
private int date;

public Document(String name,
                String text,
                String position,
                String fullName,
                int date) {
    this.name = name;
    this.text = text;
    this.position = position;
    this.fullName = fullName;
    this.date = date;
}

public String getName() {return name;}

public void setName(String name){this.name = name;}

public String getText() {return text;}

public void setText(String text) {this.text = text;}

public String getPosition() {return position;}

public void setPosition(String position) {this.position = position;}

public String getFullName() {return fullName;}

public void setFullName(String fullName) {this.fullName = fullName;}

public int getDate() {return date;}

public void setDate(int date) {this.date = date;}

}
