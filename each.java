public class each {
    public static void main(String[]arg){
        // Creating an array
int arr[] = {1, 2, 3, 4, 5};

// Using for loop on the array
for (int elem: arr) {
  elem = elem * 10;
}
// Printing the values
for (int elem: arr) {
  System.out.print(elem + ", ");
}


// Using for each loop on the array
for(int i = 0; i < arr.length; i++){
    arr[i] = arr[i] * 10;
}
// Printing the values
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + ", ");
}

    }
    
}
