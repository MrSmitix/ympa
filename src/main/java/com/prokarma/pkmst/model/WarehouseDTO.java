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
 * Информация о складе.
 */
@ApiModel(description = "Информация о складе.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  public WarehouseDTO id(Long id) {
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

  public WarehouseDTO name(String name) {
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

  public WarehouseDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании в API и идентификатор магазина.
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор кампании в API и идентификатор магазина.")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public WarehouseDTO express(Boolean express) {
    this.express = express;
    return this;
  }

  /**
   * Возможна ли доставка по модели Экспресс.
   * @return express
   */
  @ApiModelProperty(required = true, value = "Возможна ли доставка по модели Экспресс.")
  public Boolean getExpress() {
    return express;
  }

  public void setExpress(Boolean express) {
    this.express = express;
  }

  public WarehouseDTO address(WarehouseAddressDTO address) {
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
    WarehouseDTO warehouseDTO = (WarehouseDTO) o;
    return Objects.equals(this.id, warehouseDTO.id) &&
        Objects.equals(this.name, warehouseDTO.name) &&
        Objects.equals(this.campaignId, warehouseDTO.campaignId) &&
        Objects.equals(this.express, warehouseDTO.express) &&
        Objects.equals(this.address, warehouseDTO.address);
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

