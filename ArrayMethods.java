import java.util.Arrays;
/**
 * This is a blueprint including all the methods that will be used for this program, including average value, highest value,
 * the length of the array, detecting certain value from the original array and sorting.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 4/17/2025
 */
public class ArrayMethods
{
    private int[] myArray = {7,8,8,3,4,9,8,7};
    
    /**
     * This method calculates the length of the array.
     * @return the length of the array
     */
    public int count(){
        int count = 0; 
        for(int val :myArray){
            count++;
        }
        return count;
    }
    
    /**
     * This method calculates the total sum of the array.
     * @return the sum of the array
     */
    public int sum(){
        int sum = 0;
        for(int val :myArray){
            sum += val;
        }
        return sum;
    }
    
    /**
     * This method calculates the average of the array
     * @return the average value of the array
     */
    public double average(){
        return (double)sum()/count();
    }
    
    /**
     * This method will find the highest index from the array.
     * @return the value of the highest index in the array
     */
    public int findMax(){
        int max = myArray[0];
        for(int val : myArray){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
    
    /**
     * This method finds the index of the max value from the index.
     * @return the index of the highest value in the array
     */
    public int findIndexOfMax(){
        int ans = 0;
        for(int i = 0; i <count(); i++){
            if(findMax() == myArray[i]){
                ans = i;
            }
        }
        return ans;
    }
    
    /**
     * This method allows user to input a value and the program will detect the rightest index based 
     * on the entered value.
     * @param key the number user wants to detect
     * @return the index of the rightest number
     */
    public int findLast(int key){
        boolean flag = false;
        int answer = 0;
        
        for(int i = 0; i < count(); i++){
            if(key == myArray[i]){
                answer = i;
                flag = true;
            }
        }
        
        if(flag == false){
            answer = -1;
        }
        
        return answer;
    }
    
    /**
     * This method detects all the numbers the user enterd from the array, and wil accumulate the index in a new arrray
     * @param key the number entered by the user that will be detected
     * @return a new array with the index of the number entered by the user from the original array
     */
    public int[] findAll(int key){
        int count = 0, n = 0;
        
        for(int val: myArray){
            if (key == val){
                count++;
            }
        }
        
        int[] output = new int[count];
        
        for(int i = 0; i < count(); i++){
            if(key == myArray[i]){
                output[n] = i;
                n++;
            }
        }
        
        return output;
    }
    
    /**
     * This method will storage the array for other methods that use it
     * @return the original array
     */
    public int[] getArray(){
        return myArray;
    }
    
    /**
     * This method will generate a new array copying all the value from the original array
     * @return the new array copied from the old one
     */
    public int[] copyArray(){
        int[] newArray = Arrays.copyOf(myArray, myArray.length);
        return newArray;
    }
    
    /**
     * This method will print out the array and show all the element inside the array.
     * @param inArray the array that needs to be printed
     */
    public void print(int[] inArray){
        int i;
        System.out.print("{");
            
        for(i = 0; i < inArray.length - 1; i++){
            System.out.print(inArray[i] + ", ");
        }
        
        if(inArray.length > 0){
            System.out.print(inArray[i]);
        }
        
        System.out.println("}");
    }
    
    // public void sortArray(int[] inArray){
        // int[] outer = new int[inArray.length];
        // int tem = inArray[0];
        // for(int i = 0; i <= inArray.length-1; i++){
            // for(int j = i+1; j <= 
        // }
    // }
}
