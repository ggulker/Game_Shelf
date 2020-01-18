package com.mycompany.game_shelf;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;

/**
 *
 * @author GGulk
 */
public class AddGameFrame extends javax.swing.JFrame {
    HashMap<String, Game> selected = new HashMap<>();
    BufferedImage currentCover = null;
    /**
     * Creates new form AddGameFrame
     */
    public AddGameFrame() {
        initComponents();
        gameDesc.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameList = new javax.swing.JList<>();
        background = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gameDesc = new javax.swing.JTextArea();
        pubLabel = new javax.swing.JLabel();
        devLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(35, 39, 42));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        listPanel.setBackground(new java.awt.Color(44, 47, 51));
        listPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setBackground(new java.awt.Color(44, 57, 41));
        jScrollPane1.setBorder(null);

        gameList.setBackground(new java.awt.Color(35, 39, 42));
        gameList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gameList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        gameList.setForeground(new java.awt.Color(153, 153, 153));
        gameList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "The Witcher 3: Wild Hunt", "Anthem", "Persona 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        gameList.setToolTipText("");
        gameList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        gameList.setVerifyInputWhenFocusTarget(false);
        gameList.setVisibleRowCount(10);
        gameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                gameListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(gameList);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(listPanel);

        background.setBackground(new java.awt.Color(34, 39, 42));
        background.setForeground(new java.awt.Color(34, 39, 42));

        infoPanel.setBackground(new java.awt.Color(44, 47, 51));
        infoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane3.setBackground(new java.awt.Color(44, 47, 51));
        jScrollPane3.setBorder(null);

        gameDesc.setEditable(false);
        gameDesc.setBackground(new java.awt.Color(34, 39, 42));
        gameDesc.setColumns(20);
        gameDesc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gameDesc.setForeground(new java.awt.Color(153, 153, 153));
        gameDesc.setRows(10);
        gameDesc.setToolTipText("");
        gameDesc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gameDesc.setDisabledTextColor(new java.awt.Color(44, 47, 51));
        gameDesc.setSelectionColor(new java.awt.Color(44, 47, 51));
        jScrollPane3.setViewportView(gameDesc);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pubLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pubLabel.setForeground(new java.awt.Color(153, 153, 153));
        pubLabel.setText("Publisher(s)");

        devLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        devLabel.setForeground(new java.awt.Color(153, 153, 153));
        devLabel.setText("Developer(s) ");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pubLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pubLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(devLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        infoPanel.getAccessibleContext().setAccessibleParent(null);
        pubLabel.getAccessibleContext().setAccessibleName("pubLabel");
        devLabel.getAccessibleContext().setAccessibleName("devLabel");

        getContentPane().add(background);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gameListValueChanged
        gameList.setEnabled(false);
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

        try
        {
            BufferedImage cover = ImageIO.read(value.getImageUrl());
            currentCover = cover;
            PaintCover(this.getGraphics());
        }
        catch(IOException e)
        {
            System.out.print(e);
        }
        gameList.setEnabled(true);
    }//GEN-LAST:event_gameListValueChanged
    
    private void PaintCover(Graphics g)
    {
        Graphics2D draw = (Graphics2D)g;
        int x = 755;
        int y = 90;
        draw.drawImage(currentCover, x, y, this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel devLabel;
    private javax.swing.JTextArea gameDesc;
    private javax.swing.JList<String> gameList;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel pubLabel;
    // End of variables declaration//GEN-END:variables
}
