package apimodels;

import apimodels.CurrencyType;
import apimodels.OrderBuyerDTO;
import apimodels.OrderDeliveryDTO;
import apimodels.OrderItemDTO;
import apimodels.OrderPaymentMethodType;
import apimodels.OrderPaymentType;
import apimodels.OrderStatusType;
import apimodels.OrderSubsidyDTO;
import apimodels.OrderSubstatusType;
import apimodels.OrderTaxSystemType;
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
 * Заказ.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("status")
  @Valid

  private OrderStatusType status;

  @JsonProperty("substatus")
  @Valid

  private OrderSubstatusType substatus;

  @JsonProperty("creationDate")
  
  private String creationDate;

  @JsonProperty("updatedAt")
  
  private String updatedAt;

  @JsonProperty("currency")
  @Valid

  private CurrencyType currency;

  @JsonProperty("itemsTotal")
  @Valid

  private BigDecimal itemsTotal;

  @JsonProperty("deliveryTotal")
  @Valid

  private BigDecimal deliveryTotal;

  @JsonProperty("buyerItemsTotal")
  @Valid

  private BigDecimal buyerItemsTotal;

  @JsonProperty("buyerTotal")
  @Valid

  private BigDecimal buyerTotal;

  @JsonProperty("buyerItemsTotalBeforeDiscount")
  @Valid

  private BigDecimal buyerItemsTotalBeforeDiscount;

  @JsonProperty("buyerTotalBeforeDiscount")
  @Valid

  private BigDecimal buyerTotalBeforeDiscount;

  @JsonProperty("paymentType")
  @Valid

  private OrderPaymentType paymentType;

  @JsonProperty("paymentMethod")
  @Valid

  private OrderPaymentMethodType paymentMethod;

  @JsonProperty("fake")
  
  private Boolean fake;

  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid OrderItemDTO> items = new ArrayList<>();

  @JsonProperty("subsidies")
  @Valid

  private List<@Valid OrderSubsidyDTO> subsidies = null;

  @JsonProperty("delivery")
  @Valid

  private OrderDeliveryDTO delivery;

  @JsonProperty("buyer")
  @Valid

  private OrderBuyerDTO buyer;

  @JsonProperty("notes")
  
  private String notes;

  @JsonProperty("taxSystem")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public List<@Valid OrderItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemDTO> items) {
    this.items = items;
  }

  public OrderDTO subsidies(List<@Valid OrderSubsidyDTO> subsidies) {
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
  **/
  public List<@Valid OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(List<@Valid OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

  public OrderDTO delivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

