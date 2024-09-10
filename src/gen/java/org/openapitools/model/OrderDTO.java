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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Заказ.
 **/
@ApiModel(description="Заказ.")

public class OrderDTO  {
  
  @ApiModelProperty(value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
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

  @ApiModelProperty(value = "Платеж покупателя. ")
  @Valid
 /**
   * Платеж покупателя. 
  **/
  private BigDecimal itemsTotal;

  @ApiModelProperty(value = "Стоимость доставки. ")
  @Valid
 /**
   * Стоимость доставки. 
  **/
  private BigDecimal deliveryTotal;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  **/
  private BigDecimal buyerItemsTotal;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  **/
  private BigDecimal buyerTotal;

  @ApiModelProperty(value = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @Valid
 /**
   * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  **/
  private BigDecimal buyerItemsTotalBeforeDiscount;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ")
  @Valid
 /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
  **/
  private BigDecimal buyerTotalBeforeDiscount;

  @ApiModelProperty(value = "")
  @Valid
  private OrderPaymentType paymentType;

  @ApiModelProperty(value = "")
  @Valid
  private OrderPaymentMethodType paymentMethod;

  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
 /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  **/
  private Boolean fake;

  @ApiModelProperty(required = true, value = "Список товаров в заказе.")
  @Valid
 /**
   * Список товаров в заказе.
  **/
  private List<@Valid OrderItemDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "Список субсидий по типам.")
  @Valid
 /**
   * Список субсидий по типам.
  **/
  private List<@Valid OrderSubsidyDTO> subsidies;

  @ApiModelProperty(value = "")
  @Valid
  private OrderDeliveryDTO delivery;

  @ApiModelProperty(value = "")
  @Valid
  private OrderBuyerDTO buyer;

  @ApiModelProperty(value = "Комментарий к заказу.")
 /**
   * Комментарий к заказу.
  **/
  private String notes;

  @ApiModelProperty(value = "")
  @Valid
  private OrderTaxSystemType taxSystem;

  @ApiModelProperty(value = "**Только для модели DBS**  Запрошена ли отмена. ")
 /**
   * **Только для модели DBS**  Запрошена ли отмена. 
  **/
  private Boolean cancelRequested;

  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  private String expiryDate;
 /**
   * Идентификатор заказа.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get substatus
   * @return substatus
  **/
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public OrderDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

 /**
   * Get creationDate
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public OrderDTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
   * Get updatedAt
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public OrderDTO updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public OrderDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Платеж покупателя. 
   * @return itemsTotal
  **/
  @JsonProperty("itemsTotal")
  public BigDecimal getItemsTotal() {
    return itemsTotal;
  }

  public void setItemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  public OrderDTO itemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

 /**
   * Стоимость доставки. 
   * @return deliveryTotal
  **/
  @JsonProperty("deliveryTotal")
  public BigDecimal getDeliveryTotal() {
    return deliveryTotal;
  }

  public void setDeliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
  }

  public OrderDTO deliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
   * @return buyerItemsTotal
  **/
  @JsonProperty("buyerItemsTotal")
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }

  public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
  }

  public OrderDTO buyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
   * @return buyerTotal
  **/
  @JsonProperty("buyerTotal")
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }

  public void setBuyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
  }

  public OrderDTO buyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
    return this;
  }

 /**
   * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
   * @return buyerItemsTotalBeforeDiscount
  **/
  @JsonProperty("buyerItemsTotalBeforeDiscount")
  public BigDecimal getBuyerItemsTotalBeforeDiscount() {
    return buyerItemsTotalBeforeDiscount;
  }

  public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
  }

  public OrderDTO buyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
   * @return buyerTotalBeforeDiscount
  **/
  @JsonProperty("buyerTotalBeforeDiscount")
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }

  public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
  }

  public OrderDTO buyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    return this;
  }

 /**
   * Get paymentType
   * @return paymentType
  **/
  @JsonProperty("paymentType")
  public OrderPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public OrderDTO paymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

 /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @JsonProperty("paymentMethod")
  public OrderPaymentMethodType getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public OrderDTO paymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

 /**
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
  **/
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  public OrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

 /**
   * Список товаров в заказе.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO items(List<@Valid OrderItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderDTO addItemsItem(OrderItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Список субсидий по типам.
   * @return subsidies
  **/
  @JsonProperty("subsidies")
  public List<@Valid OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderDTO subsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  public OrderDTO addSubsidiesItem(OrderSubsidyDTO subsidiesItem) {
    this.subsidies.add(subsidiesItem);
    return this;
  }

 /**
   * Get delivery
   * @return delivery
  **/
  @JsonProperty("delivery")
  public OrderDeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public OrderDTO delivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

 /**
   * Get buyer
   * @return buyer
  **/
  @JsonProperty("buyer")
  public OrderBuyerDTO getBuyer() {
    return buyer;
  }

  public void setBuyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
  }

  public OrderDTO buyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
    return this;
  }

 /**
   * Комментарий к заказу.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public OrderDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Get taxSystem
   * @return taxSystem
  **/
  @JsonProperty("taxSystem")
  public OrderTaxSystemType getTaxSystem() {
    return taxSystem;
  }

  public void setTaxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
  }

  public OrderDTO taxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
    return this;
  }

 /**
   * **Только для модели DBS**  Запрошена ли отмена. 
   * @return cancelRequested
  **/
  @JsonProperty("cancelRequested")
  public Boolean getCancelRequested() {
    return cancelRequested;
  }

  public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

  public OrderDTO cancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

 /**
   * Get expiryDate
   * @return expiryDate
  **/
  @JsonProperty("expiryDate")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

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

