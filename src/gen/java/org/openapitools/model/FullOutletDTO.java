package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OutletAddressDTO;
import org.openapitools.model.OutletDeliveryRuleDTO;
import org.openapitools.model.OutletStatusType;
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о точке продаж.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FullOutletDTO   {
  
  private String name;
  private OutletType type;
  private String coords;
  private Boolean isMain;
  private String shopOutletCode;
  private OutletVisibilityType visibility;
  private OutletAddressDTO address;
  private List<@Size(min = 1)String> phones = new ArrayList<>();
  private OutletWorkingScheduleDTO workingSchedule;
  private List<@Valid OutletDeliveryRuleDTO> deliveryRules;
  private Long storagePeriod;
  private Long id;
  private OutletStatusType status;
  private RegionDTO region;
  private String shopOutletId;
  private String workingTime;
  private String moderationReason;

  /**
   * Название точки продаж. 
   **/
  
  @ApiModelProperty(required = true, value = "Название точки продаж. ")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public OutletType getType() {
    return type;
  }
  public void setType(OutletType type) {
    this.type = type;
  }

  /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
   **/
  
  @ApiModelProperty(value = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ")
  @JsonProperty("coords")
  public String getCoords() {
    return coords;
  }
  public void setCoords(String coords) {
    this.coords = coords;
  }

  /**
   * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
   **/
  
  @ApiModelProperty(value = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ")
  @JsonProperty("isMain")
  public Boolean getIsMain() {
    return isMain;
  }
  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

  /**
   * Идентификатор точки продаж, присвоенный магазином.
   **/
  
  @ApiModelProperty(value = "Идентификатор точки продаж, присвоенный магазином.")
  @JsonProperty("shopOutletCode")
  public String getShopOutletCode() {
    return shopOutletCode;
  }
  public void setShopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public OutletVisibilityType getVisibility() {
    return visibility;
  }
  public void setVisibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("address")
  @NotNull
  public OutletAddressDTO getAddress() {
    return address;
  }
  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  /**
   * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
   **/
  
  @ApiModelProperty(required = true, value = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
  @JsonProperty("phones")
  @NotNull
 @Size(min=1)  public List<@Size(min = 1)String> getPhones() {
    return phones;
  }
  public void setPhones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("workingSchedule")
  @NotNull
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }
  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
   **/
  
  @ApiModelProperty(value = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
  @JsonProperty("deliveryRules")
  public List<@Valid OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }
  public void setDeliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   **/
  
  @ApiModelProperty(value = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
  @JsonProperty("storagePeriod")
  public Long getStoragePeriod() {
    return storagePeriod;
  }
  public void setStoragePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
  }

  /**
   * Идентификатор точки продаж, присвоенный Маркетом.
   **/
  
  @ApiModelProperty(value = "Идентификатор точки продаж, присвоенный Маркетом.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OutletStatusType getStatus() {
    return status;
  }
  public void setStatus(OutletStatusType status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }
  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  /**
   * Идентификатор точки продаж, заданный магазином.
   **/
  
  @ApiModelProperty(value = "Идентификатор точки продаж, заданный магазином.")
  @JsonProperty("shopOutletId")
  public String getShopOutletId() {
    return shopOutletId;
  }
  public void setShopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
  }

  /**
   * Рабочее время.
   **/
  
  @ApiModelProperty(value = "Рабочее время.")
  @JsonProperty("workingTime")
  public String getWorkingTime() {
    return workingTime;
  }
  public void setWorkingTime(String workingTime) {
    this.workingTime = workingTime;
  }

  /**
   * Статус модерации.
   **/
  
  @ApiModelProperty(value = "Статус модерации.")
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
    return Objects.equals(this.name, fullOutletDTO.name) &&
        Objects.equals(this.type, fullOutletDTO.type) &&
        Objects.equals(this.coords, fullOutletDTO.coords) &&
        Objects.equals(this.isMain, fullOutletDTO.isMain) &&
        Objects.equals(this.shopOutletCode, fullOutletDTO.shopOutletCode) &&
        Objects.equals(this.visibility, fullOutletDTO.visibility) &&
        Objects.equals(this.address, fullOutletDTO.address) &&
        Objects.equals(this.phones, fullOutletDTO.phones) &&
        Objects.equals(this.workingSchedule, fullOutletDTO.workingSchedule) &&
        Objects.equals(this.deliveryRules, fullOutletDTO.deliveryRules) &&
        Objects.equals(this.storagePeriod, fullOutletDTO.storagePeriod) &&
        Objects.equals(this.id, fullOutletDTO.id) &&
        Objects.equals(this.status, fullOutletDTO.status) &&
        Objects.equals(this.region, fullOutletDTO.region) &&
        Objects.equals(this.shopOutletId, fullOutletDTO.shopOutletId) &&
        Objects.equals(this.workingTime, fullOutletDTO.workingTime) &&
        Objects.equals(this.moderationReason, fullOutletDTO.moderationReason);
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

