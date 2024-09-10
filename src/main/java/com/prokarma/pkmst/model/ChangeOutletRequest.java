package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OutletAddressDTO;
import com.prokarma.pkmst.model.OutletDeliveryRuleDTO;
import com.prokarma.pkmst.model.OutletType;
import com.prokarma.pkmst.model.OutletVisibilityType;
import com.prokarma.pkmst.model.OutletWorkingScheduleDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ChangeOutletRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChangeOutletRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private OutletType type;

  @JsonProperty("coords")
  private String coords;

  @JsonProperty("isMain")
  private Boolean isMain;

  @JsonProperty("shopOutletCode")
  private String shopOutletCode;

  @JsonProperty("visibility")
  private OutletVisibilityType visibility;

  @JsonProperty("address")
  private OutletAddressDTO address;

  @JsonProperty("phones")
  
  private List<String> phones = new ArrayList<>();

  @JsonProperty("workingSchedule")
  private OutletWorkingScheduleDTO workingSchedule;

  @JsonProperty("deliveryRules")
  
  private List<OutletDeliveryRuleDTO> deliveryRules = null;

  @JsonProperty("storagePeriod")
  private Long storagePeriod;

  public ChangeOutletRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название точки продаж. 
   * @return name
   */
  @ApiModelProperty(required = true, value = "Название точки продаж. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChangeOutletRequest type(OutletType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public OutletType getType() {
    return type;
  }

  public void setType(OutletType type) {
    this.type = type;
  }

  public ChangeOutletRequest coords(String coords) {
    this.coords = coords;
    return this;
  }

  /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
   * @return coords
   */
  @ApiModelProperty(value = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ")
  public String getCoords() {
    return coords;
  }

  public void setCoords(String coords) {
    this.coords = coords;
  }

  public ChangeOutletRequest isMain(Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

  /**
   * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
   * @return isMain
   */
  @ApiModelProperty(value = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ")
  public Boolean getIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

  public ChangeOutletRequest shopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
    return this;
  }

  /**
   * Идентификатор точки продаж, присвоенный магазином.
   * @return shopOutletCode
   */
  @ApiModelProperty(value = "Идентификатор точки продаж, присвоенный магазином.")
  public String getShopOutletCode() {
    return shopOutletCode;
  }

  public void setShopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
  }

  public ChangeOutletRequest visibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  @ApiModelProperty(value = "")
  public OutletVisibilityType getVisibility() {
    return visibility;
  }

  public void setVisibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
  }

  public ChangeOutletRequest address(OutletAddressDTO address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @ApiModelProperty(required = true, value = "")
  public OutletAddressDTO getAddress() {
    return address;
  }

  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  public ChangeOutletRequest phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public ChangeOutletRequest addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
   * @return phones
   */
  @ApiModelProperty(required = true, value = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  public ChangeOutletRequest workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
    return this;
  }

  /**
   * Get workingSchedule
   * @return workingSchedule
   */
  @ApiModelProperty(required = true, value = "")
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }

  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  public ChangeOutletRequest deliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  public ChangeOutletRequest addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
    if (this.deliveryRules == null) {
      this.deliveryRules = new ArrayList<>();
    }
    this.deliveryRules.add(deliveryRulesItem);
    return this;
  }

  /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
   * @return deliveryRules
   */
  @ApiModelProperty(value = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
  public List<OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }

  public void setDeliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  public ChangeOutletRequest storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
    return this;
  }

  /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   * @return storagePeriod
   */
  @ApiModelProperty(value = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
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
    ChangeOutletRequest changeOutletRequest = (ChangeOutletRequest) o;
    return Objects.equals(this.name, changeOutletRequest.name) &&
        Objects.equals(this.type, changeOutletRequest.type) &&
        Objects.equals(this.coords, changeOutletRequest.coords) &&
        Objects.equals(this.isMain, changeOutletRequest.isMain) &&
        Objects.equals(this.shopOutletCode, changeOutletRequest.shopOutletCode) &&
        Objects.equals(this.visibility, changeOutletRequest.visibility) &&
        Objects.equals(this.address, changeOutletRequest.address) &&
        Objects.equals(this.phones, changeOutletRequest.phones) &&
        Objects.equals(this.workingSchedule, changeOutletRequest.workingSchedule) &&
        Objects.equals(this.deliveryRules, changeOutletRequest.deliveryRules) &&
        Objects.equals(this.storagePeriod, changeOutletRequest.storagePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, coords, isMain, shopOutletCode, visibility, address, phones, workingSchedule, deliveryRules, storagePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOutletRequest {\n");
    
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
