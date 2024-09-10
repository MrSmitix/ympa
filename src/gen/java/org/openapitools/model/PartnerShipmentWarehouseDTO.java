package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Данные о складе отправления.
 **/

@ApiModel(description = "Данные о складе отправления.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PartnerShipmentWarehouseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private String address;

  /**
   * Идентификатор склада отправления.
   **/
  public PartnerShipmentWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор склада отправления.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Наименование склада отправления.
   **/
  public PartnerShipmentWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Наименование склада отправления.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Адрес склада отправления.
   **/
  public PartnerShipmentWarehouseDTO address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "Адрес склада отправления.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
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
    PartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO = (PartnerShipmentWarehouseDTO) o;
    return Objects.equals(id, partnerShipmentWarehouseDTO.id) &&
        Objects.equals(name, partnerShipmentWarehouseDTO.name) &&
        Objects.equals(address, partnerShipmentWarehouseDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerShipmentWarehouseDTO {\n");
    
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

