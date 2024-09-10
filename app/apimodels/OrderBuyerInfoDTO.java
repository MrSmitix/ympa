package apimodels;

import apimodels.OrderBuyerType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о покупателе и его номере телефона.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBuyerInfoDTO   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("lastName")
  
  private String lastName;

  @JsonProperty("firstName")
  
  private String firstName;

  @JsonProperty("middleName")
  
  private String middleName;

  @JsonProperty("type")
  @Valid

  private OrderBuyerType type;

  @JsonProperty("phone")
  
  private String phone;

  public OrderBuyerInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор покупателя.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, orderBuyerInfoDTO.id) &&
        Objects.equals(lastName, orderBuyerInfoDTO.lastName) &&
        Objects.equals(firstName, orderBuyerInfoDTO.firstName) &&
        Objects.equals(middleName, orderBuyerInfoDTO.middleName) &&
        Objects.equals(type, orderBuyerInfoDTO.type) &&
        Objects.equals(phone, orderBuyerInfoDTO.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, type, phone);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

