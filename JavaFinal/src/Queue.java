import java.util.PriorityQueue;

public class Queue {
    int[] ids = {1, 2, 3, 4, 5};
    String[] names = {"Кукла", "Мяч", "Машинка", "Пазл", "Конструктор"};
    double[] frequencies = {0.2, 0.3, 0.1, 0.2, 0.2};
    PriorityQueue toysQueue = new PriorityQueue((t1, t2)  -> Double.compare(t2.gerFrequency(), t1.gerFrequency()));
    for (int i = 0; i < ids.length; i++) {
    Toy toy = new Toy(ids[i], names[i], frequencies[i]);
    toysQueue.add(toy);
}
}
