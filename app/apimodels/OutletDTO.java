package apimodels;

import apimodels.OutletAddressDTO;
import apimodels.OutletDeliveryRuleDTO;
import apimodels.OutletType;
import apimodels.OutletVisibilityType;
import apimodels.OutletWorkingScheduleDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о точке продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OutletDTO   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("type")
  @NotNull
@Valid

  private OutletType type;

  @JsonProperty("coords")
  
  private String coords;

  @JsonProperty("isMain")
  
  private Boolean isMain;

  @JsonProperty("shopOutletCode")
  
  private String shopOutletCode;

  @JsonProperty("visibility")
  @Valid

  private OutletVisibilityType visibility;

  @JsonProperty("address")
  @NotNull
@Valid

  private OutletAddressDTO address;

  @JsonProperty("phones")
  @NotNull
@Size(min=1)

  private List<@Size(min = 1)String> phones = new ArrayList<>();

  @JsonProperty("workingSchedule")
  @NotNull
@Valid

  private OutletWorkingScheduleDTO workingSchedule;

  @JsonProperty("deliveryRules")
  @Valid

  private List<@Valid OutletDeliveryRuleDTO> deliveryRules = null;

  @JsonProperty("storagePeriod")
  
  private Long storagePeriod;

  public OutletDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название точки продаж. 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OutletDTO type(OutletType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OutletType getType() {
    return type;
  }

  public void setType(OutletType type) {
    this.type = type;
  }

  public OutletDTO coords(String coords) {
    this.coords = coords;
    return this;
  }

   /**
   * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
   * @return coords
  **/
  public String getCoords() {
    return coords;
  }

  public void setCoords(String coords) {
    this.coords = coords;
  }

  public OutletDTO isMain(Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

   /**
   * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
   * @return isMain
  **/
  public Boolean getIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

  public OutletDTO shopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
    return this;
  }

   /**
   * Идентификатор точки продаж, присвоенный магазином.
   * @return shopOutletCode
  **/
  public String getShopOutletCode() {
    return shopOutletCode;
  }

  public void setShopOutletCode(String shopOutletCode) {
    this.shopOutletCode = shopOutletCode;
  }

  public OutletDTO visibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  public OutletVisibilityType getVisibility() {
    return visibility;
  }

  public void setVisibility(OutletVisibilityType visibility) {
    this.visibility = visibility;
  }

  public OutletDTO address(OutletAddressDTO address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public OutletAddressDTO getAddress() {
    return address;
  }

  public void setAddress(OutletAddressDTO address) {
    this.address = address;
  }

  public OutletDTO phones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
    return this;
  }

  public OutletDTO addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
   * @return phones
  **/
  public List<@Size(min = 1)String> getPhones() {
    return phones;
  }

  public void setPhones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
  }

  public OutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
    return this;
  }

   /**
   * Get workingSchedule
   * @return workingSchedule
  **/
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }

  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  public OutletDTO deliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  public OutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
    if (this.deliveryRules == null) {
      this.deliveryRules = new ArrayList<>();
    }
    this.deliveryRules.add(deliveryRulesItem);
    return this;
  }

   /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
   * @return deliveryRules
  **/
  public List<@Valid OutletDeliveryRuleDTO> getDeliveryRules() {
    return deliveryRules;
  }

  public void setDeliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  public OutletDTO storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
    return this;
  }

   /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   * @return storagePeriod
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

