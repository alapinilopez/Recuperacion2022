package edu.poniperro.proxypattern.mrmeeseeks;

import java.util.Collection;

public class BoxProxyMrMeeseeks {

    private static BoxProxyMrMeeseeks boxProxyMrMeeseeks;
    private BoxProxyMrMeeseeks() {}
    public static BoxProxyMrMeeseeks getInstanceBox() {
        if (boxProxyMrMeeseeks == null) {
            boxProxyMrMeeseeks = new BoxProxyMrMeeseeks();
        }
        return boxProxyMrMeeseeks;
    }

    private MrMeeseeks createMrMeeseeks() {
        MrMeeseeks mrMeeseeks = new MrMeeseeks();
        return mrMeeseeks;

    }

    public void pushButton(Collection<MrMeeseeks> mrMeeseeks) {
        mrMeeseeks.add(createMrMeeseeks());
    }
}
