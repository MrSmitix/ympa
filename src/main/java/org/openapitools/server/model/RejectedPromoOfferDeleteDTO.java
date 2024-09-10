package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RejectedPromoOfferDeleteReasonType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товаре и ошибки, которые появились при его удалении.
 */
public class RejectedPromoOfferDeleteDTO   {

    private String offerId;
    private RejectedPromoOfferDeleteReasonType reason;

    /**
     * Default constructor.
     */
    public RejectedPromoOfferDeleteDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create RejectedPromoOfferDeleteDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param reason reason
     */
    public RejectedPromoOfferDeleteDTO(
        String offerId, 
        RejectedPromoOfferDeleteReasonType reason
    ) {
        this.offerId = offerId;
        this.reason = reason;
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
     * Get reason
     * @return reason
     */
    public RejectedPromoOfferDeleteReasonType getReason() {
        return reason;
    }

    public void setReason(RejectedPromoOfferDeleteReasonType reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RejectedPromoOfferDeleteDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

