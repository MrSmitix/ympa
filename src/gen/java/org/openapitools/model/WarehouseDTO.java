package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WarehouseAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о складе.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseDTO   {
  
  private Long id;
  private String name;
  private Long campaignId;
  private Boolean express;
  private WarehouseAddressDTO address;

  /**
   * Идентификатор склада.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор склада.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название склада.
   **/
  
  @ApiModelProperty(required = true, value = "Название склада.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Идентификатор кампании в API и идентификатор магазина.
   **/
  
  @ApiModelProperty(required = true, value = "Идентификатор кампании в API и идентификатор магазина.")
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Возможна ли доставка по модели Экспресс.
   **/
  
  @ApiModelProperty(required = true, value = "Возможна ли доставка по модели Экспресс.")
  @JsonProperty("express")
  @NotNull
  public Boolean getExpress() {
    return express;
  }
  public void setExpress(Boolean express) {
    this.express = express;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
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

