package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Заказ.
 */
@ApiModel(description="Заказ.")

public class OrderDTO  {
  
 /**
  * Идентификатор заказа.
  */
  @ApiModelProperty(value = "Идентификатор заказа.")
  private Long id;

  @ApiModelProperty(value = "")
  @Valid
  private OrderStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private OrderSubstatusType substatus;

  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  private String creationDate;

  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  private String updatedAt;

  @ApiModelProperty(value = "")
  @Valid
  private CurrencyType currency;

 /**
  * Платеж покупателя. 
  */
  @ApiModelProperty(value = "Платеж покупателя. ")
  @Valid
  private BigDecimal itemsTotal;

 /**
  * Стоимость доставки. 
  */
  @ApiModelProperty(value = "Стоимость доставки. ")
  @Valid
  private BigDecimal deliveryTotal;

 /**
  * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ")
  @Valid
  private BigDecimal buyerItemsTotal;

 /**
  * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ")
  @Valid
  private BigDecimal buyerTotal;

 /**
  * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  */
  @ApiModelProperty(value = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @Valid
  private BigDecimal buyerItemsTotalBeforeDiscount;

 /**
  * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ")
  @Valid
  private BigDecimal buyerTotalBeforeDiscount;

  @ApiModelProperty(value = "")
  @Valid
  private OrderPaymentType paymentType;

  @ApiModelProperty(value = "")
  @Valid
  private OrderPaymentMethodType paymentMethod;

 /**
  * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  */
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  private Boolean fake;

 /**
  * Список товаров в заказе.
  */
  @ApiModelProperty(required = true, value = "Список товаров в заказе.")
  @Valid
  private List<@Valid OrderItemDTO> items = new ArrayList<>();

 /**
  * Список субсидий по типам.
  */
  @ApiModelProperty(value = "Список субсидий по типам.")
  @Valid
  private List<@Valid OrderSubsidyDTO> subsidies;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryDTO delivery;

  @ApiModelProperty(value = "")
  @Valid
  private OrderBuyerDTO buyer;

 /**
  * Комментарий к заказу.
  */
  @ApiModelProperty(value = "Комментарий к заказу.")
  private String notes;

  @ApiModelProperty(value = "")
  @Valid
  private OrderTaxSystemType taxSystem;

 /**
  * **Только для модели DBS**  Запрошена ли отмена. 
  */
  @ApiModelProperty(value = "**Только для модели DBS**  Запрошена ли отмена. ")
  private Boolean cancelRequested;

  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  private String expiryDate;
 /**
  * Идентификатор заказа.
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
  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public OrderDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get substatus
  * @return substatus
  */
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  /**
   * Sets the <code>substatus</code> property.
   */
 public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   * Sets the <code>substatus</code> property.
   */
  public OrderDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

 /**
  * Get creationDate
  * @return creationDate
  */
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
 public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
  public OrderDTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
  * Get updatedAt
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public OrderDTO updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public OrderDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Платеж покупателя. 
  * @return itemsTotal
  */
  @JsonProperty("itemsTotal")
  public BigDecimal getItemsTotal() {
    return itemsTotal;
  }

  /**
   * Sets the <code>itemsTotal</code> property.
   */
 public void setItemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  /**
   * Sets the <code>itemsTotal</code> property.
   */
  public OrderDTO itemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

 /**
  * Стоимость доставки. 
  * @return deliveryTotal
  */
  @JsonProperty("deliveryTotal")
  public BigDecimal getDeliveryTotal() {
    return deliveryTotal;
  }

  /**
   * Sets the <code>deliveryTotal</code> property.
   */
 public void setDeliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
  }

  /**
   * Sets the <code>deliveryTotal</code> property.
   */
  public OrderDTO deliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  * @return buyerItemsTotal
  */
  @JsonProperty("buyerItemsTotal")
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }

  /**
   * Sets the <code>buyerItemsTotal</code> property.
   */
 public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
  }

  /**
   * Sets the <code>buyerItemsTotal</code> property.
   */
  public OrderDTO buyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  * @return buyerTotal
  */
  @JsonProperty("buyerTotal")
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }

  /**
   * Sets the <code>buyerTotal</code> property.
   */
 public void setBuyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
  }

  /**
   * Sets the <code>buyerTotal</code> property.
   */
  public OrderDTO buyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
    return this;
  }

 /**
  * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  * @return buyerItemsTotalBeforeDiscount
  */
  @JsonProperty("buyerItemsTotalBeforeDiscount")
  public BigDecimal getBuyerItemsTotalBeforeDiscount() {
    return buyerItemsTotalBeforeDiscount;
  }

  /**
   * Sets the <code>buyerItemsTotalBeforeDiscount</code> property.
   */
 public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
  }

  /**
   * Sets the <code>buyerItemsTotalBeforeDiscount</code> property.
   */
  public OrderDTO buyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
  * @return buyerTotalBeforeDiscount
  */
  @JsonProperty("buyerTotalBeforeDiscount")
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }

  /**
   * Sets the <code>buyerTotalBeforeDiscount</code> property.
   */
 public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
  }

  /**
   * Sets the <code>buyerTotalBeforeDiscount</code> property.
   */
  public OrderDTO buyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    return this;
  }

 /**
  * Get paymentType
  * @return paymentType
  */
  @JsonProperty("paymentType")
  public OrderPaymentType getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the <code>paymentType</code> property.
   */
 public void setPaymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Sets the <code>paymentType</code> property.
   */
  public OrderDTO paymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

 /**
  * Get paymentMethod
  * @return paymentMethod
  */
  @JsonProperty("paymentMethod")
  public OrderPaymentMethodType getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * Sets the <code>paymentMethod</code> property.
   */
 public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Sets the <code>paymentMethod</code> property.
   */
  public OrderDTO paymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

 /**
  * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  * @return fake
  */
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  /**
   * Sets the <code>fake</code> property.
   */
 public void setFake(Boolean fake) {
    this.fake = fake;
  }

  /**
   * Sets the <code>fake</code> property.
   */
  public OrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

 /**
  * Список товаров в заказе.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrderItemDTO> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public OrderDTO items(List<@Valid OrderItemDTO> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public OrderDTO addItemsItem(OrderItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Список субсидий по типам.
  * @return subsidies
  */
  @JsonProperty("subsidies")
  public List<@Valid OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  /**
   * Sets the <code>subsidies</code> property.
   */
 public void setSubsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  /**
   * Sets the <code>subsidies</code> property.
   */
  public OrderDTO subsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  /**
   * Adds a new item to the <code>subsidies</code> list.
   */
  public OrderDTO addSubsidiesItem(OrderSubsidyDTO subsidiesItem) {
    this.subsidies.add(subsidiesItem);
    return this;
  }

 /**
  * Get delivery
  * @return delivery
  */
  @JsonProperty("delivery")
  public OrderDeliveryDTO getDelivery() {
    return delivery;
  }

  /**
   * Sets the <code>delivery</code> property.
   */
 public void setDelivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  /**
   * Sets the <code>delivery</code> property.
   */
  public OrderDTO delivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

 /**
  * Get buyer
  * @return buyer
  */
  @JsonProperty("buyer")
  public OrderBuyerDTO getBuyer() {
    return buyer;
  }

  /**
   * Sets the <code>buyer</code> property.
   */
 public void setBuyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
  }

  /**
   * Sets the <code>buyer</code> property.
   */
  public OrderDTO buyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
    return this;
  }

 /**
  * Комментарий к заказу.
  * @return notes
  */
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  /**
   * Sets the <code>notes</code> property.
   */
 public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Sets the <code>notes</code> property.
   */
  public OrderDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
  * Get taxSystem
  * @return taxSystem
  */
  @JsonProperty("taxSystem")
  public OrderTaxSystemType getTaxSystem() {
    return taxSystem;
  }

  /**
   * Sets the <code>taxSystem</code> property.
   */
 public void setTaxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
  }

  /**
   * Sets the <code>taxSystem</code> property.
   */
  public OrderDTO taxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
    return this;
  }

 /**
  * **Только для модели DBS**  Запрошена ли отмена. 
  * @return cancelRequested
  */
  @JsonProperty("cancelRequested")
  public Boolean getCancelRequested() {
    return cancelRequested;
  }

  /**
   * Sets the <code>cancelRequested</code> property.
   */
 public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

  /**
   * Sets the <code>cancelRequested</code> property.
   */
  public OrderDTO cancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

 /**
  * Get expiryDate
  * @return expiryDate
  */
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  /**
   * Sets the <code>expiryDate</code> property.
   */
 public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * Sets the <code>expiryDate</code> property.
   */
  public OrderDTO expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
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
        Objects.equals(this.subsidies, orderDTO.subsidies) &&
        Objects.equals(this.delivery, orderDTO.delivery) &&
        Objects.equals(this.buyer, orderDTO.buyer) &&
        Objects.equals(this.notes, orderDTO.notes) &&
        Objects.equals(this.taxSystem, orderDTO.taxSystem) &&
        Objects.equals(this.cancelRequested, orderDTO.cancelRequested) &&
        Objects.equals(this.expiryDate, orderDTO.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, substatus, creationDate, updatedAt, currency, itemsTotal, deliveryTotal, buyerItemsTotal, buyerTotal, buyerItemsTotalBeforeDiscount, buyerTotalBeforeDiscount, paymentType, paymentMethod, fake, items, subsidies, delivery, buyer, notes, taxSystem, cancelRequested, expiryDate);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

