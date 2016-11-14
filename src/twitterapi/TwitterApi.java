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
                .setOAuthConsumerKey("Sizin ConsumerKey Bilginiz") //Size Ait bilgileri giriniz
                .setOAuthConsumerSecret("Sizin ConsumerSecret Bilginiz") //Size Ait bilgileri giriniz
                .setOAuthAccessToken("Sizin AccessToken Bilginiz")  //Size Ait bilgileri giriniz
                .setOAuthAccessTokenSecret("");
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
