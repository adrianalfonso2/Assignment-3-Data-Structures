
public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        DataLoader.loadData("amazon-product-data.csv", tree);
        String[] searchIds = {"B01N5IB20Q", "B01N4HS7B8", "B01N5IB20R"};
        for (String productId : searchIds) {
            Product result = tree.search(productId);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("Product ID " + productId + " not found.");
            }
        }
    }
}