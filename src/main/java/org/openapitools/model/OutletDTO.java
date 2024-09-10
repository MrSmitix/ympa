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
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;
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

@Schema(name = "OutletDTO", description = "Информация о точке продаж.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OutletDTO {

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

  public OutletDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutletDTO(String name, OutletType type, OutletAddressDTO address, List<@Size(min = 1)String> phones, OutletWorkingScheduleDTO workingSchedule) {
    this.name = name;
    this.type = type;
    this.address = address;
    this.phones = phones;
    this.workingSchedule = workingSchedule;
  }

  public OutletDTO name(String name) {
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

  public OutletDTO type(OutletType type) {
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

  public OutletDTO coords(String coords) {
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

  public OutletDTO isMain(Boolean isMain) {
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

  public OutletDTO shopOutletCode(String shopOutletCode) {
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

  public OutletDTO visibility(OutletVisibilityType visibility) {
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

  public OutletDTO address(OutletAddressDTO address) {
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

  public OutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
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

  public OutletDTO deliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
    this.deliveryRules = JsonNullable.of(deliveryRules);
    return this;
  }

  public OutletDTO addDeliveryRulesItem(OutletDeliveryRuleDTO deliveryRulesItem) {
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

  public OutletDTO storagePeriod(Long storagePeriod) {
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
        equalsNullable(this.deliveryRules, outletDTO.deliveryRules) &&
        Objects.equals(this.storagePeriod, outletDTO.storagePeriod);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, coords, isMain, shopOutletCode, visibility, address, phones, workingSchedule, hashCodeNullable(deliveryRules), storagePeriod);
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

