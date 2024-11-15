import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        //several if statements to check if each letter is a vowel or not and removes it if it is
        Iterator <String> iter = this.iterator();
        String val = "";
        boolean ret = false;
        while(iter.hasNext()){
            val = iter.next().toLowerCase();
            if(val.equals("a")){
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("e")){
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("i")){
                iter.remove();
                ret = true;
            }// end else if
            else if(val.equals("o")){
                iter.remove();
                ret = true;
            } //end else if
            else if(val.equals("u")){
                iter.remove();
                ret = true;
            }// end else if
        }// end loop
        return ret;
    }// end method

    public boolean removeConsonants() {
        //Utilizes a loop to find each consonant in the list and removes each one after finding
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
        //Uses two iterators in a loop and constantly checks if they are equal to each other, if they are it removes the duplicate from the first iterator
        LinkedList <String> rem = new LinkedList<String>();
        ListIterator <String> iter = this.listIterator();
        for (int i =0; i<this.size();i++){
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
        //piles each string on top of each other starting from the beginning and going to the end
        LinkedList <String> fin = new LinkedList<String>();
        ListIterator <String> iter = this.listIterator();
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
        //method receives another list and by using a loop sends out a combined version after adding the elements from each list to the new list
        LinkedList <String> mixed = new LinkedList<String>();
        ListIterator <String> iter = this.listIterator();
        ListIterator <String> iter2 = list2.listIterator();
        while (iter.hasNext()&&iter2.hasNext()){
            mixed.add(iter.next());
            mixed.add(iter2.next()); 
        }// end loop
        return mixed;
    }// end method

    public String toString() {
        //Uses a loop to return a string to output later on in the tester file
        Iterator <String> iter = this.iterator();
        String out = "";
        while (iter.hasNext()){
            out+=iter.next()+", ";
        }// end loop
        return out;
    }// end method
} // end SuperLinkedList