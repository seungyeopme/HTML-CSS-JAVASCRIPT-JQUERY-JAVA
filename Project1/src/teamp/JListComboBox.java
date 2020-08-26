package teamp;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
 
import javax.swing.*;
 
public class JListComboBox extends JFrame implements ItemListener {
    protected JList fruits;
    protected JComboBox colors;
    protected String item[]={"apple","banana","orange","pear"};
   
    public JListComboBox(){
        super("JList/ComboBox Demo");
        getContentPane().setLayout(new FlowLayout());
       
        fruits=new JList(item);
        fruits.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                //마우스가 클릭된 위치를 이용해 선택된 아이템의 인덱스를 얻는다.
                int index = fruits.locationToIndex(e.getPoint());
                if(e.getClickCount() ==2){
                    System.out.println("["+item[index]+"]");   
                }else if(e.getClickCount() ==1){
                    System.out.println(item[index]);
                }
            }
        });
        //한번에 보여지는 내용물의 개수
        fruits.setVisibleRowCount(3);
        //List옆에 스크롤바를 붙인다.
        JScrollPane sp = new JScrollPane(fruits);
       
        colors = new JComboBox();
        colors.addItem("White");
        colors.addItem("red");
        colors.addItem("green");
        colors.addItemListener((ItemListener) this);
       
        getContentPane().add(colors);
        getContentPane().add(sp);
       
 
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
       
    }
 
    public void itemStateChanged(ItemEvent e){
        Object o = e.getSource();
        if(o==colors){
            if(e.getStateChange()==ItemEvent.SELECTED){
                Object data = colors.getSelectedItem();
                System.out.println(data.toString());
            }
        }
    }
    //JComboBox와 JList의 내용물을 모두 출력하는 메소드
    public void printAllElement(){
       
        for(int i=0; i<colors.getItemCount();i++){
            System.out.println(colors.getItemAt(i).toString());
        }
        //JList의 경우 ListModel을 이용해서 얻어야한다.
        ListModel dm=(ListModel)fruits.getModel();
        for(int i=0; i<dm.getSize();i++){
            System.out.println(dm.getElementAt(i).toString());
        }
    }
    public static void main(String args[]){
        JListComboBox jlc = new JListComboBox();
        jlc.printAllElement();
    }
}