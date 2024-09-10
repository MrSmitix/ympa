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
 * Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
 */
@ApiModel(description="Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. ")

public class OrderBuyerDTO  {
  
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
  public OrderBuyerDTO id(String id) {
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
  public OrderBuyerDTO lastName(String lastName) {
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
  public OrderBuyerDTO firstName(String firstName) {
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
  public OrderBuyerDTO middleName(String middleName) {
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
  public OrderBuyerDTO type(OrderBuyerType type) {
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
    OrderBuyerDTO orderBuyerDTO = (OrderBuyerDTO) o;
    return Objects.equals(this.id, orderBuyerDTO.id) &&
        Objects.equals(this.lastName, orderBuyerDTO.lastName) &&
        Objects.equals(this.firstName, orderBuyerDTO.firstName) &&
        Objects.equals(this.middleName, orderBuyerDTO.middleName) &&
        Objects.equals(this.type, orderBuyerDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBuyerDTO {\n");
    
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

