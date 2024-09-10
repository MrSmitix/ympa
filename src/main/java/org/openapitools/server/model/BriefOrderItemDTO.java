package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderItemInstanceDTO;
import org.openapitools.server.model.OrderVatType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о маркированном товаре.
 */
public class BriefOrderItemDTO   {

    private Long id;
    private OrderVatType vat;
    private Integer count;
    private BigDecimal price;
    private String offerName;
    private String offerId;
    private List<@Valid OrderItemInstanceDTO> instances;

    /**
     * Default constructor.
     */
    public BriefOrderItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create BriefOrderItemDTO.
     *
     * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
     * @param vat vat
     * @param count Количество единиц товара.
     * @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
     * @param offerName Название товара.
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param instances Переданные вами коды маркировки.
     */
    public BriefOrderItemDTO(
        Long id, 
        OrderVatType vat, 
        Integer count, 
        BigDecimal price, 
        String offerName, 
        String offerId, 
        List<@Valid OrderItemInstanceDTO> instances
    ) {
        this.id = id;
        this.vat = vat;
        this.count = count;
        this.price = price;
        this.offerName = offerName;
        this.offerId = offerId;
        this.instances = instances;
    }



    /**
     * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get vat
     * @return vat
     */
    public OrderVatType getVat() {
        return vat;
    }

    public void setVat(OrderVatType vat) {
        this.vat = vat;
    }

    /**
     * Количество единиц товара.
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Название товара.
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
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
     * Переданные вами коды маркировки.
     * @return instances
     */
    public List<@Valid OrderItemInstanceDTO> getInstances() {
        return instances;
    }

    public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
        this.instances = instances;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefOrderItemDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

