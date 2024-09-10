package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BasePriceDTO;
import org.openapitools.server.model.PriceQuarantineVerdictDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товар в карантине.
 */
public class QuarantineOfferDTO   {

    private String offerId;
    private BasePriceDTO currentPrice;
    private BasePriceDTO lastValidPrice;
    private List<@Valid PriceQuarantineVerdictDTO> verdicts;

    /**
     * Default constructor.
     */
    public QuarantineOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QuarantineOfferDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param currentPrice currentPrice
     * @param lastValidPrice lastValidPrice
     * @param verdicts Причины попадания товара в карантин.
     */
    public QuarantineOfferDTO(
        String offerId, 
        BasePriceDTO currentPrice, 
        BasePriceDTO lastValidPrice, 
        List<@Valid PriceQuarantineVerdictDTO> verdicts
    ) {
        this.offerId = offerId;
        this.currentPrice = currentPrice;
        this.lastValidPrice = lastValidPrice;
        this.verdicts = verdicts;
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
     * Get currentPrice
     * @return currentPrice
     */
    public BasePriceDTO getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BasePriceDTO currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Get lastValidPrice
     * @return lastValidPrice
     */
    public BasePriceDTO getLastValidPrice() {
        return lastValidPrice;
    }

    public void setLastValidPrice(BasePriceDTO lastValidPrice) {
        this.lastValidPrice = lastValidPrice;
    }

    /**
     * Причины попадания товара в карантин.
     * @return verdicts
     */
    public List<@Valid PriceQuarantineVerdictDTO> getVerdicts() {
        return verdicts;
    }

    public void setVerdicts(List<@Valid PriceQuarantineVerdictDTO> verdicts) {
        this.verdicts = verdicts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuarantineOfferDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
        sb.append("    lastValidPrice: ").append(toIndentedString(lastValidPrice)).append("\n");
        sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
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

