//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       UIControl[] controls = {new UIControl(), new TextBox(), new CheckBox()};
//       for(UIControl control : controls)
//           control.render();
        new TaxReport().show();
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("change is a rule");
            System.out.println(textBox);
        }

        System.out.println(control);

    }
}