package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PromoOfferUpdateWarningDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Описание предупреждения, которое появилось при добавлении товара.
 */
public class WarningPromoOfferUpdateDTO   {

    private String offerId;
    private List<@Valid PromoOfferUpdateWarningDTO> warnings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public WarningPromoOfferUpdateDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarningPromoOfferUpdateDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param warnings Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
     */
    public WarningPromoOfferUpdateDTO(
        String offerId, 
        List<@Valid PromoOfferUpdateWarningDTO> warnings
    ) {
        this.offerId = offerId;
        this.warnings = warnings;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
     * @return warnings
     */
    public List<@Valid PromoOfferUpdateWarningDTO> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<@Valid PromoOfferUpdateWarningDTO> warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarningPromoOfferUpdateDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

