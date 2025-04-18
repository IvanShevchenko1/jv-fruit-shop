package core.basesyntax.service;

public class FruitTransaction {
    private Operation operation;
    private String fruit;
    private int quantity;

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private final String code;

        Operation(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static Operation fromCode(String code) {
            for (Operation op : values()) {
                if (op.code.equals(code)) {
                    return op;
                }
            }
            throw new IllegalArgumentException("Invalid operation code: " + code);
        }
    }

    public FruitTransaction(String operationCode, String fruit, int quantity) {
        this.operation = Operation.fromCode(operationCode);
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public FruitTransaction(Operation operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
