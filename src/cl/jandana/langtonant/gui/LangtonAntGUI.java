package cl.jandana.langtonant.gui;

import cl.jandana.langtonant.logic.LangtonAnt;
import cl.jandana.langtonant.logic.Board;

/**
 *
 * @author Javier
 */
public class LangtonAntGUI extends javax.swing.JFrame {

    private final int columnas = 100;
    private final int filas = 100;
    private static LangtonAnt langtonAnt;
    private static Board board;

    public LangtonAntGUI() {
        initComponents();
        board = new Board(columnas, filas);
        //muestra el panel
        panel.getImagen();
        panel.init(board);
        langtonAnt = new LangtonAnt(board, panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new cl.jandana.langtonant.util.DynamicPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LangtonAntGUI theApp = new LangtonAntGUI();
        theApp.show();
        langtonAnt.stop();
        langtonAnt.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cl.jandana.langtonant.util.DynamicPanel panel;
    // End of variables declaration//GEN-END:variables
}
