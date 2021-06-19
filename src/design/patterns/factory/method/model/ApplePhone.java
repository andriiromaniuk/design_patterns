package design.patterns.factory.method.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApplePhone implements Phone{
    private String name;
    private int price;
    private int antutuResult;
    private boolean newest;

    @Override
    public void showUi() {
        System.out.println("Kinda fancy UI");
    }
}
