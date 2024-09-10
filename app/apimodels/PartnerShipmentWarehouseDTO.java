package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные о складе отправления.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PartnerShipmentWarehouseDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("address")
  
  private String address;

  public PartnerShipmentWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор склада отправления.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PartnerShipmentWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Наименование склада отправления.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartnerShipmentWarehouseDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Адрес склада отправления.
   * @return address
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

