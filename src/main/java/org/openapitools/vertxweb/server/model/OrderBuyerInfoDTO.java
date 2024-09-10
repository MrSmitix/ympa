package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OrderBuyerType;

/**
 * Информация о покупателе и его номере телефона.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBuyerInfoDTO   {
  
  private String id;
  private String lastName;
  private String firstName;
  private String middleName;
  private OrderBuyerType type;
  private String phone;

  public OrderBuyerInfoDTO () {

  }

  public OrderBuyerInfoDTO (String id, String lastName, String firstName, String middleName, OrderBuyerType type, String phone) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.type = type;
    this.phone = phone;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

    
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

    
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

    
  @JsonProperty("type")
  public OrderBuyerType getType() {
    return type;
  }
  public void setType(OrderBuyerType type) {
    this.type = type;
  }

    
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
