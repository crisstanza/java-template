package main.window;

import java.awt.Dimension;

import javax.swing.JFrame;

import main.model.MainModel;

public final class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final int WIDTH = 512;
	private static final int HEIGHT = 128;

	private MainModel model;

	public final MainModel getModel() {
		return model;
	}

	public final void setModel(final MainModel model) {
		this.model = model;
	}

	public final void init() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLocationRelativeTo(null);
		//
		refresh();
		//
		pack();
		setVisible(true);
	}

	private final void refresh() {
	}

}
