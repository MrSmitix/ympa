package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о предложении.
 */
public class ModelOfferDTO   {

    private Integer discount;
    private String name;
    private Integer pos;
    private BigDecimal preDiscountPrice;
    private BigDecimal price;
    private Long regionId;
    private BigDecimal shippingCost;
    private String shopName;
    private Integer shopRating;
    private Integer inStock;

    /**
     * Default constructor.
     */
    public ModelOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ModelOfferDTO.
     *
     * @param discount Скидка на предложение в процентах.
     * @param name Наименование предложения.
     * @param pos Позиция предложения в выдаче Маркета на карточке модели.
     * @param preDiscountPrice Цена предложения без скидки магазина.
     * @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
     * @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. 
     * @param shippingCost Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
     * @param shopName Название магазина (в том виде, в котором отображается на Маркете).
     * @param shopRating Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. 
     * @param inStock {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     */
    public ModelOfferDTO(
        Integer discount, 
        String name, 
        Integer pos, 
        BigDecimal preDiscountPrice, 
        BigDecimal price, 
        Long regionId, 
        BigDecimal shippingCost, 
        String shopName, 
        Integer shopRating, 
        Integer inStock
    ) {
        this.discount = discount;
        this.name = name;
        this.pos = pos;
        this.preDiscountPrice = preDiscountPrice;
        this.price = price;
        this.regionId = regionId;
        this.shippingCost = shippingCost;
        this.shopName = shopName;
        this.shopRating = shopRating;
        this.inStock = inStock;
    }



    /**
     * Скидка на предложение в процентах.
     * @return discount
     */
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * Наименование предложения.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Позиция предложения в выдаче Маркета на карточке модели.
     * @return pos
     */
    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    /**
     * Цена предложения без скидки магазина.
     * @return preDiscountPrice
     */
    public BigDecimal getPreDiscountPrice() {
        return preDiscountPrice;
    }

    public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
        this.preDiscountPrice = preDiscountPrice;
    }

    /**
     * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
     * @return regionId
     */
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    /**
     * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
     * @return shippingCost
     */
    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(BigDecimal shippingCost) {
        this.shippingCost = shippingCost;
    }

    /**
     * Название магазина (в том виде, в котором отображается на Маркете).
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
     * @return shopRating
     */
    public Integer getShopRating() {
        return shopRating;
    }

    public void setShopRating(Integer shopRating) {
        this.shopRating = shopRating;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     * @return inStock
     */
    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelOfferDTO {\n");
        
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
        sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
        sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
        sb.append("    shopRating: ").append(toIndentedString(shopRating)).append("\n");
        sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
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

