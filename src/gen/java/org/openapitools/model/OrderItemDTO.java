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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров в заказе.
 */
@ApiModel(description="Список товаров в заказе.")

public class OrderItemDTO  {
  
 /**
  * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  */
  @ApiModelProperty(value = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
  private Long id;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

 /**
  * Название товара.
  */
  @ApiModelProperty(value = "Название товара.")
  private String offerName;

 /**
  * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
  */
  @ApiModelProperty(value = "Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). ")
  @Valid
  private BigDecimal price;

 /**
  * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
  */
  @ApiModelProperty(value = "Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ")
  @Valid
  private BigDecimal buyerPrice;

 /**
  * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
  */
  @ApiModelProperty(value = "Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @Valid
  private BigDecimal buyerPriceBeforeDiscount;

 /**
  * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ")
  @Valid
  private BigDecimal priceBeforeDiscount;

 /**
  * Количество единиц товара.
  */
  @ApiModelProperty(value = "Количество единиц товара.")
  private Integer count;

  @ApiModelProperty(value = "")
  @Valid
  private OrderVatType vat;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String shopSku;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ")
  @Valid
  private BigDecimal subsidy;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ")
  private String partnerWarehouseId;

 /**
  * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  */
  @ApiModelProperty(value = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
  @Valid
  private List<@Valid OrderItemPromoDTO> promos;

 /**
  * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
  */
  @ApiModelProperty(value = "Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. ")
  @Valid
  private List<@Valid OrderItemInstanceDTO> instances;

 /**
  * Информация об удалении товара из заказа. 
  */
  @ApiModelProperty(value = "Информация об удалении товара из заказа. ")
  @Valid
  private List<@Valid OrderItemDetailDTO> details;

 /**
  * Список субсидий по типам.
  */
  @ApiModelProperty(value = "Список субсидий по типам.")
  @Valid
  private List<@Valid OrderItemSubsidyDTO> subsidies;

 /**
  * Список необходимых маркировок товара.
  */
  @ApiModelProperty(value = "Список необходимых маркировок товара.")
  @Valid
  private List<OrderItemInstanceType> requiredInstanceTypes;
 /**
  * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public OrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Название товара.
  * @return offerName
  */
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
 public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
  public OrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
  * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). 
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public OrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
  * @return buyerPrice
  */
  @JsonProperty("buyerPrice")
  public BigDecimal getBuyerPrice() {
    return buyerPrice;
  }

  /**
   * Sets the <code>buyerPrice</code> property.
   */
 public void setBuyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
  }

  /**
   * Sets the <code>buyerPrice</code> property.
   */
  public OrderItemDTO buyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
    return this;
  }

 /**
  * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
  * @return buyerPriceBeforeDiscount
  */
  @JsonProperty("buyerPriceBeforeDiscount")
  public BigDecimal getBuyerPriceBeforeDiscount() {
    return buyerPriceBeforeDiscount;
  }

  /**
   * Sets the <code>buyerPriceBeforeDiscount</code> property.
   */
 public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
  }

  /**
   * Sets the <code>buyerPriceBeforeDiscount</code> property.
   */
  public OrderItemDTO buyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
  * @return priceBeforeDiscount
  */
  @JsonProperty("priceBeforeDiscount")
  public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }

  /**
   * Sets the <code>priceBeforeDiscount</code> property.
   */
 public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
  }

  /**
   * Sets the <code>priceBeforeDiscount</code> property.
   */
  public OrderItemDTO priceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
    return this;
  }

 /**
  * Количество единиц товара.
  * @return count
  */
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the <code>count</code> property.
   */
 public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Sets the <code>count</code> property.
   */
  public OrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * Get vat
  * @return vat
  */
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
 public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
  public OrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return shopSku
  */
  @JsonProperty("shopSku")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getShopSku() {
    return shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
 public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * Sets the <code>shopSku</code> property.
   */
  public OrderItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
  * @return subsidy
  */
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  /**
   * Sets the <code>subsidy</code> property.
   */
 public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  /**
   * Sets the <code>subsidy</code> property.
   */
  public OrderItemDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
  * @return partnerWarehouseId
  */
  @JsonProperty("partnerWarehouseId")
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }

  /**
   * Sets the <code>partnerWarehouseId</code> property.
   */
 public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

  /**
   * Sets the <code>partnerWarehouseId</code> property.
   */
  public OrderItemDTO partnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
    return this;
  }

 /**
  * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  * @return promos
  */
  @JsonProperty("promos")
  public List<@Valid OrderItemPromoDTO> getPromos() {
    return promos;
  }

  /**
   * Sets the <code>promos</code> property.
   */
 public void setPromos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
  }

  /**
   * Sets the <code>promos</code> property.
   */
  public OrderItemDTO promos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  /**
   * Adds a new item to the <code>promos</code> list.
   */
  public OrderItemDTO addPromosItem(OrderItemPromoDTO promosItem) {
    this.promos.add(promosItem);
    return this;
  }

 /**
  * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. 
  * @return instances
  */
  @JsonProperty("instances")
  public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
 public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
  public OrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Adds a new item to the <code>instances</code> list.
   */
  public OrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

 /**
  * Информация об удалении товара из заказа. 
  * @return details
  */
  @JsonProperty("details")
  public List<@Valid OrderItemDetailDTO> getDetails() {
    return details;
  }

  /**
   * Sets the <code>details</code> property.
   */
 public void setDetails(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
  }

  /**
   * Sets the <code>details</code> property.
   */
  public OrderItemDTO details(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
    return this;
  }

  /**
   * Adds a new item to the <code>details</code> list.
   */
  public OrderItemDTO addDetailsItem(OrderItemDetailDTO detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

 /**
  * Список субсидий по типам.
  * @return subsidies
  */
  @JsonProperty("subsidies")
  public List<@Valid OrderItemSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  /**
   * Sets the <code>subsidies</code> property.
   */
 public void setSubsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  /**
   * Sets the <code>subsidies</code> property.
   */
  public OrderItemDTO subsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  /**
   * Adds a new item to the <code>subsidies</code> list.
   */
  public OrderItemDTO addSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    this.subsidies.add(subsidiesItem);
    return this;
  }

 /**
  * Список необходимых маркировок товара.
  * @return requiredInstanceTypes
  */
  @JsonProperty("requiredInstanceTypes")
  public List<OrderItemInstanceType> getRequiredInstanceTypes() {
    return requiredInstanceTypes;
  }

  /**
   * Sets the <code>requiredInstanceTypes</code> property.
   */
 public void setRequiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
  }

  /**
   * Sets the <code>requiredInstanceTypes</code> property.
   */
  public OrderItemDTO requiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>requiredInstanceTypes</code> list.
   */
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

