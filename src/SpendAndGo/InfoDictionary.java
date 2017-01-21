/*
 * Name: Ildar Nasirov
 * Project Name: Info Dictionary
 * Version: 1.0
 * ADT: Dictionary
 */
package SpendAndGo;

/**
 *
 * @author Ildar
 */
public class InfoDictionary{

    private String[][] table;
    private int pointer;
    private int size;

    public InfoDictionary(int size) {
        table = new String[size][2];
        this.size = size;
        this.pointer = 0;
    }

    public InfoDictionary(int size, int numberOfInfo) {
        table = new String[size][numberOfInfo];
        this.size = size;
        this.pointer = 0;
    }

    public String addInfo(String info, String value) {
        if (this.isFull()) {
            return "Dictionary is Full";
        } else {
            table[pointer][0] = info;
            table[pointer][1] = value;
            pointer++;
            return null;
        }
    }

    public void removeInfo(int index) {
        assert (index < this.size);

        table[index][0] = null;
        for (int i = 0; i < this.size; i++) {
            table[index][i] = null;
        }
        pointer--;
    }

    public void replaceInfo(int index, String name, String value) {
        assert (index < this.size);

        table[index][0] = name;
        table[index][1] = value;
    }

    public boolean isFull() {
        return (this.size == this.pointer);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (this.pointer == 0) {
            return "The Dictionary is actually empty";
        } else {
            String toReturn = "";
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < table[0].length; j++) {
                    toReturn = toReturn + table[i][j] + "\n";
                }
            }
            return toReturn;
        }
    }
}
