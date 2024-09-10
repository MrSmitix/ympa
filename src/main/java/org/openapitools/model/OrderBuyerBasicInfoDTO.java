/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderBuyerType;



/**
 * Информация о покупателе с базовыми полями.
 */

@ApiModel(description = "Информация о покупателе с базовыми полями.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBuyerBasicInfoDTO   {
  
  private String id;
  private String lastName;
  private String firstName;
  private String middleName;
  private OrderBuyerType type;

  /**
   * Идентификатор покупателя.
   */
  public OrderBuyerBasicInfoDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор покупателя.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Фамилия покупателя.
   */
  public OrderBuyerBasicInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "Фамилия покупателя.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Имя покупателя.
   */
  public OrderBuyerBasicInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "Имя покупателя.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Отчество покупателя.
   */
  public OrderBuyerBasicInfoDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  
  @ApiModelProperty(value = "Отчество покупателя.")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   */
  public OrderBuyerBasicInfoDTO type(OrderBuyerType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OrderBuyerType getType() {
    return type;
  }
  public void setType(OrderBuyerType type) {
    this.type = type;
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
    return Objects.equals(id, orderBuyerBasicInfoDTO.id) &&
        Objects.equals(lastName, orderBuyerBasicInfoDTO.lastName) &&
        Objects.equals(firstName, orderBuyerBasicInfoDTO.firstName) &&
        Objects.equals(middleName, orderBuyerBasicInfoDTO.middleName) &&
        Objects.equals(type, orderBuyerBasicInfoDTO.type);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

