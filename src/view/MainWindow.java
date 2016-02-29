package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSobre = new JMenuItem("Manual");
		mnNewMenu.add(mntmSobre);
		
		JMenu mnDesenvolvedores = new JMenu("Cr\u00E9ditos");
		menuBar.add(mnDesenvolvedores);
		
		JMenuItem mntmDesenvolvedores = new JMenuItem("Desenvolvedores");
		mnDesenvolvedores.add(mntmDesenvolvedores);
		
		JButton btnAbrirImagem = new JButton("");
		btnAbrirImagem.setToolTipText("Abrir Imagem");
		btnAbrirImagem.setBounds(10, 32, 89, 88);
		frame.getContentPane().add(btnAbrirImagem);
		btnAbrirImagem.setIcon(new ImageIcon("imagens/add72.png"));
		
		JButton btnCriarImagem = new JButton("");
		btnCriarImagem.setToolTipText("Criar Imagem");
		btnCriarImagem.setBounds(122, 32, 89, 88);
		frame.getContentPane().add(btnCriarImagem);
		btnCriarImagem.setIcon(new ImageIcon("imagens/criar.png"));
		
		JButton btnAplicarFiltros = new JButton("");
		btnAplicarFiltros.setToolTipText("Aplicar Filtros");
		btnAplicarFiltros.setBounds(235, 32, 89, 88);
		btnAplicarFiltros.setIcon(new ImageIcon("imagens/filter.png"));
		frame.getContentPane().add(btnAplicarFiltros);
	}
}
