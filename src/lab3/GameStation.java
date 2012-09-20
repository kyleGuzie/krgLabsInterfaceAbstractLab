/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author bossMan
 */
public abstract class GameStation implements BluRayPlayer{
    private BluRayPlayer bg;
    private String games;
    private String format;
    private String Hd;

    public String getGames() {
        return games;
    }

    public String getFormat() {
        return format;
    }

    public String getHd() {
        return Hd;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setHd(String Hd) {
        this.Hd = Hd;
    }

    public BluRayPlayer getBg() {
        return bg;
    }

    public void setBg(BluRayPlayer bg) {
        this.bg = bg;
    }




}
