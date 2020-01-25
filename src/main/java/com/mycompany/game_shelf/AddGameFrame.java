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
    Game currentSelect = null;
    Graphics2D screenCover = null;
    /**
     * Creates new form AddGameFrame
     */
    public AddGameFrame() {
        initComponents();
        gameDesc.setLineWrap(true);
        infoPanel.setSize(582,255);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        background = new javax.swing.JPanel();
        pubLabel = new javax.swing.JLabel();
        devLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        modeLabel = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        gameScroll = new javax.swing.JScrollPane();
        gameList = new javax.swing.JList<>();
        infoPanel = new javax.swing.JPanel();
        descScroll = new javax.swing.JScrollPane();
        gameDesc = new javax.swing.JTextArea();
        picPane = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(35, 39, 42));

        background.setBackground(new java.awt.Color(34, 39, 42));
        background.setForeground(new java.awt.Color(34, 39, 42));

        pubLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pubLabel.setForeground(new java.awt.Color(153, 153, 153));
        pubLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        devLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        devLabel.setForeground(new java.awt.Color(153, 153, 153));
        devLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        genreLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(153, 153, 153));
        genreLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        modeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modeLabel.setForeground(new java.awt.Color(153, 153, 153));
        modeLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        listPanel.setBackground(new java.awt.Color(44, 47, 51));
        listPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        gameScroll.setBackground(new java.awt.Color(44, 57, 41));
        gameScroll.setBorder(null);

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
        gameList.setSelectedIndex(0);
        gameList.setSelectionBackground(new java.awt.Color(204, 204, 204));
        gameList.setVerifyInputWhenFocusTarget(false);
        gameList.setVisibleRowCount(10);
        gameList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                gameListValueChanged(evt);
            }
        });
        gameScroll.setViewportView(gameList);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        infoPanel.setBackground(new java.awt.Color(44, 47, 51));
        infoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        infoPanel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        infoPanel.setPreferredSize(new java.awt.Dimension(582, 254));

        descScroll.setBackground(new java.awt.Color(44, 47, 51));
        descScroll.setBorder(null);

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
        descScroll.setViewportView(gameDesc);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descScroll)
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        picPane.setBackground(new java.awt.Color(128, 0, 0));
        picPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        picPane.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout picPaneLayout = new javax.swing.GroupLayout(picPane);
        picPane.setLayout(picPaneLayout);
        picPaneLayout.setHorizontalGroup(
            picPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        picPaneLayout.setVerticalGroup(
            picPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        confirmButton.setBackground(new java.awt.Color(128, 0, 0));
        confirmButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setToolTipText("");
        confirmButton.setBorderPainted(false);

        closeButton.setBackground(new java.awt.Color(128, 0, 0));
        closeButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorderPainted(false);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(picPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(pubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton)
                            .addComponent(confirmButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(picPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pubLabel.getAccessibleContext().setAccessibleName("pubLabel");
        devLabel.getAccessibleContext().setAccessibleName("devLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gameListValueChanged
        changeGame();
    }//GEN-LAST:event_gameListValueChanged
    
    private void PaintCover(Graphics g, int x, int y)
    {
        screenCover = (Graphics2D)g;
        screenCover.drawImage(currentCover, x, y, this);
    }
    
    private void changeGame()
    {
        gameList.setEnabled(false);
        
        String name = gameList.getSelectedValue();
        boolean found = selected.containsKey(name);
        if(found)
        {
            currentSelect = selected.get(name);
        }else
        {
            currentSelect = new Game(name);
            selected.put(name, currentSelect);
        }

        gameDesc.setText(currentSelect.getDesc());
        pubLabel.setText("Publisher: " + currentSelect.getPub());
        devLabel.setText("Developer: " + currentSelect.getDev());
        genreLabel.setText("Genre: " + currentSelect.getGenre());
        modeLabel.setText("Mode: " + currentSelect.getMode());
        
        try
        {
            BufferedImage cover = ImageIO.read(currentSelect.getImageUrl());
            currentCover = cover;
            PaintCover(picPane.getGraphics(),30,8);
        }
        catch(IOException e)
        {
            System.out.print(e);
        }
        gameList.setEnabled(true);       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JScrollPane descScroll;
    private javax.swing.JLabel devLabel;
    private javax.swing.JTextArea gameDesc;
    private javax.swing.JList<String> gameList;
    private javax.swing.JScrollPane gameScroll;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JPanel picPane;
    private javax.swing.JLabel pubLabel;
    // End of variables declaration//GEN-END:variables
}
