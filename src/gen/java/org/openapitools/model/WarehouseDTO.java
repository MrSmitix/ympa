package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseAddressDTO;



/**
 * Информация о складе.
 **/

@ApiModel(description = "Информация о складе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("express")
  private Boolean express;

  @JsonProperty("address")
  private WarehouseAddressDTO address;

  /**
   * Идентификатор склада.
   **/
  public WarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название склада.
   **/
  public WarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название склада.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Идентификатор кампании в API и идентификатор магазина.
   **/
  public WarehouseDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кампании в API и идентификатор магазина.")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Возможна ли доставка по модели Экспресс.
   **/
  public WarehouseDTO express(Boolean express) {
    this.express = express;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Возможна ли доставка по модели Экспресс.")
  @JsonProperty("express")
  public Boolean getExpress() {
    return express;
  }
  public void setExpress(Boolean express) {
    this.express = express;
  }

  /**
   **/
  public WarehouseDTO address(WarehouseAddressDTO address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    WarehouseDTO warehouseDTO = (WarehouseDTO) o;
    return Objects.equals(id, warehouseDTO.id) &&
        Objects.equals(name, warehouseDTO.name) &&
        Objects.equals(campaignId, warehouseDTO.campaignId) &&
        Objects.equals(express, warehouseDTO.express) &&
        Objects.equals(address, warehouseDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, campaignId, express, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    express: ").append(toIndentedString(express)).append("\n");
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

