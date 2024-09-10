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
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderVatType;



/**
 * Информация о маркированном товаре.
 **/

@ApiModel(description = "Информация о маркированном товаре.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BriefOrderItemDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("vat")
  private OrderVatType vat;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("offerName")
  private String offerName;

  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("instances")
  private List<OrderItemInstanceDTO> instances = null;

  /**
   * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
   **/
  public BriefOrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public BriefOrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }
  public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Количество единиц товара.
   **/
  public BriefOrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(value = "Количество единиц товара.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
   **/
  public BriefOrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Название товара.
   **/
  public BriefOrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

  
  @ApiModelProperty(value = "Название товара.")
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public BriefOrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Переданные вами коды маркировки.
   **/
  public BriefOrderItemDTO instances(List<OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  
  @ApiModelProperty(value = "Переданные вами коды маркировки.")
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

