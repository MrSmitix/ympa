package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.OrderBuyerType;

/**
 * Информация о покупателе с базовыми полями.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBuyerBasicInfoDTO   {
  
  private String id;
  private String lastName;
  private String firstName;
  private String middleName;
  private OrderBuyerType type;

  public OrderBuyerBasicInfoDTO () {

  }

  public OrderBuyerBasicInfoDTO (String id, String lastName, String firstName, String middleName, OrderBuyerType type) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.type = type;
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
