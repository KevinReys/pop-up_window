package PopUpMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class Criando_JPopMenun {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criando_JPopMenun window = new Criando_JPopMenun();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Criando_JPopMenun() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 429, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPopupMenu menuPrincipal = new JPopupMenu();
		addPopup(frame.getContentPane(), menuPrincipal);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Contabilidade");
		menuPrincipal.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Compras");
		menuPrincipal.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("RH");
		menuPrincipal.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Tesouraria");
		menuPrincipal.add(mntmNewMenuItem_3);
		frame.getContentPane().setLayout(null);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
