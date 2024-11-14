import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        Iterator <String> iter = this.iterator();
        String val = iter.next();
        boolean ret = false;
        while(iter.hasNext()){
            if(val.equals("a")){
                val = iter.next();
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("e")){
                val = iter.next();
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("i")){
                val = iter.next();
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("o")){
                val = iter.next();
                iter.remove();
                ret = true;
            } //end else if
            else if(val.equals("u")){
                val = iter.next();
                iter.remove();
                ret = true;
            }// end else if
        }// end loop
        return ret;
    }// end method

    public boolean removeConsonants() {
        Iterator <String> iter = this.iterator();
        String val = iter.next();
        while(iter.hasNext()){
            if(val.equals("a")==false){
                if(val.equals("e")==false){
                    if(val.equals("i")==false){
                        if(val.equals("o")==false){
                            if(val.equals("u")==false){
                                val = iter.next();
                                iter.remove();
                            }// end if
                        } //end if
                    }//end if
                }//end if
            }// end if
            else{
                val = iter.next();
            }//end else
        }
        return false;
    }// end method

    public LinkedList<String> removeDuplicates() {
        LinkedList <String> rem = new LinkedList();
        Iterator <String> iter = this.iterator();
        for (int i =0; x<this.size();i++){
            String dub = this.get(i);
            boolean found = false;
            while(iter.hasNext()){
                if(dub.equals(iter.next())){
                    if(!found){
                        found=true;
                    }// end if
                    else{
                        rem.add(iter.previous());
                        iter.remove();
                    }// end else
                }// end while loop
            }// end for loop
        }// end method
        return rem;
    }

    public LinkedList<String> concatenateStrings() {
        LinkedList <String> fin = new LinkedList();
        Iterator <String> iter = this.iterator();
        String val = iter.next();
        while(iter.hasNext()){
            if (iter.hasPrevious()){
                String val2 = iter.next();
                val= val+val2;
                fin.add(val);
            }// end if
            else{
                fin.add(val);
                iter.next();
            }// end else
        }// end loop
        return fin;
    }//end method

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList <String> mixed = new LinkedList();
        Iterator <String> iter = this.iterator();
        Iterator <String> iter2 = list2.iterator();
        while (iter.hasNext()&&iter2.hasNext()){
            mixed.add(iter.next());
            mixed.add(iter2.next()); 
        }// end loop
        return mixed;
    }// end method

    public String toString() {
        Iterator <String> iter = this.iterator();
        String out = "";
        
        while (iter.hasNext()){
            out+=iter.next()+", ";
        }// end loop
        return out;
    }// end method
} // end SuperLinkedList