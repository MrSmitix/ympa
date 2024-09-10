package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemDetailDTO;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderItemInstanceType;
import org.openapitools.model.OrderItemPromoDTO;
import org.openapitools.model.OrderItemSubsidyDTO;
import org.openapitools.model.OrderVatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров в заказе.
 **/
@ApiModel(description="Список товаров в заказе.")

public class OrderItemDTO  {
  
  @ApiModelProperty(value = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
 /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  **/
  private Long id;

  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String offerId;

  @ApiModelProperty(value = "Название товара.")
 /**
   * Название товара.
  **/
  private String offerName;

  @ApiModelProperty(value = "Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). ")
  @Valid
 /**
   * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
  **/
  private BigDecimal price;

  @ApiModelProperty(value = "Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ")
  @Valid
 /**
   * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
  **/
  private BigDecimal buyerPrice;

  @ApiModelProperty(value = "Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @Valid
 /**
   * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
  **/
  private BigDecimal buyerPriceBeforeDiscount;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
  **/
  private BigDecimal priceBeforeDiscount;

  @ApiModelProperty(value = "Количество единиц товара.")
 /**
   * Количество единиц товара.
  **/
  private Integer count;

  @ApiModelProperty(value = "")
  @Valid
  private OrderVatType vat;

  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  **/
  private String shopSku;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
  **/
  private BigDecimal subsidy;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
  **/
  private String partnerWarehouseId;

  @ApiModelProperty(value = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
  @Valid
 /**
   * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  **/
  private List<@Valid OrderItemPromoDTO> promos;

  @ApiModelProperty(value = "Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. ")
  @Valid
 /**
   * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
  **/
  private List<@Valid OrderItemInstanceDTO> instances;

  @ApiModelProperty(value = "Информация об удалении товара из заказа. ")
  @Valid
 /**
   * Информация об удалении товара из заказа. 
  **/
  private List<@Valid OrderItemDetailDTO> details;

  @ApiModelProperty(value = "Список субсидий по типам.")
  @Valid
 /**
   * Список субсидий по типам.
  **/
  private List<@Valid OrderItemSubsidyDTO> subsidies;

  @ApiModelProperty(value = "Список необходимых маркировок товара.")
  @Valid
 /**
   * Список необходимых маркировок товара.
  **/
  private List<OrderItemInstanceType> requiredInstanceTypes;
 /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  @JsonProperty("offerId")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Название товара.
   * @return offerName
  **/
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
   * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). 
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
   * @return buyerPrice
  **/
  @JsonProperty("buyerPrice")
  public BigDecimal getBuyerPrice() {
    return buyerPrice;
  }

  public void setBuyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
  }

  public OrderItemDTO buyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
    return this;
  }

 /**
   * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
   * @return buyerPriceBeforeDiscount
  **/
  @JsonProperty("buyerPriceBeforeDiscount")
  public BigDecimal getBuyerPriceBeforeDiscount() {
    return buyerPriceBeforeDiscount;
  }

  public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
  }

  public OrderItemDTO buyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
   * @return priceBeforeDiscount
  **/
  @JsonProperty("priceBeforeDiscount")
  public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }

  public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
  }

  public OrderItemDTO priceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
    return this;
  }

 /**
   * Количество единиц товара.
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Get vat
   * @return vat
  **/
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }

  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  public OrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

 /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public OrderItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
   * @return subsidy
  **/
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  public OrderItemDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
   * @return partnerWarehouseId
  **/
  @JsonProperty("partnerWarehouseId")
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }

  public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

  public OrderItemDTO partnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
    return this;
  }

 /**
   * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
   * @return promos
  **/
  @JsonProperty("promos")
  public List<@Valid OrderItemPromoDTO> getPromos() {
    return promos;
  }

  public void setPromos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
  }

  public OrderItemDTO promos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  public OrderItemDTO addPromosItem(OrderItemPromoDTO promosItem) {
    this.promos.add(promosItem);
    return this;
  }

 /**
   * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. 
   * @return instances
  **/
  @JsonProperty("instances")
  public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  public OrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public OrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

 /**
   * Информация об удалении товара из заказа. 
   * @return details
  **/
  @JsonProperty("details")
  public List<@Valid OrderItemDetailDTO> getDetails() {
    return details;
  }

  public void setDetails(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
  }

  public OrderItemDTO details(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
    return this;
  }

  public OrderItemDTO addDetailsItem(OrderItemDetailDTO detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

 /**
   * Список субсидий по типам.
   * @return subsidies
  **/
  @JsonProperty("subsidies")
  public List<@Valid OrderItemSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderItemDTO subsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  public OrderItemDTO addSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    this.subsidies.add(subsidiesItem);
    return this;
  }

 /**
   * Список необходимых маркировок товара.
   * @return requiredInstanceTypes
  **/
  @JsonProperty("requiredInstanceTypes")
  public List<OrderItemInstanceType> getRequiredInstanceTypes() {
    return requiredInstanceTypes;
  }

  public void setRequiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
  }

  public OrderItemDTO requiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
    return this;
  }

  public OrderItemDTO addRequiredInstanceTypesItem(OrderItemInstanceType requiredInstanceTypesItem) {
    this.requiredInstanceTypes.add(requiredInstanceTypesItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDTO orderItemDTO = (OrderItemDTO) o;
    return Objects.equals(this.id, orderItemDTO.id) &&
        Objects.equals(this.offerId, orderItemDTO.offerId) &&
        Objects.equals(this.offerName, orderItemDTO.offerName) &&
        Objects.equals(this.price, orderItemDTO.price) &&
        Objects.equals(this.buyerPrice, orderItemDTO.buyerPrice) &&
        Objects.equals(this.buyerPriceBeforeDiscount, orderItemDTO.buyerPriceBeforeDiscount) &&
        Objects.equals(this.priceBeforeDiscount, orderItemDTO.priceBeforeDiscount) &&
        Objects.equals(this.count, orderItemDTO.count) &&
        Objects.equals(this.vat, orderItemDTO.vat) &&
        Objects.equals(this.shopSku, orderItemDTO.shopSku) &&
        Objects.equals(this.subsidy, orderItemDTO.subsidy) &&
        Objects.equals(this.partnerWarehouseId, orderItemDTO.partnerWarehouseId) &&
        Objects.equals(this.promos, orderItemDTO.promos) &&
        Objects.equals(this.instances, orderItemDTO.instances) &&
        Objects.equals(this.details, orderItemDTO.details) &&
        Objects.equals(this.subsidies, orderItemDTO.subsidies) &&
        Objects.equals(this.requiredInstanceTypes, orderItemDTO.requiredInstanceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, offerName, price, buyerPrice, buyerPriceBeforeDiscount, priceBeforeDiscount, count, vat, shopSku, subsidy, partnerWarehouseId, promos, instances, details, subsidies, requiredInstanceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    buyerPrice: ").append(toIndentedString(buyerPrice)).append("\n");
    sb.append("    buyerPriceBeforeDiscount: ").append(toIndentedString(buyerPriceBeforeDiscount)).append("\n");
    sb.append("    priceBeforeDiscount: ").append(toIndentedString(priceBeforeDiscount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    subsidy: ").append(toIndentedString(subsidy)).append("\n");
    sb.append("    partnerWarehouseId: ").append(toIndentedString(partnerWarehouseId)).append("\n");
    sb.append("    promos: ").append(toIndentedString(promos)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    subsidies: ").append(toIndentedString(subsidies)).append("\n");
    sb.append("    requiredInstanceTypes: ").append(toIndentedString(requiredInstanceTypes)).append("\n");
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

