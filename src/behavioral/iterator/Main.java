package behavioral.iterator;

class Main {
    public static void main(String[] args) {
        Integer[] numbersArray = {7, 2, 3, 4, 5};
        NumberCollection numbers = new NumberCollection(numbersArray);
        Iterator<Integer> iterator = numbers.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String[] nomes = {"Joao" , "Maria" , "Jose"};
        NomeCollection nomeCollection = new NomeCollection(nomes);
        Iterator<String> nomeIterator = nomeCollection.createIterator();
        while (nomeIterator.hasNext()){
            System.out.println(nomeIterator.next());
        }
    }
}