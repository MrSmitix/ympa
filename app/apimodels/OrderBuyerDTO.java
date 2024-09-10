package apimodels;

import apimodels.OrderBuyerType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBuyerDTO   {
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

  public OrderBuyerDTO id(String id) {
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

  public OrderBuyerDTO lastName(String lastName) {
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

  public OrderBuyerDTO firstName(String firstName) {
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

  public OrderBuyerDTO middleName(String middleName) {
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

  public OrderBuyerDTO type(OrderBuyerType type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBuyerDTO orderBuyerDTO = (OrderBuyerDTO) o;
    return Objects.equals(id, orderBuyerDTO.id) &&
        Objects.equals(lastName, orderBuyerDTO.lastName) &&
        Objects.equals(firstName, orderBuyerDTO.firstName) &&
        Objects.equals(middleName, orderBuyerDTO.middleName) &&
        Objects.equals(type, orderBuyerDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName, firstName, middleName, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

