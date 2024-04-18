package iuh.edu.vn;

import jdepend.xmlui.JDepend;

public class Swing_UI_Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("C:\\Users\\Student\\Downloads\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
}
