/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OutletAddressDTO;
import org.openapitools.model.OutletDeliveryRuleDTO;
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о точке продаж.
 */
@Schema(name = "OutletDTO", description = "Информация о точке продаж.")
@JsonPropertyOrder({
  OutletDTO.JSON_PROPERTY_NAME,
  OutletDTO.JSON_PROPERTY_TYPE,
  OutletDTO.JSON_PROPERTY_COORDS,
  OutletDTO.JSON_PROPERTY_IS_MAIN,
  OutletDTO.JSON_PROPERTY_SHOP_OUTLET_CODE,
  OutletDTO.JSON_PROPERTY_VISIBILITY,
  OutletDTO.JSON_PROPERTY_ADDRESS,
  OutletDTO.JSON_PROPERTY_PHONES,
  OutletDTO.JSON_PROPERTY_WORKING_SCHEDULE,
  OutletDTO.JSON_PROPERTY_DELIVERY_RULES,
  OutletDTO.JSON_PROPERTY_STORAGE_PERIOD
})
@JsonTypeName("OutletDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OutletDTO {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_TYPE = "type";
    private OutletType type;

    public static final String JSON_PROPERTY_COORDS = "coords";
    private String coords;

    public static final String JSON_PROPERTY_IS_MAIN = "isMain";
    private Boolean isMain;

    public static final String JSON_PROPERTY_SHOP_OUTLET_CODE = "shopOutletCode";
    private String shopOutletCode;

    public static final String JSON_PROPERTY_VISIBILITY = "visibility";
    private OutletVisibilityType visibility;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    private OutletAddressDTO address;

    public static final String JSON_PROPERTY_PHONES = "phones";
    private List<@Size(min = 1)String> phones = new ArrayList<>();

    public static final String JSON_PROPERTY_WORKING_SCHEDULE = "workingSchedule";
    private OutletWorkingScheduleDTO workingSchedule;

    public static final String JSON_PROPERTY_DELIVERY_RULES = "deliveryRules";
    private List<@Valid OutletDeliveryRuleDTO> deliveryRules = null;

    public static final String JSON_PROPERTY_STORAGE_PERIOD = "storagePeriod";
    private Long storagePeriod;

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
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OutletType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(OutletType type) {
        this.type = type;
    }

    public OutletDTO coords(String coords) {
        this.coords = coords;
        return this;
    }

    /**
     * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
     * @return coords
     */
    @Nullable
    @Schema(name = "coords", description = "Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_COORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCoords() {
        return coords;
    }

    @JsonProperty(JSON_PROPERTY_COORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoords(String coords) {
        this.coords = coords;
    }

    public OutletDTO isMain(Boolean isMain) {
        this.isMain = isMain;
        return this;
    }

    /**
     * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
     * @return isMain
     */
    @Nullable
    @Schema(name = "isMain", description = "Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_IS_MAIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsMain() {
        return isMain;
    }

    @JsonProperty(JSON_PROPERTY_IS_MAIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "shopOutletCode", description = "Идентификатор точки продаж, присвоенный магазином.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SHOP_OUTLET_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getShopOutletCode() {
        return shopOutletCode;
    }

    @JsonProperty(JSON_PROPERTY_SHOP_OUTLET_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VISIBILITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OutletVisibilityType getVisibility() {
        return visibility;
    }

    @JsonProperty(JSON_PROPERTY_VISIBILITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @NotNull
    @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OutletAddressDTO getAddress() {
        return address;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAddress(OutletAddressDTO address) {
        this.address = address;
    }

    public OutletDTO phones(List<@Size(min = 1)String> phones) {
        this.phones = phones;
        return this;
    }

    public OutletDTO addPhonesItem(String phonesItem) {
        this.phones.add(phonesItem);
        return this;
    }

    /**
     * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
     * @return phones
     */
    @NotNull
    @Size(min=1)
    @Schema(name = "phones", description = "Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PHONES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Size(min = 1)String> getPhones() {
        return phones;
    }

    @JsonProperty(JSON_PROPERTY_PHONES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @Valid
    @NotNull
    @Schema(name = "workingSchedule", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_WORKING_SCHEDULE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OutletWorkingScheduleDTO getWorkingSchedule() {
        return workingSchedule;
    }

    @JsonProperty(JSON_PROPERTY_WORKING_SCHEDULE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
     * @return deliveryRules
     */
    @Nullable
    @Schema(name = "deliveryRules", description = "Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DELIVERY_RULES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OutletDeliveryRuleDTO> getDeliveryRules() {
        return deliveryRules;
    }

    @JsonProperty(JSON_PROPERTY_DELIVERY_RULES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "storagePeriod", description = "Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STORAGE_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getStoragePeriod() {
        return storagePeriod;
    }

    @JsonProperty(JSON_PROPERTY_STORAGE_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

