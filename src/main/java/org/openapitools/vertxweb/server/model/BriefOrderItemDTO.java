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
import org.openapitools.vertxweb.server.model.OrderItemInstanceDTO;
import org.openapitools.vertxweb.server.model.OrderVatType;

/**
 * Информация о маркированном товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BriefOrderItemDTO   {
  
  private Long id;
  private OrderVatType vat;
  private Integer count;
  private BigDecimal price;
  private String offerName;
  private String offerId;
  private List<OrderItemInstanceDTO> instances;

  public BriefOrderItemDTO () {

  }

  public BriefOrderItemDTO (Long id, OrderVatType vat, Integer count, BigDecimal price, String offerName, String offerId, List<OrderItemInstanceDTO> instances) {
    this.id = id;
    this.vat = vat;
    this.count = count;
    this.price = price;
    this.offerName = offerName;
    this.offerId = offerId;
    this.instances = instances;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

    
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("instances")
  public List<OrderItemInstanceDTO> getInstances() {
    return instances;
  }
  public void setInstances(List<OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BriefOrderItemDTO briefOrderItemDTO = (BriefOrderItemDTO) o;
    return Objects.equals(id, briefOrderItemDTO.id) &&
        Objects.equals(vat, briefOrderItemDTO.vat) &&
        Objects.equals(count, briefOrderItemDTO.count) &&
        Objects.equals(price, briefOrderItemDTO.price) &&
        Objects.equals(offerName, briefOrderItemDTO.offerName) &&
        Objects.equals(offerId, briefOrderItemDTO.offerId) &&
        Objects.equals(instances, briefOrderItemDTO.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vat, count, price, offerName, offerId, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BriefOrderItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
