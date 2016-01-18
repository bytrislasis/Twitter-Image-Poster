/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterapi;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Trayter {

    TwitterPoster t;
    static SystemTray trayIcon;

    Trayter(TwitterPoster T) throws IOException {
        
        this.t = t;
        int gelen = JOptionPane.showConfirmDialog(null, "Programdan Tamamen Çık \n NO Butonuna Tıklarsanız \n System Tray'de Çalışacaktır", "Uyarı", 0);

        switch (gelen) {
            case 2:
                break;
            case 1:
                this.ufalt();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public void ufalt() throws IOException {
        BufferedImage icon = ImageIO.read(ClassLoader.getSystemResource("twitterapi/resimler/tw.png"));
        if (!SystemTray.isSupported()) {
            JOptionPane.showMessageDialog(null, "Bir Hata Oluştu", "HATA", 0);
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon = new TrayIcon(icon);
        final SystemTray tray = SystemTray.getSystemTray();
        MenuItem showItem = new MenuItem("Show");
        showItem.addActionListener((ActionEvent ae) -> {
            t.setExtendedState(JFrame.MAXIMIZED_BOTH);
        });

        MenuItem aboutItem = new MenuItem("About");
        aboutItem.addActionListener((ActionEvent ae) -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.facebook.com/groups/turkcoders/"));
            } catch (IOException | URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Sorunlardan Dolayı Açılamadı", "HATA", 0);
            }
        });

        MenuItem exitItem = new MenuItem("Exit");
        exitItem.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        //popup.add(showItem);
        popup.add(aboutItem);
        popup.add(exitItem);

        trayIcon.setPopupMenu(popup);
        trayIcon.setToolTip("Twitter Poster Bytrislasis");
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            JOptionPane.showMessageDialog(null, "Bir Hata Oluştu", "HATA", 0);
        }
    }
}
