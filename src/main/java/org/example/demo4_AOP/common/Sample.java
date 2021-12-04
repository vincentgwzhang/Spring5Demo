package org.example.demo4_AOP.common;

import java.util.Collection;

public interface Sample<T> {
    void sampleGenericMethod(T param);
    void sampleGenericCollectionMethod(Collection<T> param);
}
