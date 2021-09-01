package hello.thymleaf.validation.form;

import hello.thymleaf.item.UpdateCheck;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemUpdateForm {
    @NotNull(groups = UpdateCheck.class)
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range (min = 1000, max = 10000000)
    private Integer price;

    private Integer quantity;


}
