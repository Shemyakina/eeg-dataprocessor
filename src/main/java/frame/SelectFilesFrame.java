/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author kinnder@mail.ru
 */
public class SelectFilesFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 2531851493293695868L;

	/**
	 * Creates new form SelectFilesView
	 */
	public SelectFilesFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jtfIndicationsFile = new javax.swing.JTextField();
		jbSelectIndicationsFile = new javax.swing.JButton();
		jbSelectSamplesFile = new javax.swing.JButton();
		jtfSamplesFile = new javax.swing.JTextField();
		jlSamplesFile = new javax.swing.JLabel();
		jlIndicationsFile = new javax.swing.JLabel();
		jbDone = new javax.swing.JButton();
		jbCancel = new javax.swing.JButton();
		jlOutputFolder = new javax.swing.JLabel();
		jtfOutputFolder = new javax.swing.JTextField();
		jbSelectOutputFolder = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Выберите файлы");
		setResizable(false);
		setType(java.awt.Window.Type.UTILITY);

		jtfIndicationsFile.setText("jTextField2");

		jbSelectIndicationsFile.setText("jButton2");

		jbSelectSamplesFile.setText("jButton1");

		jtfSamplesFile.setText("jTextField1");

		jlSamplesFile.setText("Файл меток");

		jlIndicationsFile.setText("Файл данных");

		jbDone.setText("Готово");

		jbCancel.setText("Отмена");

		jlOutputFolder.setText("Папка результат");

		jtfOutputFolder.setText("jTextField3");

		jbSelectOutputFolder.setText("jButton5");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(143, Short.MAX_VALUE).addComponent(jbDone)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jbCancel).addGap(11, 11, 11))
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addComponent(jtfSamplesFile)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbSelectSamplesFile, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jtfOutputFolder).addComponent(jtfIndicationsFile))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jbSelectIndicationsFile,
												javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 27,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jbSelectOutputFolder, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 27,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jlIndicationsFile).addComponent(jlSamplesFile)
										.addComponent(jlOutputFolder))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addComponent(jlSamplesFile).addGap(4, 4, 4)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtfSamplesFile, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbSelectSamplesFile, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jlIndicationsFile).addGap(2, 2, 2)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtfIndicationsFile, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbSelectIndicationsFile))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jlOutputFolder).addGap(1, 1, 1)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jtfOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbSelectOutputFolder))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jbCancel).addComponent(jbDone))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SelectFilesFrame.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new SelectFilesFrame().setVisible(true);
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jbCancel;
	private javax.swing.JButton jbDone;
	private javax.swing.JButton jbSelectIndicationsFile;
	private javax.swing.JButton jbSelectOutputFolder;
	private javax.swing.JButton jbSelectSamplesFile;
	private javax.swing.JLabel jlIndicationsFile;
	private javax.swing.JLabel jlOutputFolder;
	private javax.swing.JLabel jlSamplesFile;
	private javax.swing.JTextField jtfIndicationsFile;
	private javax.swing.JTextField jtfOutputFolder;
	private javax.swing.JTextField jtfSamplesFile;
	// End of variables declaration//GEN-END:variables
}
