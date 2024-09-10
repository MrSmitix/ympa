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
import org.openapitools.vertxweb.server.model.OutletStatusType;
import org.openapitools.vertxweb.server.model.OutletType;
import org.openapitools.vertxweb.server.model.OutletVisibilityType;
import org.openapitools.vertxweb.server.model.OutletWorkingScheduleDTO;
import org.openapitools.vertxweb.server.model.RegionDTO;

/**
 * Информация о точке продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FullOutletDTO   {
  
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
  private Long id;
  private OutletStatusType status;
  private RegionDTO region;
  private String shopOutletId;
  private String workingTime;
  private String moderationReason;

  public FullOutletDTO () {

  }

  public FullOutletDTO (String name, OutletType type, String coords, Boolean isMain, String shopOutletCode, OutletVisibilityType visibility, OutletAddressDTO address, List<String> phones, OutletWorkingScheduleDTO workingSchedule, List<OutletDeliveryRuleDTO> deliveryRules, Long storagePeriod, Long id, OutletStatusType status, RegionDTO region, String shopOutletId, String workingTime, String moderationReason) {
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
    this.id = id;
    this.status = status;
    this.region = region;
    this.shopOutletId = shopOutletId;
    this.workingTime = workingTime;
    this.moderationReason = moderationReason;
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

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("status")
  public OutletStatusType getStatus() {
    return status;
  }
  public void setStatus(OutletStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }
  public void setRegion(RegionDTO region) {
    this.region = region;
  }

    
  @JsonProperty("shopOutletId")
  public String getShopOutletId() {
    return shopOutletId;
  }
  public void setShopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
  }

    
  @JsonProperty("workingTime")
  public String getWorkingTime() {
    return workingTime;
  }
  public void setWorkingTime(String workingTime) {
    this.workingTime = workingTime;
  }

    
  @JsonProperty("moderationReason")
  public String getModerationReason() {
    return moderationReason;
  }
  public void setModerationReason(String moderationReason) {
    this.moderationReason = moderationReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullOutletDTO fullOutletDTO = (FullOutletDTO) o;
    return Objects.equals(name, fullOutletDTO.name) &&
        Objects.equals(type, fullOutletDTO.type) &&
        Objects.equals(coords, fullOutletDTO.coords) &&
        Objects.equals(isMain, fullOutletDTO.isMain) &&
        Objects.equals(shopOutletCode, fullOutletDTO.shopOutletCode) &&
        Objects.equals(visibility, fullOutletDTO.visibility) &&
        Objects.equals(address, fullOutletDTO.address) &&
        Objects.equals(phones, fullOutletDTO.phones) &&
        Objects.equals(workingSchedule, fullOutletDTO.workingSchedule) &&
        Objects.equals(deliveryRules, fullOutletDTO.deliveryRules) &&
        Objects.equals(storagePeriod, fullOutletDTO.storagePeriod) &&
        Objects.equals(id, fullOutletDTO.id) &&
        Objects.equals(status, fullOutletDTO.status) &&
        Objects.equals(region, fullOutletDTO.region) &&
        Objects.equals(shopOutletId, fullOutletDTO.shopOutletId) &&
        Objects.equals(workingTime, fullOutletDTO.workingTime) &&
        Objects.equals(moderationReason, fullOutletDTO.moderationReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, coords, isMain, shopOutletCode, visibility, address, phones, workingSchedule, deliveryRules, storagePeriod, id, status, region, shopOutletId, workingTime, moderationReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullOutletDTO {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    shopOutletId: ").append(toIndentedString(shopOutletId)).append("\n");
    sb.append("    workingTime: ").append(toIndentedString(workingTime)).append("\n");
    sb.append("    moderationReason: ").append(toIndentedString(moderationReason)).append("\n");
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
