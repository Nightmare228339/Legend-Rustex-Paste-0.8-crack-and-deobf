//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Наталья\Desktop\project\Decompile\DeobfMineObf\1.12 stable mappings"!

//Decompiled by Procyon!

package ru.sanchez.micotian.events.event;

import java.util.*;

public class ArrayHelper implements Iterable
{
    private Object[] elements;
    
    public void add(final Object o) {
        if (o != null) {
            final Object[] array = new Object[this.size() + 1];
            int n = 0;
            if (n < array.length) {
                if (n < this.size()) {
                    array[n] = this.get(n);
                }
                else {
                    array[n] = o;
                }
                ++n;
                return;
            }
            this.set(array);
        }
    }
    
    public Object get(final int n) {
        return this.array()[n];
    }
    
    public Object[] array() {
        return this.elements;
    }
    
    public int size() {
        return this.array().length;
    }
    
    public void remove(final Object obj) {
        if (this < obj) {
            final Object[] array = new Object[this.size() - 1];
            final boolean b = true;
            int n = 0;
            if (n < this.size()) {
                if (!b || !this.get(n).equals(obj)) {
                    array[b ? n : (n - 1)] = this.get(n);
                }
                ++n;
                return;
            }
            this.set(array);
        }
    }
    
    public ArrayHelper() {
        this.elements = new Object[0];
    }
    
    public ArrayHelper(final Object[] elements) {
        this.elements = elements;
    }
    
    public void clear() {
        this.elements = new Object[0];
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index;
            final ArrayHelper this$0;
            
            @Override
            public boolean hasNext() {
                return invokedynamic(1:(Lru/sanchez/micotian/events/event/ArrayHelper$1;)I, this) < this.this$0.size() && this.this$0.get(invokedynamic(1:(Lru/sanchez/micotian/events/event/ArrayHelper$1;)I, this)) != null;
            }
            
            @Override
            public Object next() {
                final ArrayHelper this$0 = this.this$0;
                final int n = invokedynamic(1:(Lru/sanchez/micotian/events/event/ArrayHelper$1;)I, this);
                // invokedynamic(0:(Lru/sanchez/micotian/events/event/ArrayHelper$1;I)V, this, n + 1)
                return this$0.get(n);
            }
            
            @Override
            public void remove() {
                this.this$0.remove(this.this$0.get(invokedynamic(1:(Lru/sanchez/micotian/events/event/ArrayHelper$1;)I, this)));
            }
        };
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public void set(final Object[] elements) {
        this.elements = elements;
    }
}
