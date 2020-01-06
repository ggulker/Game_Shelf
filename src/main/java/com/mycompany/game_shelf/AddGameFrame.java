package com.mycompany.game_shelf;

import java.util.HashMap;

/**
 *
 * @author GGulk
 */
public class AddGameFrame extends javax.swing.JFrame {
    HashMap<String, Game> selected = new HashMap<String, Game>();
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
        devLabel = new javax.swing.JLabel();
        pubLabel = new javax.swing.JLabel();

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

        devLabel.setText("Developer: ");

        pubLabel.setText("Publisher: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(devLabel)
                            .addComponent(pubLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        devLabel.getAccessibleContext().setAccessibleName("devLabel");
        pubLabel.getAccessibleContext().setAccessibleName("pubLabel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gameListValueChanged
        String name = gameList.getSelectedValue();
        Game value;
        boolean found = selected.containsKey(name);
        if(found)
        {
         value = selected.get(name);  
        }else
        {
         value = new Game(name);
         selected.put(name, value);
        }
        
        gameDesc.setText(value.getDesc());
        pubLabel.setText(value.getPub());
        devLabel.setText(value.getDev());
    }//GEN-LAST:event_gameListValueChanged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel devLabel;
    private javax.swing.JTextPane gameDesc;
    private javax.swing.JList<String> gameList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pubLabel;
    // End of variables declaration//GEN-END:variables
}
