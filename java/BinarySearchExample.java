public class BinarySearchExample
{
   public static void binarySearch(int[] arrNumbers, int start, int end, int keyElement)
   {
      int middle = (start + end) / 2;
      while(start <= end)
      {
         if(arrNumbers[middle] < keyElement)
         {
            start = middle + 1;
         }
         else if(arrNumbers[middle] == keyElement)
         {
            System.out.println("Element found at index: " + middle);
            break;
         }
         else
         {
            end = middle - 1;
         }
         middle = (start + end) / 2;
      }
      if(start > end)
      {
         System.out.println("Element not found!");
      }
   }
   public static void main(String[] args)
   {
      int[] arrNumbers = {14,15,16,17,18};
      int keyElement = 16;
      int end = arrNumbers.length - 1;
      binarySearch(arrNumbers, 0, end, keyElement);
   }
}
