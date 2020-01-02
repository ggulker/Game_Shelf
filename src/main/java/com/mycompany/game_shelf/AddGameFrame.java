package com.mycompany.game_shelf;

/**
 *
 * @author GGulk
 */
public class AddGameFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddGameFrame
     */
    public AddGameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gameList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        gameDesc = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        gameList.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        gameList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "The Witcher 3: Wild Hunt" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        gameList.setToolTipText("");
        gameList.setVerifyInputWhenFocusTarget(false);
        gameList.setVisibleRowCount(10);
        gameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                gameListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(gameList);

        jScrollPane2.setViewportView(gameDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gameListValueChanged
        String search = gameList.getSelectedValue();
        search = search.replace(' ', '_');
        WikiController gameInfo = new WikiController(search);
    }//GEN-LAST:event_gameListValueChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane gameDesc;
    private javax.swing.JList<String> gameList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
