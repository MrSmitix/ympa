package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OutletAddressDTO;
import org.openapitools.model.OutletDeliveryRuleDTO;
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о точке продаж.
 **/
@ApiModel(description="Информация о точке продаж.")

public class OutletDTO  {
  
  @ApiModelProperty(required = true, value = "Название точки продаж. ")
 /**
   * Название точки продаж. 
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
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
  private OutletVisibilityType visibility;

  @ApiModelProperty(required = true, value = "")
  private OutletAddressDTO address;

  @ApiModelProperty(required = true, value = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
 /**
   * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  **/
  private List<String> phones = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private OutletWorkingScheduleDTO workingSchedule;

  @ApiModelProperty(value = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
 /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  **/
  private List<OutletDeliveryRuleDTO> deliveryRules;

  @ApiModelProperty(value = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
 /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  **/
  private Long storagePeriod;
 /**
   * Название точки продаж. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutletDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OutletType getType() {
    return type;
  }

  public void setType(OutletType type) {
    this.type = type;
  }

  public OutletDTO type(OutletType type) {
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

  public OutletDTO coords(String coords) {
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

  public OutletDTO isMain(Boolean isMain) {
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

  public OutletDTO shopOutletCode(String shopOutletCode) {
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

  public OutletDTO visibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public OutletAddressDTO getAddress() {
    return address;
  }

  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  public OutletDTO address(OutletAddressDTO address) {
    this.address = address;
    return this;
  }

 /**
   * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
   * @return phones
  **/
  @JsonProperty("phones")
  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  public OutletDTO phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public OutletDTO addPhonesItem(String phonesItem) {
    this.phones.add(phonesItem);
    return this;
  }

 /**
   * Get workingSchedule
   * @return workingSchedule
  **/
  @JsonProperty("workingSchedule")
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }

  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  public OutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
    return this;
  }

 /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
   * @return deliveryRules
  **/
  @JsonProperty("deliveryRules")
  public List<OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }

  public void setDeliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  public OutletDTO deliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  public OutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
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

  public OutletDTO storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
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
    OutletDTO outletDTO = (OutletDTO) o;
    return Objects.equals(this.name, outletDTO.name) &&
        Objects.equals(this.type, outletDTO.type) &&
        Objects.equals(this.coords, outletDTO.coords) &&
        Objects.equals(this.isMain, outletDTO.isMain) &&
        Objects.equals(this.shopOutletCode, outletDTO.shopOutletCode) &&
        Objects.equals(this.visibility, outletDTO.visibility) &&
        Objects.equals(this.address, outletDTO.address) &&
        Objects.equals(this.phones, outletDTO.phones) &&
        Objects.equals(this.workingSchedule, outletDTO.workingSchedule) &&
        Objects.equals(this.deliveryRules, outletDTO.deliveryRules) &&
        Objects.equals(this.storagePeriod, outletDTO.storagePeriod);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

