class OuterClass {
    static interface NestedInterface {
        void show();
    }

    static class NestedClass implements NestedInterface {
        public void show() {
            System.out.println("Implementation");
        }
    }

    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        obj.show();
    }
}
