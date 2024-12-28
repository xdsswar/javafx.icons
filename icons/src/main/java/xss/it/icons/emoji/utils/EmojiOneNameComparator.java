
package xss.it.icons.emoji.utils;

import xss.it.icons.emoji.Emoji;

import java.util.Comparator;

/**
 *
 * @author XDSSWAR
 */
public class EmojiOneNameComparator implements Comparator<Emoji> {

    @Override
    public int compare(Emoji o1, Emoji o2) {
        if(o1 != null && o2 != null){
            return o1.name().compareTo(o2.name());
        }
        return 0;
    }
}
