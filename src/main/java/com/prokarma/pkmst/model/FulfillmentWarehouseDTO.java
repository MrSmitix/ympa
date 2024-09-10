package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.WarehouseAddressDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Склад Маркета (FBY).
 */
@ApiModel(description = "Склад Маркета (FBY).")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FulfillmentWarehouseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private WarehouseAddressDTO address;

  public FulfillmentWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор склада.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FulfillmentWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название склада.
   * @return name
   */
  @ApiModelProperty(required = true, value = "Название склада.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FulfillmentWarehouseDTO address(WarehouseAddressDTO address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

