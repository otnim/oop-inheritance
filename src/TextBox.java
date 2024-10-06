public class TextBox extends UIControl {
    private String text = "hello";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox Class");
//    }
    @Override
    public void render(){
        System.out.println("Render textBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
