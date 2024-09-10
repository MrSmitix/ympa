package org.openapitools.model;

import java.util.Objects;
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
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Название точки продаж. 
   **/
  public ChangeOutletRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название точки продаж. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ChangeOutletRequest type(OutletType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public OutletType getType() {
    return type;
  }
  public void setType(OutletType type) {
    this.type = type;
  }

  /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
   **/
  public ChangeOutletRequest coords(String coords) {
    this.coords = coords;
    return this;
  }

  
  @ApiModelProperty(value = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ")
  @JsonProperty("coords")
  public String getCoords() {
    return coords;
  }
  public void setCoords(String coords) {
    this.coords = coords;
  }

  /**
   * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
   **/
  public ChangeOutletRequest isMain(Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

  
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
  public ChangeOutletRequest shopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
    return this;
  }

  
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
  public ChangeOutletRequest visibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

  
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
  public ChangeOutletRequest address(OutletAddressDTO address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("address")
  public OutletAddressDTO getAddress() {
    return address;
  }
  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  /**
   * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
   **/
  public ChangeOutletRequest phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ")
  @JsonProperty("phones")
  public List<String> getPhones() {
    return phones;
  }
  public void setPhones(List<String> phones) {
    this.phones = phones;
  }

  /**
   **/
  public ChangeOutletRequest workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("workingSchedule")
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }
  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
   **/
  public ChangeOutletRequest deliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  
  @ApiModelProperty(value = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ")
  @JsonProperty("deliveryRules")
  public List<OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }
  public void setDeliveryRules(List<OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   **/
  public ChangeOutletRequest storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
    return this;
  }

  
  @ApiModelProperty(value = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.")
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
    ChangeOutletRequest changeOutletRequest = (ChangeOutletRequest) o;
    return Objects.equals(name, changeOutletRequest.name) &&
        Objects.equals(type, changeOutletRequest.type) &&
        Objects.equals(coords, changeOutletRequest.coords) &&
        Objects.equals(isMain, changeOutletRequest.isMain) &&
        Objects.equals(shopOutletCode, changeOutletRequest.shopOutletCode) &&
        Objects.equals(visibility, changeOutletRequest.visibility) &&
        Objects.equals(address, changeOutletRequest.address) &&
        Objects.equals(phones, changeOutletRequest.phones) &&
        Objects.equals(workingSchedule, changeOutletRequest.workingSchedule) &&
        Objects.equals(deliveryRules, changeOutletRequest.deliveryRules) &&
        Objects.equals(storagePeriod, changeOutletRequest.storagePeriod);
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

