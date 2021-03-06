package frame;

import application.ApplicationData;
import event.FeatureStatus;
import feature.AnalyzeSamplesFile;
import feature.PrepareSeparateTestFiles;

import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

public class EEGDataProcessorFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = -5065287789826423012L;

	/**
	 * Creates new form EEGDataProcessorFrame
	 */
	public EEGDataProcessorFrame() {
		initComponents();
	}

	private ApplicationData applicationData;

	private final static int ROW_ID_SIGNAL = 0;
	private final static int ROW_ID_INTERVAL_LEFT = 1;
	private final static int ROW_ID_INTERVAL_RIGHT = 2;
	private final static int ROW_ID_DURATION_MIN = 3;
	private final static int ROW_ID_TRIGGERTIME_AVERAGE = 4;

	public EEGDataProcessorFrame(ApplicationData applicationData) {
		this();
		this.applicationData = applicationData;
		TableModel model = jtParameters.getModel();
		model.setValueAt(applicationData.getSignalTime(), ROW_ID_SIGNAL, 1);
		model.setValueAt(applicationData.getIntervalLeft(), ROW_ID_INTERVAL_LEFT, 1);
		model.setValueAt(applicationData.getIntervalRight(), ROW_ID_INTERVAL_RIGHT, 1);
		model.setValueAt(applicationData.getDurationMin(), ROW_ID_DURATION_MIN, 1);
		model.setValueAt(applicationData.getTriggerTimeAverage(), ROW_ID_TRIGGERTIME_AVERAGE, 1);

		model.addTableModelListener((TableModelEvent e) -> {
			if (e.getType() == TableModelEvent.UPDATE) {
				switch (e.getFirstRow()) {
				case ROW_ID_SIGNAL:
					applicationData.setSignalTime(Long.parseLong((String) model.getValueAt(ROW_ID_SIGNAL, 1)));
					break;
				case ROW_ID_INTERVAL_LEFT:
					applicationData.setIntervalLeft(Long.parseLong((String) model.getValueAt(ROW_ID_INTERVAL_LEFT, 1)));
					break;
				case ROW_ID_INTERVAL_RIGHT:
					applicationData
							.setIntervalRight(Long.parseLong((String) model.getValueAt(ROW_ID_INTERVAL_RIGHT, 1)));
					break;
				case ROW_ID_DURATION_MIN:
					applicationData.setDurationMin(Long.parseLong((String) model.getValueAt(ROW_ID_DURATION_MIN, 1)));
					break;
				case ROW_ID_TRIGGERTIME_AVERAGE:
					applicationData.setTriggerTimeAverage(
							Long.parseLong((String) model.getValueAt(ROW_ID_TRIGGERTIME_AVERAGE, 1)));
					break;
				}
			}
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jtaOutput = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jtParameters = new javax.swing.JTable();
		jmbMainMenu = new javax.swing.JMenuBar();
		jmFile = new javax.swing.JMenu();
		jmiSelectFiles = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		jmiExit = new javax.swing.JMenuItem();
		jmTask = new javax.swing.JMenu();
		jmiAnalyzeSamplesFile = new javax.swing.JMenuItem();
		jmiPrepareSeparateTestFiles = new javax.swing.JMenuItem();
		jmHelp = new javax.swing.JMenu();
		jmiHelp = new javax.swing.JMenuItem();
		jmiAbout = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("EEGDataProcessor");
		setLocationByPlatform(true);

		jtaOutput.setEditable(false);
		jtaOutput.setColumns(20);
		jtaOutput.setRows(5);
		jScrollPane1.setViewportView(jtaOutput);

		jtParameters.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "signalTime", "" }, { "interval_left", null }, { "interval_right", null },
						{ "duration_min", null }, { "triggerTime_average", null } },
				new String[] { "Параметр", "Значение" }) {
			private static final long serialVersionUID = -7692149791349207355L;
			Class<?>[] types = new Class[] { java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, true };

			public Class<?> getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jtParameters);

		jmFile.setText("Файл");

		jmiSelectFiles.setText("Выбрать файлы...");
		jmiSelectFiles.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiSelectFilesActionPerformed(evt);
			}
		});
		jmFile.add(jmiSelectFiles);
		jmFile.add(jSeparator1);

		jmiExit.setText("Выход");
		jmiExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiExitActionPerformed(evt);
			}
		});
		jmFile.add(jmiExit);

		jmbMainMenu.add(jmFile);

		jmTask.setText("Задача");

		jmiAnalyzeSamplesFile.setText("Анализ файла меток");
		jmiAnalyzeSamplesFile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiAnalyzeSamplesFileActionPerformed(evt);
			}
		});
		jmTask.add(jmiAnalyzeSamplesFile);

		jmiPrepareSeparateTestFiles.setText("Подготовить файлы \"Отдельная проба\"");
		jmiPrepareSeparateTestFiles.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiPrepareSeparateTestFilesActionPerformed(evt);
			}
		});
		jmTask.add(jmiPrepareSeparateTestFiles);

		jmbMainMenu.add(jmTask);

		jmHelp.setText("?");

		jmiHelp.setText("Справка");
		jmHelp.add(jmiHelp);

		jmiAbout.setText("О программе...");
		jmHelp.add(jmiAbout);

		jmbMainMenu.add(jmHelp);

		setJMenuBar(jmbMainMenu);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jmiAnalyzeSamplesFileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmiAnalyzeSamplesFileActionPerformed
		java.awt.EventQueue.invokeLater(() -> {
			AnalyzeSamplesFile feature = new AnalyzeSamplesFile(applicationData);
			feature.addFeatureStatusListener((FeatureStatus event) -> {
				if (event.getType() == FeatureStatus.COMPLETED) {
					TableModel model = jtParameters.getModel();
					model.setValueAt(Long.toString(applicationData.getIntervalLeft()), ROW_ID_INTERVAL_LEFT, 1);
					model.setValueAt(Long.toString(applicationData.getIntervalRight()), ROW_ID_INTERVAL_RIGHT, 1);
					model.setValueAt(Long.toString(applicationData.getDurationMin()), ROW_ID_DURATION_MIN, 1);
					model.setValueAt(Long.toString(applicationData.getTriggerTimeAverage()), ROW_ID_TRIGGERTIME_AVERAGE,
							1);
				}
			});
			new TaskProgressFrame(feature).setVisible(true);
		});
	}// GEN-LAST:event_jmiAnalyzeSamplesFileActionPerformed

	private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmiExitActionPerformed
		this.dispose();
	}// GEN-LAST:event_jmiExitActionPerformed

	private void jmiSelectFilesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmiSelectFilesActionPerformed
		java.awt.EventQueue.invokeLater(() -> {
			new SelectFilesFrame(applicationData).setVisible(true);
		});
	}// GEN-LAST:event_jmiSelectFilesActionPerformed

	private void jmiPrepareSeparateTestFilesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmiPrepareSeparateTestFilesActionPerformed
		java.awt.EventQueue.invokeLater(() -> {
			PrepareSeparateTestFiles feature = new PrepareSeparateTestFiles(applicationData);
			new TaskProgressFrame(feature).setVisible(true);
		});
	}// GEN-LAST:event_jmiPrepareSeparateTestFilesActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JMenu jmFile;
	private javax.swing.JMenu jmHelp;
	private javax.swing.JMenu jmTask;
	private javax.swing.JMenuBar jmbMainMenu;
	private javax.swing.JMenuItem jmiAbout;
	private javax.swing.JMenuItem jmiAnalyzeSamplesFile;
	private javax.swing.JMenuItem jmiExit;
	private javax.swing.JMenuItem jmiHelp;
	private javax.swing.JMenuItem jmiPrepareSeparateTestFiles;
	private javax.swing.JMenuItem jmiSelectFiles;
	private javax.swing.JTable jtParameters;
	private javax.swing.JTextArea jtaOutput;
	// End of variables declaration//GEN-END:variables
}
