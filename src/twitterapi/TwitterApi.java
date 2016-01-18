package twitterapi;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterApi {
    static int i = 0;

    public TwitterApi(File[] dosyalar, Integer KacSaniye, String mesaj) throws FileNotFoundException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("eY1hFp4P2HFHqVVGkviGmFyXv")
                .setOAuthConsumerSecret("vulIux5WpkTB2uzl2mF0TvxbuHh6MdE62nOxN1kXak8G7oTWdb")
                .setOAuthAccessToken("4756136914-dxavoMBZl2xKQs1FldjEfy4BIhtWLBWAWVWSMUX")
                .setOAuthAccessTokenSecret("1E9QmgNiQknJ8NCPiTMs43HO5oqZdRedo1jm4Ycfg2Uj3");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        for (File file : dosyalar) {
            TwitterPoster.table.setValueAt("SENDİNG...", i, 1);
            String message = mesaj;
            StatusUpdate status = new StatusUpdate(message);
            status.setMedia(file);
            try {
                twitter.updateStatus(status);
            } catch (TwitterException ex) {
                JOptionPane.showMessageDialog(null, "Bir Hata Oluştu", "HATA", 0);
                System.out.println(ex);
            }
            try {
                Thread.sleep(KacSaniye);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Bir Hata Oluştu", "HATA", 0);
            }
            TwitterPoster.table.setValueAt("POSTED OK", i, 1);

            i++;
            boolean test = TwitterPoster.silMod.isSelected();
            if (test) {
                file.delete();
            }
        }
        JOptionPane.showMessageDialog(null, "Twitter Upload İşlemleri Bitti", "Bilgi", 3);
        System.exit(0);
    }
}
