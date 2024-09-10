package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderBuyerType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о покупателе и его номере телефона.
 */

@Schema(name = "OrderBuyerInfoDTO", description = "Информация о покупателе и его номере телефона.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBuyerInfoDTO {

  private String id;

  private String lastName;

  private String firstName;

  private String middleName;

  private OrderBuyerType type;

  private String phone;

  public OrderBuyerInfoDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор покупателя.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор покупателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderBuyerInfoDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия покупателя.
   * @return lastName
   */
  
  @Schema(name = "lastName", description = "Фамилия покупателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OrderBuyerInfoDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя покупателя.
   * @return firstName
   */
  
  @Schema(name = "firstName", description = "Имя покупателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OrderBuyerInfoDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество покупателя.
   * @return middleName
   */
  
  @Schema(name = "middleName", description = "Отчество покупателя.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public OrderBuyerInfoDTO type(OrderBuyerType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public OrderBuyerType getType() {
    return type;
  }

  public void setType(OrderBuyerType type) {
    this.type = type;
  }

  public OrderBuyerInfoDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
   * @return phone
   */
  
  @Schema(name = "phone", description = "Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

