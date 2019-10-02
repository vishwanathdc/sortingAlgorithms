public class SortAlgoFactory {
    public Sort getInstance(String name){
        if(name == "selection")
            return new SelectionSort();
        else if(name == "insertion")
            return new InsertionSort();
        else if(name == "merge")
            return new mergeSort();
        return null;
    }
}
