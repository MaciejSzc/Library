package pl.maciejszczesny.JCommerceLibrary.models.forms;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class CustomerForm {
    private String name;
    private String surname;
    @Max(9)
    @Min(9)
    private int mobile;

}
