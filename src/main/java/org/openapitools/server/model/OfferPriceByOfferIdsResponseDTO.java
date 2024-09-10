package org.openapitools.server.model;

import java.time.OffsetDateTime;
import org.openapitools.server.model.PriceDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об установленной цене.
 */
public class OfferPriceByOfferIdsResponseDTO   {

    private String offerId;
    private PriceDTO price;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public OfferPriceByOfferIdsResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferPriceByOfferIdsResponseDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param price price
     * @param updatedAt Дата и время последнего обновления цены.
     */
    public OfferPriceByOfferIdsResponseDTO(
        String offerId, 
        PriceDTO price, 
        OffsetDateTime updatedAt
    ) {
        this.offerId = offerId;
        this.price = price;
        this.updatedAt = updatedAt;
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
     * Get price
     * @return price
     */
    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }

    /**
     * Дата и время последнего обновления цены.
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPriceByOfferIdsResponseDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

