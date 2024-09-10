package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OrderItemDetailDTO;
import org.openapitools.vertxweb.server.model.OrderItemInstanceDTO;
import org.openapitools.vertxweb.server.model.OrderItemInstanceType;
import org.openapitools.vertxweb.server.model.OrderItemPromoDTO;
import org.openapitools.vertxweb.server.model.OrderItemSubsidyDTO;
import org.openapitools.vertxweb.server.model.OrderVatType;

/**
 * Список товаров в заказе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDTO   {
  
  private Long id;
  private String offerId;
  private String offerName;
  private BigDecimal price;
  private BigDecimal buyerPrice;
  private BigDecimal buyerPriceBeforeDiscount;
  private BigDecimal priceBeforeDiscount;
  private Integer count;
  private OrderVatType vat;
  private String shopSku;
  private BigDecimal subsidy;
  private String partnerWarehouseId;
  private List<OrderItemPromoDTO> promos;
  private List<OrderItemInstanceDTO> instances;
  private List<OrderItemDetailDTO> details;
  private List<OrderItemSubsidyDTO> subsidies;
  private List<OrderItemInstanceType> requiredInstanceTypes;

  public OrderItemDTO () {

  }

  public OrderItemDTO (Long id, String offerId, String offerName, BigDecimal price, BigDecimal buyerPrice, BigDecimal buyerPriceBeforeDiscount, BigDecimal priceBeforeDiscount, Integer count, OrderVatType vat, String shopSku, BigDecimal subsidy, String partnerWarehouseId, List<OrderItemPromoDTO> promos, List<OrderItemInstanceDTO> instances, List<OrderItemDetailDTO> details, List<OrderItemSubsidyDTO> subsidies, List<OrderItemInstanceType> requiredInstanceTypes) {
    this.id = id;
    this.offerId = offerId;
    this.offerName = offerName;
    this.price = price;
    this.buyerPrice = buyerPrice;
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    this.priceBeforeDiscount = priceBeforeDiscount;
    this.count = count;
    this.vat = vat;
    this.shopSku = shopSku;
    this.subsidy = subsidy;
    this.partnerWarehouseId = partnerWarehouseId;
    this.promos = promos;
    this.instances = instances;
    this.details = details;
    this.subsidies = subsidies;
    this.requiredInstanceTypes = requiredInstanceTypes;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("buyerPrice")
  public BigDecimal getBuyerPrice() {
    return buyerPrice;
  }
  public void setBuyerPrice(BigDecimal buyerPrice) {
    this.buyerPrice = buyerPrice;
  }

    
  @JsonProperty("buyerPriceBeforeDiscount")
  public BigDecimal getBuyerPriceBeforeDiscount() {
    return buyerPriceBeforeDiscount;
  }
  public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
    this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
  }

    
  @JsonProperty("priceBeforeDiscount")
  public BigDecimal getPriceBeforeDiscount() {
    return priceBeforeDiscount;
  }
  public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
    this.priceBeforeDiscount = priceBeforeDiscount;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

    
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

    
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

    
  @JsonProperty("subsidy")
  public BigDecimal getSubsidy() {
    return subsidy;
  }
  public void setSubsidy(BigDecimal subsidy) {
    this.subsidy = subsidy;
  }

    
  @JsonProperty("partnerWarehouseId")
  public String getPartnerWarehouseId() {
    return partnerWarehouseId;
  }
  public void setPartnerWarehouseId(String partnerWarehouseId) {
    this.partnerWarehouseId = partnerWarehouseId;
  }

    
  @JsonProperty("promos")
  public List<OrderItemPromoDTO> getPromos() {
    return promos;
  }
  public void setPromos(List<OrderItemPromoDTO> promos) {
    this.promos = promos;
  }

    
  @JsonProperty("instances")
  public List<OrderItemInstanceDTO> getInstances() {
    return instances;
  }
  public void setInstances(List<OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

    
  @JsonProperty("details")
  public List<OrderItemDetailDTO> getDetails() {
    return details;
  }
  public void setDetails(List<OrderItemDetailDTO> details) {
    this.details = details;
  }

    
  @JsonProperty("subsidies")
  public List<OrderItemSubsidyDTO> getSubsidies() {
    return subsidies;
  }
  public void setSubsidies(List<OrderItemSubsidyDTO> subsidies) {
    this.subsidies = subsidies;
  }

    
  @JsonProperty("requiredInstanceTypes")
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
