package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;

public class TacoAdapter implements Torta {
    Taco taco;
  
    public TacoAdapter (Taco taco) {
      this.taco = taco;
    }
  
    public void cutByHalf() {
    
    }
    
    public void fill() {
      this.taco.fill();
    }
    
    public void cover() {
      this.taco.fold();
    }
    
    public void printDescription() {
      this.taco.printDescription();
    }
}
