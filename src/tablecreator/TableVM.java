package tablecreator;

public class TableVM {

    private String name;
    private DataType type;
    private int size;
    private String value = "undefined";

    public TableVM(String name, DataType type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
        setSize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        int byteSize = 1024;
        switch (type) {
            case INTEGER:
                size = 4 * byteSize;
                break;
            case REAL:
                size = 8 * byteSize;
                break;
            case BOOLEAN:
                size = 1;
                break;
            case INTEGER_ARRAY:
                size = Integer.valueOf(value) * 4 * byteSize;
                break;
            case BOOLEAN_ARRAY:
                size = Integer.valueOf(value);
                break;
            case REAL_ARRAY:
                size = Integer.valueOf(value) * 8 * byteSize;
                break;
        }
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
