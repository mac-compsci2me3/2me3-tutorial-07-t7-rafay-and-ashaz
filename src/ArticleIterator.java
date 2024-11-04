import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements java.util.Iterator {
    int index;
    private List<ArticleComponent> components = new ArrayList<>();

    public ArticleIterator(List<ArticleComponent> components) {
        this.components = components;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < components.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArticleComponent next() {
        if (this.hasNext()) {
            return components.get(index++);
        } else {
            return null;
        }
    }
}
