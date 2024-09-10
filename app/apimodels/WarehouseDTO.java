package apimodels;

import apimodels.WarehouseAddressDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о складе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WarehouseDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("campaignId")
  @NotNull

  private Long campaignId;

  @JsonProperty("express")
  @NotNull

  private Boolean express;

  @JsonProperty("address")
  @Valid

  private WarehouseAddressDTO address;

  public WarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор склада.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

