package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров в заказе.
 **/
@ApiModel(description = "Список товаров в заказе.")
@JsonTypeName("OrderItemDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemDTO   {
  private Long id;
  private String offerId;
  private String offerName;
  private BigDecimal price;
  private BigDecimal buyerPrice;
  private BigDecimal buyerPriceBeforeDiscount;
  private BigDecimal priceBeforeDiscount;
  private Integer count;
  private OrderVatType vat;
  private String shopSku;
  private BigDecimal subsidy;
  private String partnerWarehouseId;
  private @Valid List<@Valid OrderItemPromoDTO> promos;
  private @Valid List<@Valid OrderItemInstanceDTO> instances;
  private @Valid List<@Valid OrderItemDetailDTO> details;
  private @Valid List<@Valid OrderItemSubsidyDTO> subsidies;
  private @Valid List<OrderItemInstanceType> requiredInstanceTypes;

  /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   **/
  public OrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public OrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
   @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getOfferId() {
    return offerId;
  }

  @JsonProperty("offerId")
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Название товара.
   **/
  public OrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

  
  @ApiModelProperty(value = "Название товара.")
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  @JsonProperty("offerName")
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). 
   **/
  public OrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). ")
  @JsonProperty("price")
  @Valid public BigDecimal getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
   **/
  public OrderItemDTO buyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ")
  @JsonProperty("buyerPrice")
  @Valid public BigDecimal getBuyerPrice() {
    return buyerPrice;
  }

  @JsonProperty("buyerPrice")
  public void setBuyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
  }

  /**
   * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
   **/
  public OrderItemDTO buyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    return this;
  }

  
  @ApiModelProperty(value = "Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @JsonProperty("buyerPriceBeforeDiscount")
  @Valid public BigDecimal getBuyerPriceBeforeDiscount() {
    return buyerPriceBeforeDiscount;
  }

  @JsonProperty("buyerPriceBeforeDiscount")
  public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
   **/
  public OrderItemDTO priceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ")
  @JsonProperty("priceBeforeDiscount")
  @Valid public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }

  @JsonProperty("priceBeforeDiscount")
  public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
  }

  /**
   * Количество единиц товара.
   **/
  public OrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  public OrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }

  @JsonProperty("vat")
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public OrderItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("shopSku")
   @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)public String getShopSku() {
    return shopSku;
  }

  @JsonProperty("shopSku")
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
   **/
  public OrderItemDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ")
  @JsonProperty("subsidy")
  @Valid public BigDecimal getSubsidy() {
    return subsidy;
  }

  @JsonProperty("subsidy")
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
   **/
  public OrderItemDTO partnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ")
  @JsonProperty("partnerWarehouseId")
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }

  @JsonProperty("partnerWarehouseId")
  public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

  /**
   * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
   **/
  public OrderItemDTO promos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  
  @ApiModelProperty(value = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.")
  @JsonProperty("promos")
  @Valid public List<@Valid OrderItemPromoDTO> getPromos() {
    return promos;
  }

  @JsonProperty("promos")
  public void setPromos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
  }

  public OrderItemDTO addPromosItem(OrderItemPromoDTO promosItem) {
    if (this.promos == null) {
      this.promos = new ArrayList<>();
    }

    this.promos.add(promosItem);
    return this;
  }

  public OrderItemDTO removePromosItem(OrderItemPromoDTO promosItem) {
    if (promosItem != null && this.promos != null) {
      this.promos.remove(promosItem);
    }

    return this;
  }
  /**
   * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. 
   **/
  public OrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(value = "Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. ")
  @JsonProperty("instances")
  @Valid public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  @JsonProperty("instances")
  public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  public OrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }

    this.instances.add(instancesItem);
    return this;
  }

  public OrderItemDTO removeInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (instancesItem != null && this.instances != null) {
      this.instances.remove(instancesItem);
    }

    return this;
  }
  /**
   * Информация об удалении товара из заказа. 
   **/
  public OrderItemDTO details(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Информация об удалении товара из заказа. ")
  @JsonProperty("details")
  @Valid public List<@Valid OrderItemDetailDTO> getDetails() {
    return details;
  }

  @JsonProperty("details")
  public void setDetails(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
  }

  public OrderItemDTO addDetailsItem(OrderItemDetailDTO detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }

    this.details.add(detailsItem);
    return this;
  }

  public OrderItemDTO removeDetailsItem(OrderItemDetailDTO detailsItem) {
    if (detailsItem != null && this.details != null) {
      this.details.remove(detailsItem);
    }

    return this;
  }
  /**
   * Список субсидий по типам.
   **/
  public OrderItemDTO subsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  
  @ApiModelProperty(value = "Список субсидий по типам.")
  @JsonProperty("subsidies")
  @Valid public List<@Valid OrderItemSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  @JsonProperty("subsidies")
  public void setSubsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderItemDTO addSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    if (this.subsidies == null) {
      this.subsidies = new ArrayList<>();
    }

    this.subsidies.add(subsidiesItem);
    return this;
  }

  public OrderItemDTO removeSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    if (subsidiesItem != null && this.subsidies != null) {
      this.subsidies.remove(subsidiesItem);
    }

    return this;
  }
  /**
   * Список необходимых маркировок товара.
   **/
  public OrderItemDTO requiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "Список необходимых маркировок товара.")
  @JsonProperty("requiredInstanceTypes")
  public List<OrderItemInstanceType> getRequiredInstanceTypes() {
    return requiredInstanceTypes;
  }

  @JsonProperty("requiredInstanceTypes")
  public void setRequiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
  }

  public OrderItemDTO addRequiredInstanceTypesItem(OrderItemInstanceType requiredInstanceTypesItem) {
    if (this.requiredInstanceTypes == null) {
      this.requiredInstanceTypes = new ArrayList<>();
    }

    this.requiredInstanceTypes.add(requiredInstanceTypesItem);
    return this;
  }

  public OrderItemDTO removeRequiredInstanceTypesItem(OrderItemInstanceType requiredInstanceTypesItem) {
    if (requiredInstanceTypesItem != null && this.requiredInstanceTypes != null) {
      this.requiredInstanceTypes.remove(requiredInstanceTypesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

