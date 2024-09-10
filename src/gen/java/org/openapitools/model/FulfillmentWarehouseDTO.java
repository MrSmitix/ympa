package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.WarehouseAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Склад Маркета (FBY).
 */
@ApiModel(description="Склад Маркета (FBY).")

public class FulfillmentWarehouseDTO  {
  
 /**
  * Идентификатор склада.
  */
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  private Long id;

 /**
  * Название склада.
  */
  @ApiModelProperty(required = true, value = "Название склада.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private WarehouseAddressDTO address;
 /**
  * Идентификатор склада.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FulfillmentWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название склада.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public FulfillmentWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get address
  * @return address
  */
  @JsonProperty("address")
  public WarehouseAddressDTO getAddress() {
    return address;
  }

  /**
   * Sets the <code>address</code> property.
   */
 public void setAddress(WarehouseAddressDTO address) {
    this.address = address;
  }

  /**
   * Sets the <code>address</code> property.
   */
  public FulfillmentWarehouseDTO address(WarehouseAddressDTO address) {
    this.address = address;
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
    FulfillmentWarehouseDTO fulfillmentWarehouseDTO = (FulfillmentWarehouseDTO) o;
    return Objects.equals(this.id, fulfillmentWarehouseDTO.id) &&
        Objects.equals(this.name, fulfillmentWarehouseDTO.name) &&
        Objects.equals(this.address, fulfillmentWarehouseDTO.address);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

