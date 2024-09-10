package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.WarehouseAddressDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о складе.
 */

@Schema(name = "WarehouseDTO", description = "Информация о складе.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseDTO {

  private Long id;

  private String name;

  private Long campaignId;

  private Boolean express;

  private WarehouseAddressDTO address;

  public WarehouseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseDTO(Long id, String name, Long campaignId, Boolean express) {
    this.id = id;
    this.name = name;
    this.campaignId = campaignId;
    this.express = express;
  }

  public WarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор склада.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор склада.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "name", description = "Название склада.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор кампании в API и идентификатор магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
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
  @NotNull 
  @Schema(name = "express", description = "Возможна ли доставка по модели Экспресс.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("express")
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
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

