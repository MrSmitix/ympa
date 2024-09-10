package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferContentErrorDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */
public class UpdateOfferContentResultDTO   {

    private String offerId;
    private List<@Valid OfferContentErrorDTO> errors;
    private List<@Valid OfferContentErrorDTO> warnings;

    /**
     * Default constructor.
     */
    public UpdateOfferContentResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferContentResultDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param errors Ошибки — информация в каталоге не обновится.
     * @param warnings Предупреждения — информация в каталоге обновится.
     */
    public UpdateOfferContentResultDTO(
        String offerId, 
        List<@Valid OfferContentErrorDTO> errors, 
        List<@Valid OfferContentErrorDTO> warnings
    ) {
        this.offerId = offerId;
        this.errors = errors;
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
     * Ошибки — информация в каталоге не обновится.
     * @return errors
     */
    public List<@Valid OfferContentErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid OfferContentErrorDTO> errors) {
        this.errors = errors;
    }

    /**
     * Предупреждения — информация в каталоге обновится.
     * @return warnings
     */
    public List<@Valid OfferContentErrorDTO> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<@Valid OfferContentErrorDTO> warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferContentResultDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

