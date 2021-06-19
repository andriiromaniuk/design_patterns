package design.patterns.factory.method.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WindowsPhone implements Phone{
    private String name;
    private int price;
    private int antutuResult;
    private boolean discontinuedProduction = true;

    @Override
    public void showUi() {
        System.out.println("Pretty unusable Microsoft Windows UI");
    }
}
