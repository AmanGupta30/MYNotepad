package note;

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

public class MyHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
    
    public MyHighlighter(Color color) {
        super(color);
    }
    
    
}
