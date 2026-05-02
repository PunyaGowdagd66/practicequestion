import java.util.HashMap;
class Romanintegers {
    public int romanToInt(String s) {
        int total=0;//intinization
        HashMap<Character,Integer>map=new HashMap<>();//()itz call the function and creates the object
        //hashmap<key,val>map=new ....creates the object..
        map.put('I',1);//map=your directory put =stored the value
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    
        for(int i=0;i<s.length();i++){//length() is used because the string is method function it call function 
            int currentmap=map.get(s.charAt(i));
            if(i<s.length()-1 &&currentmap<map.get(s.charAt(i+1))){
                total-=currentmap;
            }
            else{
                total+=currentmap;
            }

        }
        return total;
    
    }
}