package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderBuyerType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о покупателе и его номере телефона.
 **/
@ApiModel(description="Информация о покупателе и его номере телефона.")

public class OrderBuyerInfoDTO  {
  
  @ApiModelProperty(value = "Идентификатор покупателя.")
 /**
   * Идентификатор покупателя.
  **/
  private String id;

  @ApiModelProperty(value = "Фамилия покупателя.")
 /**
   * Фамилия покупателя.
  **/
  private String lastName;

  @ApiModelProperty(value = "Имя покупателя.")
 /**
   * Имя покупателя.
  **/
  private String firstName;

  @ApiModelProperty(value = "Отчество покупателя.")
 /**
   * Отчество покупателя.
  **/
  private String middleName;

  @ApiModelProperty(value = "")
  private OrderBuyerType type;

  @ApiModelProperty(value = "Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. ")
 /**
   * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
  **/
  private String phone;
 /**
   * Идентификатор покупателя.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderBuyerInfoDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Фамилия покупателя.
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OrderBuyerInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Имя покупателя.
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OrderBuyerInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Отчество покупателя.
   * @return middleName
  **/
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public OrderBuyerInfoDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OrderBuyerType getType() {
    return type;
  }

  public void setType(OrderBuyerType type) {
    this.type = type;
  }

  public OrderBuyerInfoDTO type(OrderBuyerType type) {
    this.type = type;
    return this;
  }

 /**
   * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;. 
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

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

