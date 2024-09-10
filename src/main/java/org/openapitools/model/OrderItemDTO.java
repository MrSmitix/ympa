package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров в заказе.
 */

@Schema(name = "OrderItemDTO", description = "Список товаров в заказе.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemDTO {

  private Long id;

  private String offerId;

  private String offerName;

  private BigDecimal price;

  private BigDecimal buyerPrice;

  private BigDecimal buyerPriceBeforeDiscount;

  @Deprecated
  private BigDecimal priceBeforeDiscount;

  private Integer count;

  private OrderVatType vat;

  private String shopSku;

  @Deprecated
  private BigDecimal subsidy;

  @Deprecated
  private String partnerWarehouseId;

  @Valid
  private JsonNullable<List<@Valid OrderItemPromoDTO>> promos = JsonNullable.<List<@Valid OrderItemPromoDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OrderItemInstanceDTO>> instances = JsonNullable.<List<@Valid OrderItemInstanceDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OrderItemDetailDTO>> details = JsonNullable.<List<@Valid OrderItemDetailDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OrderItemSubsidyDTO>> subsidies = JsonNullable.<List<@Valid OrderItemSubsidyDTO>>undefined();

  @Valid
  private JsonNullable<List<OrderItemInstanceType>> requiredInstanceTypes = JsonNullable.<List<OrderItemInstanceType>>undefined();

  public OrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerId")
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
   */
  
  @Schema(name = "offerName", description = "Название товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerName")
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
   */
  @Valid 
  @Schema(name = "price", description = "Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
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
   */
  @Valid 
  @Schema(name = "buyerPrice", description = "Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerPrice")
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
   */
  @Valid 
  @Schema(name = "buyerPriceBeforeDiscount", description = "Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerPriceBeforeDiscount")
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
   * @deprecated
   */
  @Valid 
  @Schema(name = "priceBeforeDiscount", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceBeforeDiscount")
  @Deprecated
  public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }

  /**
   * @deprecated
   */
  @Deprecated
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
   */
  
  @Schema(name = "count", description = "Количество единиц товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
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
   */
  @Valid 
  @Schema(name = "vat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vat")
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
   */
  @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "shopSku", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopSku")
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
   * @deprecated
   */
  @Valid 
  @Schema(name = "subsidy", description = "{% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidy")
  @Deprecated
  public BigDecimal getSubsidy() {
    return subsidy;
  }

  /**
   * @deprecated
   */
  @Deprecated
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
   * @deprecated
   */
  
  @Schema(name = "partnerWarehouseId", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerWarehouseId")
  @Deprecated
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

  public OrderItemDTO promos(List<@Valid OrderItemPromoDTO> promos) {
    this.promos = JsonNullable.of(promos);
    return this;
  }

  public OrderItemDTO addPromosItem(OrderItemPromoDTO promosItem) {
    if (this.promos == null || !this.promos.isPresent()) {
      this.promos = JsonNullable.of(new ArrayList<>());
    }
    this.promos.get().add(promosItem);
    return this;
  }

  /**
   * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
   * @return promos
   */
  @Valid 
  @Schema(name = "promos", description = "Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promos")
  public JsonNullable<List<@Valid OrderItemPromoDTO>> getPromos() {
    return promos;
  }

  public void setPromos(JsonNullable<List<@Valid OrderItemPromoDTO>> promos) {
    this.promos = promos;
  }

  public OrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = JsonNullable.of(instances);
    return this;
  }

  public OrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    if (this.instances == null || !this.instances.isPresent()) {
      this.instances = JsonNullable.of(new ArrayList<>());
    }
    this.instances.get().add(instancesItem);
    return this;
  }

  /**
   * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
   * @return instances
   */
  @Valid 
  @Schema(name = "instances", description = "Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public JsonNullable<List<@Valid OrderItemInstanceDTO>> getInstances() {
    return instances;
  }

  public void setInstances(JsonNullable<List<@Valid OrderItemInstanceDTO>> instances) {
    this.instances = instances;
  }

  public OrderItemDTO details(List<@Valid OrderItemDetailDTO> details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  public OrderItemDTO addDetailsItem(OrderItemDetailDTO detailsItem) {
    if (this.details == null || !this.details.isPresent()) {
      this.details = JsonNullable.of(new ArrayList<>());
    }
    this.details.get().add(detailsItem);
    return this;
  }

  /**
   * Информация об удалении товара из заказа. 
   * @return details
   */
  @Valid 
  @Schema(name = "details", description = "Информация об удалении товара из заказа. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public JsonNullable<List<@Valid OrderItemDetailDTO>> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<List<@Valid OrderItemDetailDTO>> details) {
    this.details = details;
  }

  public OrderItemDTO subsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
    this.subsidies = JsonNullable.of(subsidies);
    return this;
  }

  public OrderItemDTO addSubsidiesItem(OrderItemSubsidyDTO subsidiesItem) {
    if (this.subsidies == null || !this.subsidies.isPresent()) {
      this.subsidies = JsonNullable.of(new ArrayList<>());
    }
    this.subsidies.get().add(subsidiesItem);
    return this;
  }

  /**
   * Список субсидий по типам.
   * @return subsidies
   */
  @Valid 
  @Schema(name = "subsidies", description = "Список субсидий по типам.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subsidies")
  public JsonNullable<List<@Valid OrderItemSubsidyDTO>> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(JsonNullable<List<@Valid OrderItemSubsidyDTO>> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderItemDTO requiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
    this.requiredInstanceTypes = JsonNullable.of(requiredInstanceTypes);
    return this;
  }

  public OrderItemDTO addRequiredInstanceTypesItem(OrderItemInstanceType requiredInstanceTypesItem) {
    if (this.requiredInstanceTypes == null || !this.requiredInstanceTypes.isPresent()) {
      this.requiredInstanceTypes = JsonNullable.of(new ArrayList<>());
    }
    this.requiredInstanceTypes.get().add(requiredInstanceTypesItem);
    return this;
  }

  /**
   * Список необходимых маркировок товара.
   * @return requiredInstanceTypes
   */
  @Valid 
  @Schema(name = "requiredInstanceTypes", description = "Список необходимых маркировок товара.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredInstanceTypes")
  public JsonNullable<List<OrderItemInstanceType>> getRequiredInstanceTypes() {
    return requiredInstanceTypes;
  }

  public void setRequiredInstanceTypes(JsonNullable<List<OrderItemInstanceType>> requiredInstanceTypes) {
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
        equalsNullable(this.promos, orderItemDTO.promos) &&
        equalsNullable(this.instances, orderItemDTO.instances) &&
        equalsNullable(this.details, orderItemDTO.details) &&
        equalsNullable(this.subsidies, orderItemDTO.subsidies) &&
        equalsNullable(this.requiredInstanceTypes, orderItemDTO.requiredInstanceTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, offerName, price, buyerPrice, buyerPriceBeforeDiscount, priceBeforeDiscount, count, vat, shopSku, subsidy, partnerWarehouseId, hashCodeNullable(promos), hashCodeNullable(instances), hashCodeNullable(details), hashCodeNullable(subsidies), hashCodeNullable(requiredInstanceTypes));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

