package org.openapitools.server.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TurnoverDTO;
import org.openapitools.server.model.WarehouseStockDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об остатках товара.
 */
public class WarehouseOfferDTO   {

    private String offerId;
    private TurnoverDTO turnoverSummary;
    private List<@Valid WarehouseStockDTO> stocks = new ArrayList<>();
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public WarehouseOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseOfferDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param turnoverSummary turnoverSummary
     * @param stocks Информация об остатках.
     * @param updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;. 
     */
    public WarehouseOfferDTO(
        String offerId, 
        TurnoverDTO turnoverSummary, 
        List<@Valid WarehouseStockDTO> stocks, 
        OffsetDateTime updatedAt
    ) {
        this.offerId = offerId;
        this.turnoverSummary = turnoverSummary;
        this.stocks = stocks;
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
     * Get turnoverSummary
     * @return turnoverSummary
     */
    public TurnoverDTO getTurnoverSummary() {
        return turnoverSummary;
    }

    public void setTurnoverSummary(TurnoverDTO turnoverSummary) {
        this.turnoverSummary = turnoverSummary;
    }

    /**
     * Информация об остатках.
     * @return stocks
     */
    public List<@Valid WarehouseStockDTO> getStocks() {
        return stocks;
    }

    public void setStocks(List<@Valid WarehouseStockDTO> stocks) {
        this.stocks = stocks;
    }

    /**
     * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
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
        sb.append("class WarehouseOfferDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    turnoverSummary: ").append(toIndentedString(turnoverSummary)).append("\n");
        sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
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

