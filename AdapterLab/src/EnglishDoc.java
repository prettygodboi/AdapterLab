public class EnglishDoc {
private Document doc;

    public EnglishDoc(){}

    public EnglishDoc(Document doc) {this.doc = doc;}

    public void fillingOutDocument() {
        doc.setName("statement");
        doc.setText("abrakadabra");
        doc.setPosition("intern");
        doc.setFullName("Shevlyakov Dmitry Pavlovich");
        doc.setDate(Integer.parseInt("14.01.2022"));
        System.out.println(doc.getName());
        System.out.println(doc.getText());
        System.out.println(doc.getPosition());
        System.out.println(doc.getFullName());
        System.out.println(doc.getDate());
    }


}
