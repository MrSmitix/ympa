package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderItemInstanceDTO;
import org.openapitools.model.OrderVatType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о маркированном товаре.
 */
@ApiModel(description="Информация о маркированном товаре.")

public class BriefOrderItemDTO  {
  
 /**
  * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  */
  @ApiModelProperty(value = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
  private Long id;

  @ApiModelProperty(value = "")
  @Valid
  private OrderVatType vat;

 /**
  * Количество единиц товара.
  */
  @ApiModelProperty(value = "Количество единиц товара.")
  private Integer count;

 /**
  * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
  */
  @ApiModelProperty(value = "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ")
  @Valid
  private BigDecimal price;

 /**
  * Название товара.
  */
  @ApiModelProperty(value = "Название товара.")
  private String offerName;

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

 /**
  * Переданные вами коды маркировки.
  */
  @ApiModelProperty(value = "Переданные вами коды маркировки.")
  @Valid
  private List<@Valid OrderItemInstanceDTO> instances;
 /**
  * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
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
  public BriefOrderItemDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Get vat
  * @return vat
  */
  @JsonProperty("vat")
  public OrderVatType getVat() {
    return vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
 public void setVat(OrderVatType vat) {
    this.vat = vat;
  }

  /**
   * Sets the <code>vat</code> property.
   */
  public BriefOrderItemDTO vat(OrderVatType vat) {
    this.vat = vat;
    return this;
  }

 /**
  * Количество единиц товара.
  * @return count
  */
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the <code>count</code> property.
   */
 public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Sets the <code>count</code> property.
   */
  public BriefOrderItemDTO count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public BriefOrderItemDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Название товара.
  * @return offerName
  */
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
 public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   * Sets the <code>offerName</code> property.
   */
  public BriefOrderItemDTO offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public BriefOrderItemDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Переданные вами коды маркировки.
  * @return instances
  */
  @JsonProperty("instances")
  public List<@Valid OrderItemInstanceDTO> getInstances() {
    return instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
 public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
  }

  /**
   * Sets the <code>instances</code> property.
   */
  public BriefOrderItemDTO instances(List<@Valid OrderItemInstanceDTO> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Adds a new item to the <code>instances</code> list.
   */
  public BriefOrderItemDTO addInstancesItem(OrderItemInstanceDTO instancesItem) {
    this.instances.add(instancesItem);
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
    BriefOrderItemDTO briefOrderItemDTO = (BriefOrderItemDTO) o;
    return Objects.equals(this.id, briefOrderItemDTO.id) &&
        Objects.equals(this.vat, briefOrderItemDTO.vat) &&
        Objects.equals(this.count, briefOrderItemDTO.count) &&
        Objects.equals(this.price, briefOrderItemDTO.price) &&
        Objects.equals(this.offerName, briefOrderItemDTO.offerName) &&
        Objects.equals(this.offerId, briefOrderItemDTO.offerId) &&
        Objects.equals(this.instances, briefOrderItemDTO.instances);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

