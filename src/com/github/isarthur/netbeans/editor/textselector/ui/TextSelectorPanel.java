/*
 * Copyright 2020 Arthur Sadykov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.isarthur.netbeans.editor.textselector.ui;

import java.util.prefs.Preferences;
import org.openide.util.NbPreferences;

class TextSelectorPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 4080546854448278747L;
    private static final String COPY_TO_CLIPBOARD = "copyToClipboard";
    private final TextSelectorOptionsPanelController controller;

    TextSelectorPanel(TextSelectorOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyToClipboardCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(copyToClipboardCheckBox, org.openide.util.NbBundle.getMessage(TextSelectorPanel.class, "TextSelectorPanel.copyToClipboardCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyToClipboardCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyToClipboardCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        copyToClipboardCheckBox.setSelected(copyToClipboard(getPreferencesForModule()));
    }

    void store() {
        Preferences preferences = getPreferencesForModule();
        preferences.putBoolean(COPY_TO_CLIPBOARD, copyToClipboardCheckBox.isSelected());
    }

    boolean valid() {
        return true;
    }

    private Preferences getPreferencesForModule() {
        return NbPreferences.forModule(TextSelectorPanel.class);
    }

    private boolean copyToClipboard(Preferences preferences) {
        return preferences.getBoolean(COPY_TO_CLIPBOARD, true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox copyToClipboardCheckBox;
    // End of variables declaration//GEN-END:variables
}