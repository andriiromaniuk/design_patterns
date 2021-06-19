package design.patterns.factory.method.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AndroidPhone implements Phone{
    private String name;
    private int price;
    private int antutuResult;
    private String androidVersion;

    @Override
    public void showUi() {
        System.out.println("Flexible Android UI");
    }
}
