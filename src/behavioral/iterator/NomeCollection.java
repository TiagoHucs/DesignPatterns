package behavioral.iterator;

public class NomeCollection implements Collection<String>{
    String[] nomes;

    NomeCollection(String[] nomes){
        this.nomes = nomes;
    }


    @Override
    public Iterator<String> createIterator() {
        return new NomeIterator();
    }

    class NomeIterator implements Iterator<String>{
        private int index;

        @Override
        public boolean hasNext() {
            return index < nomes.length;
        }

        @Override
        public String next() {
            return hasNext() ? nomes[index++] : null;
        }
    }

}
