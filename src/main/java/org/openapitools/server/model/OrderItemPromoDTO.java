package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.OrderPromoType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
public class OrderItemPromoDTO   {

    private OrderPromoType type;
    private BigDecimal discount;
    private BigDecimal subsidy;
    private String shopPromoId;
    private String marketPromoId;

    /**
     * Default constructor.
     */
    public OrderItemPromoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemPromoDTO.
     *
     * @param type type
     * @param discount Размер пользовательской скидки в валюте покупателя. 
     * @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
     * @param shopPromoId Идентификатор акции поставщика. 
     * @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. 
     */
    public OrderItemPromoDTO(
        OrderPromoType type, 
        BigDecimal discount, 
        BigDecimal subsidy, 
        String shopPromoId, 
        String marketPromoId
    ) {
        this.type = type;
        this.discount = discount;
        this.subsidy = subsidy;
        this.shopPromoId = shopPromoId;
        this.marketPromoId = marketPromoId;
    }



    /**
     * Get type
     * @return type
     */
    public OrderPromoType getType() {
        return type;
    }

    public void setType(OrderPromoType type) {
        this.type = type;
    }

    /**
     * Размер пользовательской скидки в валюте покупателя. 
     * @return discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
     * @return subsidy
     */
    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * Идентификатор акции поставщика. 
     * @return shopPromoId
     */
    public String getShopPromoId() {
        return shopPromoId;
    }

    public void setShopPromoId(String shopPromoId) {
        this.shopPromoId = shopPromoId;
    }

    /**
     * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
     * @return marketPromoId
     */
    public String getMarketPromoId() {
        return marketPromoId;
    }

    public void setMarketPromoId(String marketPromoId) {
        this.marketPromoId = marketPromoId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemPromoDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    subsidy: ").append(toIndentedString(subsidy)).append("\n");
        sb.append("    shopPromoId: ").append(toIndentedString(shopPromoId)).append("\n");
        sb.append("    marketPromoId: ").append(toIndentedString(marketPromoId)).append("\n");
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

