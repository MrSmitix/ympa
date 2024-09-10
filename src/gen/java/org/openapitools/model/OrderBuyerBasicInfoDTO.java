package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderBuyerType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о покупателе с базовыми полями.
 **/
@ApiModel(description="Информация о покупателе с базовыми полями.")

public class OrderBuyerBasicInfoDTO  {
  
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
  @Valid
  private OrderBuyerType type;
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

  public OrderBuyerBasicInfoDTO id(String id) {
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

  public OrderBuyerBasicInfoDTO lastName(String lastName) {
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

  public OrderBuyerBasicInfoDTO firstName(String firstName) {
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

  public OrderBuyerBasicInfoDTO middleName(String middleName) {
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

  public OrderBuyerBasicInfoDTO type(OrderBuyerType type) {
    this.type = type;
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
    OrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO = (OrderBuyerBasicInfoDTO) o;
    return Objects.equals(this.id, orderBuyerBasicInfoDTO.id) &&
        Objects.equals(this.lastName, orderBuyerBasicInfoDTO.lastName) &&
        Objects.equals(this.firstName, orderBuyerBasicInfoDTO.firstName) &&
        Objects.equals(this.middleName, orderBuyerBasicInfoDTO.middleName) &&
        Objects.equals(this.type, orderBuyerBasicInfoDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBuyerBasicInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

