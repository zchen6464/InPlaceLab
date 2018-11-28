right)
    {
        int pivot = arr[right];
        int i = left - 1;
        int temp;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[right];
        arr[right] = arr[i+1];
        arr[i+1] = temp;
        return (i+1);
    }

    public static void bubbleSort(String[] arr)
    {
        int swap = 1;
        while(swap != 0)
        {
            swap = 0;
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i].compareTo(arr[i-1]) < 0)
                {
                    String temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int num = i; num > 0; num--)
            {
                if(arr[num] < arr[num-1])
                {
                    int temp = arr[num];
                    arr[num] = arr[num-1];
                    arr[num-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selctionSort(double[] arr)
    {
        double selected = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            index = i;
            selected = arr[i];
            for(int x = i; x < arr.length; x++)
            {
                if(arr[i] > arr[x])
                {
                    selected = arr[x];
                    index = x;
                }
            }
            double temp = arr[i];
            arr[i] = selected;
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

