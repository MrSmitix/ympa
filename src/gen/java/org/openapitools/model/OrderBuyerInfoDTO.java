package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderBuyerType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о покупателе и его номере телефона.
 */
@ApiModel(description="Информация о покупателе и его номере телефона.")

public class OrderBuyerInfoDTO  {
  
 /**
  * Идентификатор покупателя.
  */
  @ApiModelProperty(value = "Идентификатор покупателя.")
  private String id;

 /**
  * Фамилия покупателя.
  */
  @ApiModelProperty(value = "Фамилия покупателя.")
  private String lastName;

 /**
  * Имя покупателя.
  */
  @ApiModelProperty(value = "Имя покупателя.")
  private String firstName;

 /**
  * Отчество покупателя.
  */
  @ApiModelProperty(value = "Отчество покупателя.")
  private String middleName;

  @ApiModelProperty(value = "")
  @Valid
  private OrderBuyerType type;

 /**
  * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
  */
  @ApiModelProperty(value = "Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. ")
  private String phone;
 /**
  * Идентификатор покупателя.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrderBuyerInfoDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Фамилия покупателя.
  * @return lastName
  */
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the <code>lastName</code> property.
   */
 public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the <code>lastName</code> property.
   */
  public OrderBuyerInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
  * Имя покупателя.
  * @return firstName
  */
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the <code>firstName</code> property.
   */
 public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the <code>firstName</code> property.
   */
  public OrderBuyerInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
  * Отчество покупателя.
  * @return middleName
  */
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  /**
   * Sets the <code>middleName</code> property.
   */
 public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Sets the <code>middleName</code> property.
   */
  public OrderBuyerInfoDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OrderBuyerType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OrderBuyerType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrderBuyerInfoDTO type(OrderBuyerType type) {
    this.type = type;
    return this;
  }

 /**
  * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;. 
  * @return phone
  */
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
 public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
  public OrderBuyerInfoDTO phone(String phone) {
    this.phone = phone;
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
    OrderBuyerInfoDTO orderBuyerInfoDTO = (OrderBuyerInfoDTO) o;
    return Objects.equals(this.id, orderBuyerInfoDTO.id) &&
        Objects.equals(this.lastName, orderBuyerInfoDTO.lastName) &&
        Objects.equals(this.firstName, orderBuyerInfoDTO.firstName) &&
        Objects.equals(this.middleName, orderBuyerInfoDTO.middleName) &&
        Objects.equals(this.type, orderBuyerInfoDTO.type) &&
        Objects.equals(this.phone, orderBuyerInfoDTO.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, type, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBuyerInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

