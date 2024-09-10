package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.OrderBuyerDTO;
import org.openapitools.server.api.model.OrderDeliveryDTO;
import org.openapitools.server.api.model.OrderItemDTO;
import org.openapitools.server.api.model.OrderPaymentMethodType;
import org.openapitools.server.api.model.OrderPaymentType;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubsidyDTO;
import org.openapitools.server.api.model.OrderSubstatusType;
import org.openapitools.server.api.model.OrderTaxSystemType;

/**
 * Заказ.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<OrderItemDTO> items = new ArrayList<>();
  private List<OrderSubsidyDTO> subsidies;
  private OrderDeliveryDTO delivery;
  private OrderBuyerDTO buyer;
  private String notes;
  private OrderTaxSystemType taxSystem;
  private Boolean cancelRequested;
  private String expiryDate;

  public OrderDTO () {

  }

  public OrderDTO (Long id, OrderStatusType status, OrderSubstatusType substatus, String creationDate, String updatedAt, CurrencyType currency, BigDecimal itemsTotal, BigDecimal deliveryTotal, BigDecimal buyerItemsTotal, BigDecimal buyerTotal, BigDecimal buyerItemsTotalBeforeDiscount, BigDecimal buyerTotalBeforeDiscount, OrderPaymentType paymentType, OrderPaymentMethodType paymentMethod, Boolean fake, List<OrderItemDTO> items, List<OrderSubsidyDTO> subsidies, OrderDeliveryDTO delivery, OrderBuyerDTO buyer, String notes, OrderTaxSystemType taxSystem, Boolean cancelRequested, String expiryDate) {
    this.id = id;
    this.status = status;
    this.substatus = substatus;
    this.creationDate = creationDate;
    this.updatedAt = updatedAt;
    this.currency = currency;
    this.itemsTotal = itemsTotal;
    this.deliveryTotal = deliveryTotal;
    this.buyerItemsTotal = buyerItemsTotal;
    this.buyerTotal = buyerTotal;
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    this.paymentType = paymentType;
    this.paymentMethod = paymentMethod;
    this.fake = fake;
    this.items = items;
    this.subsidies = subsidies;
    this.delivery = delivery;
    this.buyer = buyer;
    this.notes = notes;
    this.taxSystem = taxSystem;
    this.cancelRequested = cancelRequested;
    this.expiryDate = expiryDate;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

    
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

    
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

    
  @JsonProperty("itemsTotal")
  public BigDecimal getItemsTotal() {
    return itemsTotal;
  }
  public void setItemsTotal(BigDecimal itemsTotal) {
    this.itemsTotal = itemsTotal;
  }

    
  @JsonProperty("deliveryTotal")
  public BigDecimal getDeliveryTotal() {
    return deliveryTotal;
  }
  public void setDeliveryTotal(BigDecimal deliveryTotal) {
    this.deliveryTotal = deliveryTotal;
  }

    
  @JsonProperty("buyerItemsTotal")
  public BigDecimal getBuyerItemsTotal() {
    return buyerItemsTotal;
  }
  public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
    this.buyerItemsTotal = buyerItemsTotal;
  }

    
  @JsonProperty("buyerTotal")
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }
  public void setBuyerTotal(BigDecimal buyerTotal) {
    this.buyerTotal = buyerTotal;
  }

    
  @JsonProperty("buyerItemsTotalBeforeDiscount")
  public BigDecimal getBuyerItemsTotalBeforeDiscount() {
    return buyerItemsTotalBeforeDiscount;
  }
  public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
    this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
  }

    
  @JsonProperty("buyerTotalBeforeDiscount")
  public BigDecimal getBuyerTotalBeforeDiscount() {
    return buyerTotalBeforeDiscount;
  }
  public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
    this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
  }

    
  @JsonProperty("paymentType")
  public OrderPaymentType getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(OrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

    
  @JsonProperty("paymentMethod")
  public OrderPaymentMethodType getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

    
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }
  public void setFake(Boolean fake) {
    this.fake = fake;
  }

    
  @JsonProperty("items")
  public List<OrderItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderItemDTO> items) {
    this.items = items;
  }

    
  @JsonProperty("subsidies")
  public List<OrderSubsidyDTO> getSubsidies() {
    return subsidies;
  }
  public void setSubsidies(List<OrderSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

    
  @JsonProperty("delivery")
  public OrderDeliveryDTO getDelivery() {
    return delivery;
  }
  public void setDelivery(OrderDeliveryDTO delivery) {
    this.delivery = delivery;
  }

    
  @JsonProperty("buyer")
  public OrderBuyerDTO getBuyer() {
    return buyer;
  }
  public void setBuyer(OrderBuyerDTO buyer) {
    this.buyer = buyer;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("taxSystem")
  public OrderTaxSystemType getTaxSystem() {
    return taxSystem;
  }
  public void setTaxSystem(OrderTaxSystemType taxSystem) {
    this.taxSystem = taxSystem;
  }

    
  @JsonProperty("cancelRequested")
  public Boolean getCancelRequested() {
    return cancelRequested;
  }
  public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

    
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
