
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Finestra extends JFrame implements ActionListener {
	public JMenu menu;
	public JMenuBar mb;
	public JMenuItem inseriscia, inseriscid, inseriscip;
	public Finestra() {
		initc();
	}
	
	public void initc() {
		menu= new JMenu("Opzioni");
		mb= new JMenuBar ();
		inseriscia= new JMenuItem ("Inserisci alunno");
		inseriscid= new JMenuItem ("Inserisci docente");
		inseriscip= new JMenuItem ("Inserisci personale ATA");

		
		inseriscia.addActionListener(this);
		inseriscid.addActionListener(this);
		inseriscip.addActionListener(this);
		menu.add(inseriscia);
		menu.add(inseriscid);
		menu.add(inseriscip);
		mb.add(menu);
		this.setJMenuBar(mb);
		this.setLayout(new FlowLayout());
		this.setSize(600,600);	
	}
	
	public void Main(String[] args) {
		Finestra f= new Finestra();
		f.setVisible (true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Persona c= new Persona(nome, cognome, codfis, data);
		if(e.getSource().equals(inseriscia)) {
			JTextField noome = new JTextField(10);
			JTextField coognome = new JTextField(10);
			JTextField datta = new JTextField(10);
			JTextField coddicefiscale= new JTextField (15);
			JTextField classse= new JTextField (1);
			JTextField seziooonne= new JTextField (1);
			
			int reply;
			Object[]data= {"Nome: ",noome,"Cognome: ",coognome,"Data di nascita ",datta,"Codice Fiscale", coddicefiscale,"Classe", classse, "Sezione",seziooonne };
			
		}
		if(e.getSource().equals(inseriscid)) {
			JTextField noome = new JTextField(10);
			JTextField coognome = new JTextField(10);
			JTextField datta = new JTextField(10);
			JTextField coddicefiscale= new JTextField (15);
			JTextField concclassse= new JTextField (15);

			
			int reply;
			Object[]data= {"Nome: ",noome,"Cognome: ",coognome,"Data di nascita ",datta,"Codice Fiscale", coddicefiscale,"Classe", concclassse };
			
		}
		if(e.getSource().equals(inseriscia)) {
			JTextField noome = new JTextField(10);
			JTextField coognome = new JTextField(10);
			JTextField datta = new JTextField(10);
			JTextField coddicefiscale= new JTextField (15);
			JTextField rruolo= new JTextField (15);

			
			int reply;
			Object[]data= {"Nome: ",noome,"Cognome: ",coognome,"Data di nascita ",datta,"Codice Fiscale", coddicefiscale,"ruolo", rruolo};
			
		}
			
	}
		
	
	

}
