package com.raams.model;

/**
 * Created by alex on 3/29/17.
 */
public class GenericModel<T> extends GenericModelSerializable {

    private T internal, fst, snd, trd;

    public boolean equals(Object other) {
        GenericModel<?> otherTriple = (GenericModel<?>) other; // warning; unchecked cast
        return (this.fst.equals(otherTriple.fst)
                && this.snd.equals(otherTriple.snd)
                && this.trd.equals(otherTriple.trd));
    }

    public GenericModel(T obj) {
        this.internal = obj;
    }

}
