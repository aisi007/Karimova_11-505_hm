package DIP;

import DIP.ModelForms;
import DIP.WEBframework;
import DIP.MySQL;

public class Main {
    public static void main(String[] args) {
        ModelForms f = new ModelForms( 1, 12, "Max");
        WEBframework w = new WEBframework();
        w.save(f);

    }
}