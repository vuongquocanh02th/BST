public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Fuck");
        tree.insert("Bob");
        tree.insert("Peter");
        tree.insert("Mary");
        System.out.println("Inorder sorted: ");
        tree.inorder();
        System.out.println("The number of node is: " + tree.getSize());
    }
}