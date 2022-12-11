// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
// получить?

// public static int sum2d(String[][] arr){ - NullPointerException(NPE) - чтение length у массива
// int sum = 0;
// for(int i = 0; i<arr.lengt; i++){ 
// for(int j= 0; j<5; j++){- ArrayIndexOutOfBoundsException-пытаемся обратиться к элементу массива по отрицательному или превышающему размер массива индексу.
// int val = Integer.parseInt(arr[i][j]); - NumberFormatException -неконтролируемое исключение – когда он не может преобразовать строку в тип числа .
// sum+=val;
// }
// }
// return sum;
// }
