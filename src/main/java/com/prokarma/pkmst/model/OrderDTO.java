package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CurrencyType;
import com.prokarma.pkmst.model.OrderBuyerDTO;
import com.prokarma.pkmst.model.OrderDeliveryDTO;
import com.prokarma.pkmst.model.OrderItemDTO;
import com.prokarma.pkmst.model.OrderPaymentMethodType;
import com.prokarma.pkmst.model.OrderPaymentType;
import com.prokarma.pkmst.model.OrderStatusType;
import com.prokarma.pkmst.model.OrderSubsidyDTO;
import com.prokarma.pkmst.model.OrderSubstatusType;
import com.prokarma.pkmst.model.OrderTaxSystemType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Заказ.
 */
@ApiModel(description = "Заказ.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("status")
  private OrderStatusType status;

  @JsonProperty("substatus")
  private OrderSubstatusType substatus;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("updatedAt")
  private String updatedAt;

  @JsonProperty("currency")
  private CurrencyType currency;

  @JsonProperty("itemsTotal")
  private BigDecimal itemsTotal;

  @JsonProperty("deliveryTotal")
  private BigDecimal deliveryTotal;

  @JsonProperty("buyerItemsTotal")
  private BigDecimal buyerItemsTotal;

  @JsonProperty("buyerTotal")
  private BigDecimal buyerTotal;

  @JsonProperty("buyerItemsTotalBeforeDiscount")
  private BigDecimal buyerItemsTotalBeforeDiscount;

  @JsonProperty("buyerTotalBeforeDiscount")
  private BigDecimal buyerTotalBeforeDiscount;

  @JsonProperty("paymentType")
  private OrderPaymentType paymentType;

  @JsonProperty("paymentMethod")
  private OrderPaymentMethodType paymentMethod;

  @JsonProperty("fake")
  private Boolean fake;

  @JsonProperty("items")
  
  private List<OrderItemDTO> items = new ArrayList<>();

  @JsonProperty("subsidies")
  
  private List<OrderSubsidyDTO> subsidies = null;

  @JsonProperty("delivery")
  private OrderDeliveryDTO delivery;

  @JsonProperty("buyer")
  private OrderBuyerDTO buyer;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("taxSystem")
  private OrderTaxSystemType taxSystem;

  @JsonProperty("cancelRequested")
  private Boolean cancelRequested;

  @JsonProperty("expiryDate")
  private String expiryDate;

  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор заказа.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
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
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Платеж покупателя. ")
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
  @ApiModelProperty(value = "Стоимость доставки. ")
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
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ")
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }

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
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ")
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }

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
  @ApiModelProperty(value = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ")
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
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ")
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }

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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  public Boolean getFake() {
    return fake;
  }

  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  public OrderDTO items(List<OrderItemDTO> items) {
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
  @ApiModelProperty(required = true, value = "Список товаров в заказе.")
  public List<OrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO subsidies(List<OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  public OrderDTO addSubsidiesItem(OrderSubsidyDTO subsidiesItem) {
    if (this.subsidies == null) {
      this.subsidies = new ArrayList<>();
    }
    this.subsidies.add(subsidiesItem);
    return this;
  }

  /**
   * Список субсидий по типам.
   * @return subsidies
   */
  @ApiModelProperty(value = "Список субсидий по типам.")
  public List<OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(List<OrderSubsidyDTO> subsidies) {
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Комментарий к заказу.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "**Только для модели DBS**  Запрошена ли отмена. ")
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
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

