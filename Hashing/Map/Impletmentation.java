package Hashing.Map;

import java.util.*;

public class Impletmentation {
    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchINLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehas() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // 0 to size-1
            int di = searchINLL(key, bi); // valid -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehas();
            }
        }

        public boolean containsKey(K key) {
            return false;
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> ketSet() {
            return null;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("Chine", 50);
        hm.put("Indoneia", 100);
        hm.put("Nepal", 150);
        System.out.println(hm);
    }
}