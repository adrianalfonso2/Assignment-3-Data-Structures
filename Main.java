
public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        DataLoader.loadData("amazon-product-data.csv", tree);
        String[] searchIds = {"4d1942be02252103bc227133970db3ec", "B01N4HS7B8", "26175eb509322b28aecf0965db4fcae1"};
        String[] insertIDs = {"1bc287229e08f42b571719d876fd9390", "c4516bf26345dc3de65d173bfdc3416z"};
        for (String productId : searchIds) {
            Product searchResult = tree.search(productId);
            if (searchResult != null) {
                System.out.println("Product information: " + searchResult);
            } else {
                System.out.println("Product ID " + productId + " not found.");
            }
        }
        for (String productId : insertIDs) {
            Product insertResult = tree.search(productId);
            if (insertResult != null) {
                System.err.println("A product with ID " + productId + " already exists.");
            }
            else {
                System.out.println("Inserting a new product with ID " + productId);
            }
        }
    }
}