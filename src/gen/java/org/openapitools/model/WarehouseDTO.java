package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.WarehouseAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о складе.
 **/
@ApiModel(description="Информация о складе.")

public class WarehouseDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
 /**
   * Идентификатор склада.
  **/
  private Long id;

  @ApiModelProperty(required = true, value = "Название склада.")
 /**
   * Название склада.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "Идентификатор кампании в API и идентификатор магазина.")
 /**
   * Идентификатор кампании в API и идентификатор магазина.
  **/
  private Long campaignId;

  @ApiModelProperty(required = true, value = "Возможна ли доставка по модели Экспресс.")
 /**
   * Возможна ли доставка по модели Экспресс.
  **/
  private Boolean express;

  @ApiModelProperty(value = "")
  @Valid
  private WarehouseAddressDTO address;
 /**
   * Идентификатор склада.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Название склада.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Идентификатор кампании в API и идентификатор магазина.
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public WarehouseDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Возможна ли доставка по модели Экспресс.
   * @return express
  **/
  @JsonProperty("express")
  @NotNull
  public Boolean getExpress() {
    return express;
  }

  public void setExpress(Boolean express) {
    this.express = express;
  }

  public WarehouseDTO express(Boolean express) {
    this.express = express;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public WarehouseAddressDTO getAddress() {
    return address;
  }

  public void setAddress(WarehouseAddressDTO address) {
    this.address = address;
  }

  public WarehouseDTO address(WarehouseAddressDTO address) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

