package com.mycompany.game_shelf;

import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;

/**
 *
 * @author GGulk
 */
public class AddGameFrame extends javax.swing.JFrame {

    //holds games that have been selected to save time
    HashMap<String, Game> selected = new HashMap<>();
    //holds image of cover used on pane
    BufferedImage currentCover = null;
    //currently selected game in list
    Game currentSelect = null;
    //holds graphics of image
    Graphics2D screenCover = null;
    //need parent to add game to main menu
    MainMenuInterface parent;

    /**
     * Creates new form AddGameFrame
     *
     * @param p
     */
    public AddGameFrame(MainMenuInterface p) {
        parent = p;
        initComponents();

        //keeps description from making box too large
        gameDesc.setLineWrap(true);
        //infopanel wouldnt naturally allow this width
        infoPanel.setSize(582, 255);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusButtons = new javax.swing.ButtonGroup();
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
        nameLabel = new javax.swing.JLabel();
        statusPane = new javax.swing.JPanel();
        haveRadio = new javax.swing.JRadioButton();
        wantRadio = new javax.swing.JRadioButton();
        detailsCombo = new javax.swing.JComboBox<>();
        detailsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(35, 39, 42));
        setResizable(false);

        background.setBackground(new java.awt.Color(34, 39, 42));
        background.setForeground(new java.awt.Color(34, 39, 42));

        pubLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pubLabel.setForeground(new java.awt.Color(153, 153, 153));
        pubLabel.setText("Publisher:");
        pubLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        devLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        devLabel.setForeground(new java.awt.Color(153, 153, 153));
        devLabel.setText("Developer:");
        devLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        genreLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(153, 153, 153));
        genreLabel.setText("Genre:");
        genreLabel.setMaximumSize(new java.awt.Dimension(250, 0));

        modeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modeLabel.setForeground(new java.awt.Color(153, 153, 153));
        modeLabel.setText("Mode:");
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
            String[] strings = { "The Witcher 3: Wild Hunt", "Anthem", "Persona 5", "Super Mario Odyssey", "Golden Sun", "Overwatch" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        gameList.setSelectionBackground(new java.awt.Color(75, 163, 81));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameScroll)
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

        picPane.setBackground(new java.awt.Color(75, 163, 81));
        picPane.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        picPane.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout picPaneLayout = new javax.swing.GroupLayout(picPane);
        picPane.setLayout(picPaneLayout);
        picPaneLayout.setHorizontalGroup(
            picPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        picPaneLayout.setVerticalGroup(
            picPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        confirmButton.setBackground(new java.awt.Color(75, 163, 81));
        confirmButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setToolTipText("");
        confirmButton.setBorderPainted(false);
        confirmButton.setEnabled(false);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(75, 163, 81));
        closeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorderPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(153, 153, 153));

        statusPane.setBackground(new java.awt.Color(44, 47, 51));
        statusPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        haveRadio.setBackground(new java.awt.Color(153, 153, 153));
        statusButtons.add(haveRadio);
        haveRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        haveRadio.setForeground(new java.awt.Color(153, 153, 153));
        haveRadio.setText("Have");
        haveRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                haveRadioStateChanged(evt);
            }
        });

        wantRadio.setBackground(new java.awt.Color(153, 153, 153));
        statusButtons.add(wantRadio);
        wantRadio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        wantRadio.setForeground(new java.awt.Color(153, 153, 153));
        wantRadio.setText("Want");
        wantRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wantRadioStateChanged(evt);
            }
        });

        javax.swing.GroupLayout statusPaneLayout = new javax.swing.GroupLayout(statusPane);
        statusPane.setLayout(statusPaneLayout);
        statusPaneLayout.setHorizontalGroup(
            statusPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wantRadio)
            .addComponent(haveRadio)
        );
        statusPaneLayout.setVerticalGroup(
            statusPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPaneLayout.createSequentialGroup()
                .addComponent(wantRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(haveRadio)
                .addGap(25, 25, 25))
        );

        wantRadio.getAccessibleContext().setAccessibleDescription("");

        detailsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Started", "Not Finished", "Finished", "100% Complete" }));
        detailsCombo.setEnabled(false);

        detailsLabel.setForeground(new java.awt.Color(153, 153, 153));
        detailsLabel.setText("Details:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detailsLabel)
                                    .addComponent(detailsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(picPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(devLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusPane, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsLabel)
                        .addGap(4, 4, 4)
                        .addComponent(detailsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmButton)
                            .addComponent(closeButton)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(picPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
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

    //response to a new game selected
    private void gameListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_gameListValueChanged
        //make sure user doesnt select another game while loading
        gameList.setEnabled(false);

        //set game info
        setCurrentSelect();
        setScreenText();

        //attempt to paint cover on screen
        try {
            BufferedImage cover = ImageIO.read(currentSelect.getImageUrl());
            currentCover = cover;
            PaintCover();
        } catch (IOException e) {
            System.out.print(e);
        }

        if ((wantRadio.isSelected() || haveRadio.isSelected())) {
            confirmButton.setEnabled(true);
        } else {
            confirmButton.setEnabled(false);
        }
        gameList.setEnabled(true);
    }//GEN-LAST:event_gameListValueChanged

    //closes frame
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_closeButtonMouseClicked

    //if want is selected
    private void wantRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wantRadioStateChanged
        //if all requirments are selected confirm button enabled
        if ((wantRadio.isSelected() || haveRadio.isSelected()) && gameList.getSelectedIndex() != -1)
            confirmButton.setEnabled(true);
        else
            confirmButton.setEnabled(false);
    }//GEN-LAST:event_wantRadioStateChanged

    private void haveRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_haveRadioStateChanged
        // combo box should only enable if have selected
        detailsCombo.setEnabled(haveRadio.isSelected());

        //if all requirments are selected confirm button enabled
        if ((wantRadio.isSelected() || haveRadio.isSelected()) && gameList.getSelectedIndex() != -1)
            confirmButton.setEnabled(true);
        else
            confirmButton.setEnabled(false);
    }//GEN-LAST:event_haveRadioStateChanged

    //if confirm selected
    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        //if have selected get what combo is selected and set into game
        if (haveRadio.isSelected()) {
            currentSelect.setOwn(true);
            switch (detailsCombo.getSelectedIndex()) {
                case 0:
                    currentSelect.setStatus("Not Started");
                    break;

                case 1:
                    currentSelect.setStatus("Started");
                    break;

                case 2:
                    currentSelect.setStatus("Finished");
                    break;

                case 3:
                    currentSelect.setStatus("100% Complete");
                    break;
            }
        } else {
            //no status if dont own
            currentSelect.setOwn(false);
            currentSelect.setStatus(null);
        }
        //add game to main menu
        parent.addGame(currentSelect);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_confirmButtonMouseClicked

    //paint cover of game from image url 
    private void PaintCover() {
        screenCover = (Graphics2D) picPane.getGraphics();
        screenCover.drawImage(currentCover, 5, 5, 210, 300, picPane);
    }

    //set all screens text based on game selected
    private void setScreenText() {
        gameDesc.setText(currentSelect.getDesc());
        pubLabel.setText("Publisher: " + currentSelect.getPub());
        devLabel.setText("Developer: " + currentSelect.getDev());
        genreLabel.setText("Genre: " + currentSelect.getGenre());
        modeLabel.setText("Mode: " + currentSelect.getMode());
        nameLabel.setText(currentSelect.getName());
    }

    //create game or grab from hashmap if selected before
    private void setCurrentSelect() {
        String name = gameList.getSelectedValue();
        boolean found = selected.containsKey(name);
        if (found) {
            currentSelect = selected.get(name);
        } else {
            currentSelect = new Game(name);
            selected.put(name, currentSelect);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JScrollPane descScroll;
    private javax.swing.JComboBox<String> detailsCombo;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JLabel devLabel;
    private javax.swing.JTextArea gameDesc;
    private javax.swing.JList<String> gameList;
    private javax.swing.JScrollPane gameScroll;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JRadioButton haveRadio;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel modeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel picPane;
    private javax.swing.JLabel pubLabel;
    private javax.swing.ButtonGroup statusButtons;
    private javax.swing.JPanel statusPane;
    private javax.swing.JRadioButton wantRadio;
    // End of variables declaration//GEN-END:variables
}
