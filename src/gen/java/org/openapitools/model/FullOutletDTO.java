package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о точке продаж.
 **/
@ApiModel(description="Информация о точке продаж.")

public class FullOutletDTO  {
  
  @ApiModelProperty(required = true, value = "Название точки продаж. ")
 /**
   * Название точки продаж. 
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OutletType type;

  @ApiModelProperty(value = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ")
 /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  **/
  private String coords;

  @ApiModelProperty(value = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ")
 /**
   * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  **/
  private Boolean isMain;

  @ApiModelProperty(value = "Идентификатор точки продаж, присвоенный магазином.")
 /**
   * Идентификатор точки продаж, присвоенный магазином.
  **/
  private String shopOutletCode;

  @ApiModelProperty(value = "")
  @Valid
  private OutletVisibilityType visibility;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OutletAddressDTO address;

  @ApiModelProperty(required = true, value = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
 /**
   * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  **/
  private List<@Size(min = 1)String> phones = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OutletWorkingScheduleDTO workingSchedule;

  @ApiModelProperty(value = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
  @Valid
 /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  **/
  private List<@Valid OutletDeliveryRuleDTO> deliveryRules;

  @ApiModelProperty(value = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
 /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  **/
  private Long storagePeriod;

  @ApiModelProperty(value = "Идентификатор точки продаж, присвоенный Маркетом.")
 /**
   * Идентификатор точки продаж, присвоенный Маркетом.
  **/
  private Long id;

  @ApiModelProperty(value = "")
  @Valid
  private OutletStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO region;

  @ApiModelProperty(value = "Идентификатор точки продаж, заданный магазином.")
 /**
   * Идентификатор точки продаж, заданный магазином.
  **/
  private String shopOutletId;

  @ApiModelProperty(value = "Рабочее время.")
 /**
   * Рабочее время.
  **/
  private String workingTime;

  @ApiModelProperty(value = "Статус модерации.")
 /**
   * Статус модерации.
  **/
  private String moderationReason;
 /**
   * Название точки продаж. 
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

  public FullOutletDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public OutletType getType() {
    return type;
  }

  public void setType(OutletType type) {
    this.type = type;
  }

  public FullOutletDTO type(OutletType type) {
    this.type = type;
    return this;
  }

 /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
   * @return coords
  **/
  @JsonProperty("coords")
  public String getCoords() {
    return coords;
  }

  public void setCoords(String coords) {
    this.coords = coords;
  }

  public FullOutletDTO coords(String coords) {
    this.coords = coords;
    return this;
  }

 /**
   * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
   * @return isMain
  **/
  @JsonProperty("isMain")
  public Boolean getIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

  public FullOutletDTO isMain(Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

 /**
   * Идентификатор точки продаж, присвоенный магазином.
   * @return shopOutletCode
  **/
  @JsonProperty("shopOutletCode")
  public String getShopOutletCode() {
    return shopOutletCode;
  }

  public void setShopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
  }

  public FullOutletDTO shopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public OutletVisibilityType getVisibility() {
    return visibility;
  }

  public void setVisibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
  }

  public FullOutletDTO visibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  @NotNull
  public OutletAddressDTO getAddress() {
    return address;
  }

  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  public FullOutletDTO address(OutletAddressDTO address) {
    this.address = address;
    return this;
  }

 /**
   * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
   * @return phones
  **/
  @JsonProperty("phones")
  @NotNull
 @Size(min=1)  public List<@Size(min = 1)String> getPhones() {
    return phones;
  }

  public void setPhones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
  }

  public FullOutletDTO phones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
    return this;
  }

  public FullOutletDTO addPhonesItem(String phonesItem) {
    this.phones.add(phonesItem);
    return this;
  }

 /**
   * Get workingSchedule
   * @return workingSchedule
  **/
  @JsonProperty("workingSchedule")
  @NotNull
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }

  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  public FullOutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
    return this;
  }

 /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
   * @return deliveryRules
  **/
  @JsonProperty("deliveryRules")
  public List<@Valid OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }

  public void setDeliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  public FullOutletDTO deliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  public FullOutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
    this.deliveryRules.add(deliveryRulesItem);
    return this;
  }

 /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   * @return storagePeriod
  **/
  @JsonProperty("storagePeriod")
  public Long getStoragePeriod() {
    return storagePeriod;
  }

  public void setStoragePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
  }

  public FullOutletDTO storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
    return this;
  }

 /**
   * Идентификатор точки продаж, присвоенный Маркетом.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FullOutletDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OutletStatusType getStatus() {
    return status;
  }

  public void setStatus(OutletStatusType status) {
    this.status = status;
  }

  public FullOutletDTO status(OutletStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  public FullOutletDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

 /**
   * Идентификатор точки продаж, заданный магазином.
   * @return shopOutletId
  **/
  @JsonProperty("shopOutletId")
  public String getShopOutletId() {
    return shopOutletId;
  }

  public void setShopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
  }

  public FullOutletDTO shopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
    return this;
  }

 /**
   * Рабочее время.
   * @return workingTime
  **/
  @JsonProperty("workingTime")
  public String getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(String workingTime) {
    this.workingTime = workingTime;
  }

  public FullOutletDTO workingTime(String workingTime) {
    this.workingTime = workingTime;
    return this;
  }

 /**
   * Статус модерации.
   * @return moderationReason
  **/
  @JsonProperty("moderationReason")
  public String getModerationReason() {
    return moderationReason;
  }

  public void setModerationReason(String moderationReason) {
    this.moderationReason = moderationReason;
  }

  public FullOutletDTO moderationReason(String moderationReason) {
    this.moderationReason = moderationReason;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

