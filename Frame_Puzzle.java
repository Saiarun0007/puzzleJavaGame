import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.util.*;

public class Frame_Puzzle extends Frame implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Frame_Puzzle()
	{
		super("Puzzle frame");
		
		ArrayList<String> labels = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            labels.add(Integer.toString(i));
        }

        // Shuffle the labels randomly
        Collections.shuffle(labels);
		
		
		b1=new Button(labels.get(0));
		b1.setBounds(50, 100, 40, 40);
		b2=new Button(labels.get(1));
		b2.setBounds(100, 100, 40, 40);
		b3=new Button(labels.get(2));
		b3.setBounds(150, 100, 40, 40);
		b4=new Button(labels.get(3));
		b4.setBounds(50, 150, 40, 40);
		b5=new Button(labels.get(4));
		b5.setBounds(100, 150, 40, 40);
		b6=new Button(labels.get(5));
		b6.setBounds(150, 150, 40, 40);
		b7=new Button(labels.get(6));
		b7.setBounds(50, 200, 40, 40);
		b8=new Button("");
		b8.setBounds(100, 200, 40, 40);
		b9=new Button(labels.get(7));
		b9.setBounds(150, 200, 40, 40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String label=b1.getLabel();
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(label);
				b1.setLabel("");
			}
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(label);
				b1.setLabel("");
			}
		}
		if(e.getSource()==b2)
		{
			String label=b2.getLabel();
			if(b1.getLabel().equals(""))
			{
				b1.setLabel(label);
				b2.setLabel("");
			}
			if(b3.getLabel().equals(""))
			{
				b3.setLabel(label);
				b2.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(label);
				b2.setLabel("");
			}
		}
		
		if(e.getSource()==b3)
		{
			String label=b3.getLabel();
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(label);
				b3.setLabel("");
			}
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(label);
				b3.setLabel("");
			}
			
		}
		if(e.getSource()==b4)
		{
			String label=b4.getLabel();
			if(b1.getLabel().equals(""))
			{
				b1.setLabel(label);
				b4.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(label);
				b4.setLabel("");
			}
			if(b7.getLabel().equals(""))
			{
				b7.setLabel(label);
				b4.setLabel("");
			}
		}
		
		if(e.getSource()==b5)
		{
			String label=b5.getLabel();
			if(b2.getLabel().equals(""))
			{
				b2.setLabel(label);
				b5.setLabel("");
			}
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(label);
				b5.setLabel("");
			}
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(label);
				b5.setLabel("");
			}
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(label);
				b5.setLabel("");
			}
		}
		
		if(e.getSource()==b6)
		{
			String label=b6.getLabel();
			if(b3.getLabel().equals(""))
			{
				b3.setLabel(label);
				b6.setLabel("");
			}
			if(b5.getLabel().equals(""))
			{
				b5.setLabel(label);
				b6.setLabel("");
			}
			if(b9.getLabel().equals(""))
			{
				b9.setLabel(label);
				b6.setLabel("");
			}
		}
		if(e.getSource()==b7)
		{
			String label=b7.getLabel();
			if(b4.getLabel().equals(""))
			{
				b4.setLabel(label);
				b7.setLabel("");
			}
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(label);
				b7.setLabel("");
			}
		}
		
		
		/*if(e.getSource()==b8)
		{
			String label=b8.getLabel();
			if(b5.getLabel().equals(""))
			{
				b5.setLabel();
				b8.setLabel("");
			}
			if(b7.getLabel().equals(""))
			{
				b7.setLabel(label);
				b8.setLabel("");
			}
			if(b9.getLabel().equals(""))
			{
				b9.setLabel(label);
				b8.setLabel("");
			}
		}
		if(e.getSource()==b9)
		{
			String label=b9.getLabel();
			if(b6.getLabel().equals(""))
			{
				b6.setLabel(label);
				b9.setLabel("");
			}
			if(b8.getLabel().equals(""))
			{
				b8.setLabel(label);
				b9.setLabel("");
			}
		}*/
		
		
		if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            }
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            }
        }

        if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }

		
		
		if(b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") &&
				b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && 
				b7.getLabel().equals("7") && b8.getLabel().equals("8") &&b9.getLabel().equals(""))
		{
			JOptionPane.showMessageDialog(this,"congratulations ! you won game");
		}
		
	}
	public static void main(String[] args)
	{
		Frame_Puzzle v=new Frame_Puzzle();
				
		
	}

	

}
