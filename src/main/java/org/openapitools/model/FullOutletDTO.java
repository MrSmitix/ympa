package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о точке продаж.
 */

@Schema(name = "FullOutletDTO", description = "Информация о точке продаж.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FullOutletDTO {

  private String name;

  private OutletType type;

  private String coords;

  private Boolean isMain;

  private String shopOutletCode;

  private OutletVisibilityType visibility;

  private OutletAddressDTO address;

  @Valid
  private List<@Size(min = 1)String> phones = new ArrayList<>();

  private OutletWorkingScheduleDTO workingSchedule;

  @Valid
  private JsonNullable<List<@Valid OutletDeliveryRuleDTO>> deliveryRules = JsonNullable.<List<@Valid OutletDeliveryRuleDTO>>undefined();

  private Long storagePeriod;

  private Long id;

  private OutletStatusType status;

  private RegionDTO region;

  private String shopOutletId;

  private String workingTime;

  private String moderationReason;

  public FullOutletDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FullOutletDTO(String name, OutletType type, OutletAddressDTO address, List<@Size(min = 1)String> phones, OutletWorkingScheduleDTO workingSchedule) {
    this.name = name;
    this.type = type;
    this.address = address;
    this.phones = phones;
    this.workingSchedule = workingSchedule;
  }

  public FullOutletDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название точки продаж. 
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Название точки продаж. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
   */
  
  @Schema(name = "coords", description = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coords")
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
   */
  
  @Schema(name = "isMain", description = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMain")
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
   */
  
  @Schema(name = "shopOutletCode", description = "Идентификатор точки продаж, присвоенный магазином.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopOutletCode")
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
   */
  @Valid 
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
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
   */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
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
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "phones", description = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phones")
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
   */
  @NotNull @Valid 
  @Schema(name = "workingSchedule", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workingSchedule")
  public OutletWorkingScheduleDTO getWorkingSchedule() {
    return workingSchedule;
  }

  public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
    this.workingSchedule = workingSchedule;
  }

  public FullOutletDTO deliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = JsonNullable.of(deliveryRules);
    return this;
  }

  public FullOutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
    if (this.deliveryRules == null || !this.deliveryRules.isPresent()) {
      this.deliveryRules = JsonNullable.of(new ArrayList<>());
    }
    this.deliveryRules.get().add(deliveryRulesItem);
    return this;
  }

  /**
   * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
   * @return deliveryRules
   */
  @Valid 
  @Schema(name = "deliveryRules", description = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryRules")
  public JsonNullable<List<@Valid OutletDeliveryRuleDTO>> getDeliveryRules() {
    return deliveryRules;
  }

  public void setDeliveryRules(JsonNullable<List<@Valid OutletDeliveryRuleDTO>> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }

  public FullOutletDTO storagePeriod(Long storagePeriod) {
    this.storagePeriod = storagePeriod;
    return this;
  }

  /**
   * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
   * @return storagePeriod
   */
  
  @Schema(name = "storagePeriod", description = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storagePeriod")
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
   */
  
  @Schema(name = "id", description = "Идентификатор точки продаж, присвоенный Маркетом.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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
   */
  @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
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
   */
  
  @Schema(name = "shopOutletId", description = "Идентификатор точки продаж, заданный магазином.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopOutletId")
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
   */
  
  @Schema(name = "workingTime", description = "Рабочее время.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workingTime")
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
   */
  
  @Schema(name = "moderationReason", description = "Статус модерации.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.deliveryRules, fullOutletDTO.deliveryRules) &&
        Objects.equals(this.storagePeriod, fullOutletDTO.storagePeriod) &&
        Objects.equals(this.id, fullOutletDTO.id) &&
        Objects.equals(this.status, fullOutletDTO.status) &&
        Objects.equals(this.region, fullOutletDTO.region) &&
        Objects.equals(this.shopOutletId, fullOutletDTO.shopOutletId) &&
        Objects.equals(this.workingTime, fullOutletDTO.workingTime) &&
        Objects.equals(this.moderationReason, fullOutletDTO.moderationReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, coords, isMain, shopOutletCode, visibility, address, phones, workingSchedule, hashCodeNullable(deliveryRules), storagePeriod, id, status, region, shopOutletId, workingTime, moderationReason);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

