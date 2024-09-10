package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Заказ.
 **/

@ApiModel(description = "Заказ.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Идентификатор заказа.
   **/
  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор заказа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public OrderDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   **/
  public OrderDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   **/
  public OrderDTO creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  /**
   **/
  public OrderDTO updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   **/
  public OrderDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * Платеж покупателя. 
   **/
  public OrderDTO itemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

  
  @ApiModelProperty(value = "Платеж покупателя. ")
  @JsonProperty("itemsTotal")
  public BigDecimal getItemsTotal() {
    return itemsTotal;
  }
  public void setItemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

  /**
   * Стоимость доставки. 
   **/
  public OrderDTO deliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
    return this;
  }

  
  @ApiModelProperty(value = "Стоимость доставки. ")
  @JsonProperty("deliveryTotal")
  public BigDecimal getDeliveryTotal() {
    return deliveryTotal;
  }
  public void setDeliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
   **/
  public OrderDTO buyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ")
  @JsonProperty("buyerItemsTotal")
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }
  public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
   **/
  public OrderDTO buyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ")
  @JsonProperty("buyerTotal")
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }
  public void setBuyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
  }

  /**
   * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
   **/
  public OrderDTO buyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    return this;
  }

  
  @ApiModelProperty(value = "Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ")
  @JsonProperty("buyerItemsTotalBeforeDiscount")
  public BigDecimal getBuyerItemsTotalBeforeDiscount() {
    return buyerItemsTotalBeforeDiscount;
  }
  public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
   **/
  public OrderDTO buyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). ")
  @JsonProperty("buyerTotalBeforeDiscount")
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }
  public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
  }

  /**
   **/
  public OrderDTO paymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentType")
  public OrderPaymentType getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  /**
   **/
  public OrderDTO paymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethod")
  public OrderPaymentMethodType getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   **/
  public OrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

  
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }
  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  /**
   * Список товаров в заказе.
   **/
  public OrderDTO items(List<OrderItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в заказе.")
  @JsonProperty("items")
  public List<OrderItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderItemDTO> items) {
    this.items = items;
  }

  /**
   * Список субсидий по типам.
   **/
  public OrderDTO subsidies(List<OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  
  @ApiModelProperty(value = "Список субсидий по типам.")
  @JsonProperty("subsidies")
  public List<OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }
  public void setSubsidies(List<OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  /**
   **/
  public OrderDTO delivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delivery")
  public OrderDeliveryDTO getDelivery() {
    return delivery;
  }
  public void setDelivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  /**
   **/
  public OrderDTO buyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buyer")
  public OrderBuyerDTO getBuyer() {
    return buyer;
  }
  public void setBuyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
  }

  /**
   * Комментарий к заказу.
   **/
  public OrderDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий к заказу.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   **/
  public OrderDTO taxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("taxSystem")
  public OrderTaxSystemType getTaxSystem() {
    return taxSystem;
  }
  public void setTaxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
  }

  /**
   * **Только для модели DBS**  Запрошена ли отмена. 
   **/
  public OrderDTO cancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  
  @ApiModelProperty(value = "**Только для модели DBS**  Запрошена ли отмена. ")
  @JsonProperty("cancelRequested")
  public Boolean getCancelRequested() {
    return cancelRequested;
  }
  public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

  /**
   **/
  public OrderDTO expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  
  @ApiModelProperty(example = "23-09-2022 09:12:41", value = "")
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
    return Objects.equals(id, orderDTO.id) &&
        Objects.equals(status, orderDTO.status) &&
        Objects.equals(substatus, orderDTO.substatus) &&
        Objects.equals(creationDate, orderDTO.creationDate) &&
        Objects.equals(updatedAt, orderDTO.updatedAt) &&
        Objects.equals(currency, orderDTO.currency) &&
        Objects.equals(itemsTotal, orderDTO.itemsTotal) &&
        Objects.equals(deliveryTotal, orderDTO.deliveryTotal) &&
        Objects.equals(buyerItemsTotal, orderDTO.buyerItemsTotal) &&
        Objects.equals(buyerTotal, orderDTO.buyerTotal) &&
        Objects.equals(buyerItemsTotalBeforeDiscount, orderDTO.buyerItemsTotalBeforeDiscount) &&
        Objects.equals(buyerTotalBeforeDiscount, orderDTO.buyerTotalBeforeDiscount) &&
        Objects.equals(paymentType, orderDTO.paymentType) &&
        Objects.equals(paymentMethod, orderDTO.paymentMethod) &&
        Objects.equals(fake, orderDTO.fake) &&
        Objects.equals(items, orderDTO.items) &&
        Objects.equals(subsidies, orderDTO.subsidies) &&
        Objects.equals(delivery, orderDTO.delivery) &&
        Objects.equals(buyer, orderDTO.buyer) &&
        Objects.equals(notes, orderDTO.notes) &&
        Objects.equals(taxSystem, orderDTO.taxSystem) &&
        Objects.equals(cancelRequested, orderDTO.cancelRequested) &&
        Objects.equals(expiryDate, orderDTO.expiryDate);
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

