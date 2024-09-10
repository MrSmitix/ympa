package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.WarehouseAddressDTO;

/**
 * Склад Маркета (FBY).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FulfillmentWarehouseDTO   {
  
  private Long id;
  private String name;
  private WarehouseAddressDTO address;

  public FulfillmentWarehouseDTO () {

  }

  public FulfillmentWarehouseDTO (Long id, String name, WarehouseAddressDTO address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("address")
  public WarehouseAddressDTO getAddress() {
    return address;
  }
  public void setAddress(WarehouseAddressDTO address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentWarehouseDTO fulfillmentWarehouseDTO = (FulfillmentWarehouseDTO) o;
    return Objects.equals(id, fulfillmentWarehouseDTO.id) &&
        Objects.equals(name, fulfillmentWarehouseDTO.name) &&
        Objects.equals(address, fulfillmentWarehouseDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentWarehouseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
