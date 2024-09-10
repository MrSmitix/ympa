package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Заказ.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Заказ.")
public class OrderDTO   {
  
  private Long id;

  private OrderStatusType status;

  private OrderSubstatusType substatus;

  private String creationDate;

  private String updatedAt;

  private CurrencyType currency;

  private BigDecimal itemsTotal;

  private BigDecimal deliveryTotal;

  private BigDecimal buyerItemsTotal;

  private BigDecimal buyerTotal;

  private BigDecimal buyerItemsTotalBeforeDiscount;

  private BigDecimal buyerTotalBeforeDiscount;

  private OrderPaymentType paymentType;

  private OrderPaymentMethodType paymentMethod;

  private Boolean fake;

  private List<@Valid OrderItemDTO> items = new ArrayList<>();

  private List<@Valid OrderSubsidyDTO> subsidies;

  private OrderDeliveryDTO delivery;

  private OrderBuyerDTO buyer;

  private String notes;

  private OrderTaxSystemType taxSystem;

  private Boolean cancelRequested;

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
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
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
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
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
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
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
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
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
  public OrderDTO items(List<@Valid OrderItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в заказе.")
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrderItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO addItemsItem(OrderItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * Список субсидий по типам.
   **/
  public OrderDTO subsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
    return this;
  }

  
  @ApiModelProperty(value = "Список субсидий по типам.")
  @JsonProperty("subsidies")
  public List<@Valid OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }
  public void setSubsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderDTO addSubsidiesItem(OrderSubsidyDTO subsidiesItem) {
    if (this.subsidies == null) {
      this.subsidies = new ArrayList<>();
    }
    this.subsidies.add(subsidiesItem);
    return this;
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

