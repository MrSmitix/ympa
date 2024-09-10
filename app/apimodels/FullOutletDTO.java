package apimodels;

import apimodels.OutletAddressDTO;
import apimodels.OutletDeliveryRuleDTO;
import apimodels.OutletStatusType;
import apimodels.OutletType;
import apimodels.OutletVisibilityType;
import apimodels.OutletWorkingScheduleDTO;
import apimodels.RegionDTO;
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
public class FullOutletDTO   {
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

  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("status")
  @Valid

  private OutletStatusType status;

  @JsonProperty("region")
  @Valid

  private RegionDTO region;

  @JsonProperty("shopOutletId")
  
  private String shopOutletId;

  @JsonProperty("workingTime")
  
  private String workingTime;

  @JsonProperty("moderationReason")
  
  private String moderationReason;

  public FullOutletDTO name(String name) {
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

  public FullOutletDTO type(OutletType type) {
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

  public FullOutletDTO coords(String coords) {
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

  public FullOutletDTO isMain(Boolean isMain) {
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

  public FullOutletDTO shopOutletCode(String shopOutletCode) {
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

  public FullOutletDTO visibility(OutletVisibilityType visibility) {
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

  public FullOutletDTO address(OutletAddressDTO address) {
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

  public FullOutletDTO phones(List<@Size(min = 1)String> phones) {
    this.phones = phones;
    return this;
  }

  public FullOutletDTO addPhonesItem(String phonesItem) {
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

  public FullOutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
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

  public FullOutletDTO deliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = deliveryRules;
    return this;
  }

  public FullOutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
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

  public FullOutletDTO storagePeriod(Long storagePeriod) {
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

  public FullOutletDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор точки продаж, присвоенный Маркетом.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FullOutletDTO status(OutletStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OutletStatusType getStatus() {
    return status;
  }

  public void setStatus(OutletStatusType status) {
    this.status = status;
  }

  public FullOutletDTO region(RegionDTO region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  public FullOutletDTO shopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
    return this;
  }

   /**
   * Идентификатор точки продаж, заданный магазином.
   * @return shopOutletId
  **/
  public String getShopOutletId() {
    return shopOutletId;
  }

  public void setShopOutletId(String shopOutletId) {
    this.shopOutletId = shopOutletId;
  }

  public FullOutletDTO workingTime(String workingTime) {
    this.workingTime = workingTime;
    return this;
  }

   /**
   * Рабочее время.
   * @return workingTime
  **/
  public String getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(String workingTime) {
    this.workingTime = workingTime;
  }

  public FullOutletDTO moderationReason(String moderationReason) {
    this.moderationReason = moderationReason;
    return this;
  }

   /**
   * Статус модерации.
   * @return moderationReason
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

