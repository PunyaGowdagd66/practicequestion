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
                //if the current value is less than the next value then we need to subtract it from the total   
                //i<s.length()-1 is used to check if the current index is less than the length of the string -1 because we need to compare the current value with the next value
                total-=currentmap;
            }
            else{
                total+=currentmap;
            }
            //if the current value is greater than or equal to the next value then we need to add it to the total

        }
        return total;
    
    }
}