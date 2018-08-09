import java.awt.*;

import javax.swing.*;

public class SimpleTable extends JFrame { 
    
    public SimpleTable() {

    super("Simple JTable Test");

setSize(300, 200);

//addWindowListener(new BasicWindowMonitor());
 
 Object cellData= new Object[][] {
             //namaz 	 no of rakat 	 time
             {"fajar",	"2+2",	"530AM"},
             {"israq",	"2+4",	"600AM"},
             {"chashte","4+4",	"900AM"},
             {"zohr",	"4+4+2+2","130PM"},
             {"asar",	"4+4",	"515PM"},
             {"magrib",	"3+2+2",	"700PM"},
             {"Esha",	"4+2+2+3+2",	"830PM"},
             {"juma",	"4+2+4+2+2",	"130PM"}};
                 String[] columnNames = {"namaz", "no of rakats","Time"};
    
  
JTable   JT= new JTable((Object[][]) cellData, columnNames) ;

 
/*new String[][] { {"This", "is"}, 
                                        {"a", "Test"}},
                       new String[] {"Column", "Header"});*/

JScrollPane jsp = new JScrollPane(JT);

getContentPane().add(jsp, BorderLayout.CENTER);

} 

public static void main(String args[]) {
    
    SimpleTable st = new SimpleTable();
    st.setVisible(true);

}

}
