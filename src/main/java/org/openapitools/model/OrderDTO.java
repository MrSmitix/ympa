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
import org.openapitools.model.CurrencyType;
import org.openapitools.model.OrderBuyerDTO;
import org.openapitools.model.OrderDeliveryDTO;
import org.openapitools.model.OrderItemDTO;
import org.openapitools.model.OrderPaymentMethodType;
import org.openapitools.model.OrderPaymentType;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubsidyDTO;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderTaxSystemType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Заказ.
 */

@Schema(name = "OrderDTO", description = "Заказ.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDTO {

  private Long id;

  private OrderStatusType status;

  private OrderSubstatusType substatus;

  private String creationDate;

  private String updatedAt;

  private CurrencyType currency;

  private BigDecimal itemsTotal;

  private BigDecimal deliveryTotal;

  @Deprecated
  private BigDecimal buyerItemsTotal;

  @Deprecated
  private BigDecimal buyerTotal;

  private BigDecimal buyerItemsTotalBeforeDiscount;

  @Deprecated
  private BigDecimal buyerTotalBeforeDiscount;

  private OrderPaymentType paymentType;

  private OrderPaymentMethodType paymentMethod;

  private Boolean fake;

  @Valid
  private List<@Valid OrderItemDTO> items = new ArrayList<>();

  @Valid
  private JsonNullable<List<@Valid OrderSubsidyDTO>> subsidies = JsonNullable.<List<@Valid OrderSubsidyDTO>>undefined();

  private OrderDeliveryDTO delivery;

  private OrderBuyerDTO buyer;

  private String notes;

  private OrderTaxSystemType taxSystem;

  private Boolean cancelRequested;

  private String expiryDate;

  public OrderDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderDTO(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  /**
   * Get substatus
   * @return substatus
   */
  @Valid 
  @Schema(name = "substatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public OrderDTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  
  @Schema(name = "creationDate", example = "23-09-2022 09:12:41", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public OrderDTO updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  
  @Schema(name = "updatedAt", example = "23-09-2022 09:12:41", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public OrderDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public OrderDTO itemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

  /**
   * Платеж покупателя. 
   * @return itemsTotal
   */
  @Valid 
  @Schema(name = "itemsTotal", description = "Платеж покупателя. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemsTotal")
  public BigDecimal getItemsTotal() {
    return itemsTotal;
  }

  public void setItemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  public OrderDTO deliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
    return this;
  }

  /**
   * Стоимость доставки. 
   * @return deliveryTotal
   */
  @Valid 
  @Schema(name = "deliveryTotal", description = "Стоимость доставки. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryTotal")
  public BigDecimal getDeliveryTotal() {
    return deliveryTotal;
  }

  public void setDeliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
  }

  public OrderDTO buyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
   * @return buyerItemsTotal
   * @deprecated
   */
  @Valid 
  @Schema(name = "buyerItemsTotal", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerItemsTotal")
  @Deprecated
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
  }

  public OrderDTO buyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
   * @return buyerTotal
   * @deprecated
   */
  @Valid 
  @Schema(name = "buyerTotal", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerTotal")
  @Deprecated
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setBuyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
  }

  public OrderDTO buyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    return this;
  }

  /**
   * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
   * @return buyerItemsTotalBeforeDiscount
   */
  @Valid 
  @Schema(name = "buyerItemsTotalBeforeDiscount", description = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerItemsTotalBeforeDiscount")
  public BigDecimal getBuyerItemsTotalBeforeDiscount() {
    return buyerItemsTotalBeforeDiscount;
  }

  public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
  }

  public OrderDTO buyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
   * @return buyerTotalBeforeDiscount
   * @deprecated
   */
  @Valid 
  @Schema(name = "buyerTotalBeforeDiscount", description = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerTotalBeforeDiscount")
  @Deprecated
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
  }

  public OrderDTO paymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
   */
  @Valid 
  @Schema(name = "paymentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentType")
  public OrderPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public OrderDTO paymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @Valid 
  @Schema(name = "paymentMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethod")
  public OrderPaymentMethodType getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public OrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

  /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
   */
  
  @Schema(name = "fake", description = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  public OrderDTO items(List<@Valid OrderItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderDTO addItemsItem(OrderItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в заказе.
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список товаров в заказе.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO subsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = JsonNullable.of(subsidies);
    return this;
  }

  public OrderDTO addSubsidiesItem(OrderSubsidyDTO subsidiesItem) {
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
  public JsonNullable<List<@Valid OrderSubsidyDTO>> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(JsonNullable<List<@Valid OrderSubsidyDTO>> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderDTO delivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
   */
  @Valid 
  @Schema(name = "delivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery")
  public OrderDeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public OrderDTO buyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   */
  @Valid 
  @Schema(name = "buyer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyer")
  public OrderBuyerDTO getBuyer() {
    return buyer;
  }

  public void setBuyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
  }

  public OrderDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Комментарий к заказу.
   * @return notes
   */
  
  @Schema(name = "notes", description = "Комментарий к заказу.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public OrderDTO taxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
    return this;
  }

  /**
   * Get taxSystem
   * @return taxSystem
   */
  @Valid 
  @Schema(name = "taxSystem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxSystem")
  public OrderTaxSystemType getTaxSystem() {
    return taxSystem;
  }

  public void setTaxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
  }

  public OrderDTO cancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  /**
   * **Только для модели DBS**  Запрошена ли отмена. 
   * @return cancelRequested
   */
  
  @Schema(name = "cancelRequested", description = "**Только для модели DBS**  Запрошена ли отмена. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelRequested")
  public Boolean getCancelRequested() {
    return cancelRequested;
  }

  public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

  public OrderDTO expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
   */
  
  @Schema(name = "expiryDate", example = "23-09-2022 09:12:41", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDTO orderDTO = (OrderDTO) o;
    return Objects.equals(this.id, orderDTO.id) &&
        Objects.equals(this.status, orderDTO.status) &&
        Objects.equals(this.substatus, orderDTO.substatus) &&
        Objects.equals(this.creationDate, orderDTO.creationDate) &&
        Objects.equals(this.updatedAt, orderDTO.updatedAt) &&
        Objects.equals(this.currency, orderDTO.currency) &&
        Objects.equals(this.itemsTotal, orderDTO.itemsTotal) &&
        Objects.equals(this.deliveryTotal, orderDTO.deliveryTotal) &&
        Objects.equals(this.buyerItemsTotal, orderDTO.buyerItemsTotal) &&
        Objects.equals(this.buyerTotal, orderDTO.buyerTotal) &&
        Objects.equals(this.buyerItemsTotalBeforeDiscount, orderDTO.buyerItemsTotalBeforeDiscount) &&
        Objects.equals(this.buyerTotalBeforeDiscount, orderDTO.buyerTotalBeforeDiscount) &&
        Objects.equals(this.paymentType, orderDTO.paymentType) &&
        Objects.equals(this.paymentMethod, orderDTO.paymentMethod) &&
        Objects.equals(this.fake, orderDTO.fake) &&
        Objects.equals(this.items, orderDTO.items) &&
        equalsNullable(this.subsidies, orderDTO.subsidies) &&
        Objects.equals(this.delivery, orderDTO.delivery) &&
        Objects.equals(this.buyer, orderDTO.buyer) &&
        Objects.equals(this.notes, orderDTO.notes) &&
        Objects.equals(this.taxSystem, orderDTO.taxSystem) &&
        Objects.equals(this.cancelRequested, orderDTO.cancelRequested) &&
        Objects.equals(this.expiryDate, orderDTO.expiryDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, substatus, creationDate, updatedAt, currency, itemsTotal, deliveryTotal, buyerItemsTotal, buyerTotal, buyerItemsTotalBeforeDiscount, buyerTotalBeforeDiscount, paymentType, paymentMethod, fake, items, hashCodeNullable(subsidies), delivery, buyer, notes, taxSystem, cancelRequested, expiryDate);
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
    sb.append("class OrderDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    deliveryTotal: ").append(toIndentedString(deliveryTotal)).append("\n");
    sb.append("    buyerItemsTotal: ").append(toIndentedString(buyerItemsTotal)).append("\n");
    sb.append("    buyerTotal: ").append(toIndentedString(buyerTotal)).append("\n");
    sb.append("    buyerItemsTotalBeforeDiscount: ").append(toIndentedString(buyerItemsTotalBeforeDiscount)).append("\n");
    sb.append("    buyerTotalBeforeDiscount: ").append(toIndentedString(buyerTotalBeforeDiscount)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    fake: ").append(toIndentedString(fake)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    subsidies: ").append(toIndentedString(subsidies)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    taxSystem: ").append(toIndentedString(taxSystem)).append("\n");
    sb.append("    cancelRequested: ").append(toIndentedString(cancelRequested)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

