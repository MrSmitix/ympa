package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OutletAddressDTO;
import org.openapitools.vertxweb.server.model.OutletDeliveryRuleDTO;
import org.openapitools.vertxweb.server.model.OutletType;
import org.openapitools.vertxweb.server.model.OutletVisibilityType;
import org.openapitools.vertxweb.server.model.OutletWorkingScheduleDTO;

/**
 * Информация о точке продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletDTO   {
  
  private String name;
  private OutletType type;
  private String coords;
  private Boolean isMain;
  private String shopOutletCode;
  private OutletVisibilityType visibility;
  private OutletAddressDTO address;
  private List<String> phones = new ArrayList<>();
  private OutletWorkingScheduleDTO workingSchedule;
  private List<OutletDeliveryRuleDTO> deliveryRules;
  private Long storagePeriod;

  public OutletDTO () {

  }

  public OutletDTO (String name, OutletType type, String coords, Boolean isMain, String shopOutletCode, OutletVisibilityType visibility, OutletAddressDTO address, List<String> phones, OutletWorkingScheduleDTO workingSchedule, List<OutletDeliveryRuleDTO> deliveryRules, Long storagePeriod) {
    this.name = name;
    this.type = type;
    this.coords = coords;
    this.isMain = isMain;
    this.shopOutletCode = shopOutletCode;
    this.visibility = visibility;
    this.address = address;
    this.phones = phones;
    this.workingSchedule = workingSchedule;
    this.deliveryRules = deliveryRules;
    this.storagePeriod = storagePeriod;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("type")
  public OutletType getType() {
    return type;
  }
  public void setType(OutletType type) {
    this.type = type;
  }

    
  @JsonProperty("coords")
  public String getCoords() {
    return coords;
  }
  public void setCoords(String coords) {
    this.coords = coords;
  }

    
  @JsonProperty("isMain")
  public Boolean getIsMain() {
    return isMain;
  }
  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

    
  @JsonProperty("shopOutletCode")
  public String getShopOutletCode() {
    return shopOutletCode;
  }
  public void setShopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
  }

    
  @JsonProperty("visibility")
  public OutletVisibilityType getVisibility() {
    return visibility;
  }
  public void setVisibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
  }

    
  @JsonProperty("address")
  public OutletAddressDTO getAddress() {
    return address;
  }
  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

    
  @JsonProperty("phones")
  public List<String> getPhones() {
    return phones;
  }
  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

    
  @JsonProperty("workingSchedule")
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }
  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

    
  @JsonProperty("deliveryRules")
  public List<OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }
  public void setDeliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

    
  @JsonProperty("storagePeriod")
  public Long getStoragePeriod() {
    return storagePeriod;
  }
  public void setStoragePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletDTO outletDTO = (OutletDTO) o;
    return Objects.equals(name, outletDTO.name) &&
        Objects.equals(type, outletDTO.type) &&
        Objects.equals(coords, outletDTO.coords) &&
        Objects.equals(isMain, outletDTO.isMain) &&
        Objects.equals(shopOutletCode, outletDTO.shopOutletCode) &&
        Objects.equals(visibility, outletDTO.visibility) &&
        Objects.equals(address, outletDTO.address) &&
        Objects.equals(phones, outletDTO.phones) &&
        Objects.equals(workingSchedule, outletDTO.workingSchedule) &&
        Objects.equals(deliveryRules, outletDTO.deliveryRules) &&
        Objects.equals(storagePeriod, outletDTO.storagePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, coords, isMain, shopOutletCode, visibility, address, phones, workingSchedule, deliveryRules, storagePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    shopOutletCode: ").append(toIndentedString(shopOutletCode)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    workingSchedule: ").append(toIndentedString(workingSchedule)).append("\n");
    sb.append("    deliveryRules: ").append(toIndentedString(deliveryRules)).append("\n");
    sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
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
