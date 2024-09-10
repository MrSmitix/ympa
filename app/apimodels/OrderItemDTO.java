package apimodels;

import apimodels.OrderItemDetailDTO;
import apimodels.OrderItemInstanceDTO;
import apimodels.OrderItemInstanceType;
import apimodels.OrderItemPromoDTO;
import apimodels.OrderItemSubsidyDTO;
import apimodels.OrderVatType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список товаров в заказе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("offerId")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("offerName")
  
  private String offerName;

  @JsonProperty("price")
  @Valid

  private BigDecimal price;

  @JsonProperty("buyerPrice")
  @Valid

  private BigDecimal buyerPrice;

  @JsonProperty("buyerPriceBeforeDiscount")
  @Valid

  private BigDecimal buyerPriceBeforeDiscount;

  @JsonProperty("priceBeforeDiscount")
  @Valid

  private BigDecimal priceBeforeDiscount;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("vat")
  @Valid

  private OrderVatType vat;

  @JsonProperty("shopSku")
  @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String shopSku;

  @JsonProperty("subsidy")
  @Valid

  private BigDecimal subsidy;

  @JsonProperty("partnerWarehouseId")
  
  private String partnerWarehouseId;

  @JsonProperty("promos")
  @Valid

  private List<@Valid OrderItemPromoDTO> promos = null;

  @JsonProperty("instances")
  @Valid

  private List<@Valid OrderItemInstanceDTO> instances = null;

  @JsonProperty("details")
  @Valid

  private List<@Valid OrderItemDetailDTO> details = null;

  @JsonProperty("subsidies")
  @Valid

  private List<@Valid OrderItemSubsidyDTO> subsidies = null;

  @JsonProperty("requiredInstanceTypes")
  @Valid

  private List<OrderItemInstanceType> requiredInstanceTypes = null;

  public OrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * Название товара.
   * @return offerName
  **/
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
   * @return price
  **/
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderItemDTO buyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
    return this;
  }

   /**
   * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
   * @return buyerPrice
  **/
  public BigDecimal getBuyerPrice() {
    return buyerPrice;
  }

  public void setBuyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
  }

  public OrderItemDTO buyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    return this;
  }

   /**
   * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
   * @return buyerPriceBeforeDiscount
  **/
  public BigDecimal getBuyerPriceBeforeDiscount() {
    return buyerPriceBeforeDiscount;
  }

  public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
  }

  public OrderItemDTO priceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
   * @return priceBeforeDiscount
  **/
  public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }

  public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
  }

  public OrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Количество единиц товара.
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  public OrderVatType getVat() {
    return vat;
  }

  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  public OrderItemDTO shopSku(String shopSku) {
    this.shopSku = shopSku;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return shopSku
  **/
  public String getShopSku() {
    return shopSku;
  }

  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

  public OrderItemDTO subsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
   * @return subsidy
  **/
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

  public OrderItemDTO partnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
   * @return partnerWarehouseId
  **/
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }

  public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

  public OrderItemDTO promos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  public OrderItemDTO addPromosItem(OrderItemPromoDTO promosItem) {
    if (this.promos == null) {
      this.promos = new ArrayList<>();
    }
    this.promos.add(promosItem);
    return this;
  }

   /**
   * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
   * @return promos
  **/
  public List<@Valid OrderItemPromoDTO> getPromos() {
    return promos;
  }

  public void setPromos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = promos;
  }

  public OrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  public OrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
   * @return instances
  **/
  public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  public OrderItemDTO details(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
    return this;
  }

  public OrderItemDTO addDetailsItem(OrderItemDetailDTO detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Информация об удалении товара из заказа. 
   * @return details
  **/
  public List<@Valid OrderItemDetailDTO> getDetails() {
    return details;
  }

  public void setDetails(List<@Valid OrderItemDetailDTO> details) {
    this.details = details;
  }

  public OrderItemDTO subsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  public OrderItemDTO addSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    if (this.subsidies == null) {
      this.subsidies = new ArrayList<>();
    }
    this.subsidies.add(subsidiesItem);
    return this;
  }

   /**
   * Список субсидий по типам.
   * @return subsidies
  **/
  public List<@Valid OrderItemSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderItemDTO requiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
    return this;
  }

  public OrderItemDTO addRequiredInstanceTypesItem(OrderItemInstanceType requiredInstanceTypesItem) {
    if (this.requiredInstanceTypes == null) {
      this.requiredInstanceTypes = new ArrayList<>();
    }
    this.requiredInstanceTypes.add(requiredInstanceTypesItem);
    return this;
  }

   /**
   * Список необходимых маркировок товара.
   * @return requiredInstanceTypes
  **/
  public List<OrderItemInstanceType> getRequiredInstanceTypes() {
    return requiredInstanceTypes;
  }

  public void setRequiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = requiredInstanceTypes;
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
    return Objects.equals(id, orderItemDTO.id) &&
        Objects.equals(offerId, orderItemDTO.offerId) &&
        Objects.equals(offerName, orderItemDTO.offerName) &&
        Objects.equals(price, orderItemDTO.price) &&
        Objects.equals(buyerPrice, orderItemDTO.buyerPrice) &&
        Objects.equals(buyerPriceBeforeDiscount, orderItemDTO.buyerPriceBeforeDiscount) &&
        Objects.equals(priceBeforeDiscount, orderItemDTO.priceBeforeDiscount) &&
        Objects.equals(count, orderItemDTO.count) &&
        Objects.equals(vat, orderItemDTO.vat) &&
        Objects.equals(shopSku, orderItemDTO.shopSku) &&
        Objects.equals(subsidy, orderItemDTO.subsidy) &&
        Objects.equals(partnerWarehouseId, orderItemDTO.partnerWarehouseId) &&
        Objects.equals(promos, orderItemDTO.promos) &&
        Objects.equals(instances, orderItemDTO.instances) &&
        Objects.equals(details, orderItemDTO.details) &&
        Objects.equals(subsidies, orderItemDTO.subsidies) &&
        Objects.equals(requiredInstanceTypes, orderItemDTO.requiredInstanceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, offerName, price, buyerPrice, buyerPriceBeforeDiscount, priceBeforeDiscount, count, vat, shopSku, subsidy, partnerWarehouseId, promos, instances, details, subsidies, requiredInstanceTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

