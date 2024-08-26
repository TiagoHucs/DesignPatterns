package behavioral.iterator;

public class NumberCollection implements Collection<Integer>{
    Integer[] numbers;

    NumberCollection(Integer[] numbers){
        this.numbers = numbers;
    }


    @Override
    public Iterator<Integer> createIterator() {
        return new NumberInterator();
    }

    class NumberInterator implements Iterator<Integer>{
        private int index;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return hasNext() ? numbers[index++] : null;
        }
    }
}
