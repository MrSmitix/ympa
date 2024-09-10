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
import org.openapitools.model.OutletStatusType;
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;
import org.openapitools.model.RegionDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о точке продаж.
 */
@JsonPropertyOrder({
  FullOutletDTO.JSON_PROPERTY_NAME,
  FullOutletDTO.JSON_PROPERTY_TYPE,
  FullOutletDTO.JSON_PROPERTY_COORDS,
  FullOutletDTO.JSON_PROPERTY_IS_MAIN,
  FullOutletDTO.JSON_PROPERTY_SHOP_OUTLET_CODE,
  FullOutletDTO.JSON_PROPERTY_VISIBILITY,
  FullOutletDTO.JSON_PROPERTY_ADDRESS,
  FullOutletDTO.JSON_PROPERTY_PHONES,
  FullOutletDTO.JSON_PROPERTY_WORKING_SCHEDULE,
  FullOutletDTO.JSON_PROPERTY_DELIVERY_RULES,
  FullOutletDTO.JSON_PROPERTY_STORAGE_PERIOD,
  FullOutletDTO.JSON_PROPERTY_ID,
  FullOutletDTO.JSON_PROPERTY_STATUS,
  FullOutletDTO.JSON_PROPERTY_REGION,
  FullOutletDTO.JSON_PROPERTY_SHOP_OUTLET_ID,
  FullOutletDTO.JSON_PROPERTY_WORKING_TIME,
  FullOutletDTO.JSON_PROPERTY_MODERATION_REASON
})
@JsonTypeName("FullOutletDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FullOutletDTO {
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

    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_STATUS = "status";
    private OutletStatusType status;

    public static final String JSON_PROPERTY_REGION = "region";
    private RegionDTO region;

    public static final String JSON_PROPERTY_SHOP_OUTLET_ID = "shopOutletId";
    private String shopOutletId;

    public static final String JSON_PROPERTY_WORKING_TIME = "workingTime";
    private String workingTime;

    public static final String JSON_PROPERTY_MODERATION_REASON = "moderationReason";
    private String moderationReason;

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

    public FullOutletDTO type(OutletType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
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

    public FullOutletDTO coords(String coords) {
        this.coords = coords;
        return this;
    }

    /**
     * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
     * @return coords
     */
    @Nullable
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

    public FullOutletDTO isMain(Boolean isMain) {
        this.isMain = isMain;
        return this;
    }

    /**
     * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
     * @return isMain
     */
    @Nullable
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

    public FullOutletDTO shopOutletCode(String shopOutletCode) {
        this.shopOutletCode = shopOutletCode;
        return this;
    }

    /**
     * Идентификатор точки продаж, присвоенный магазином.
     * @return shopOutletCode
     */
    @Nullable
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

    public FullOutletDTO visibility(OutletVisibilityType visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get visibility
     * @return visibility
     */
    @Nullable
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

    public FullOutletDTO address(OutletAddressDTO address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     */
    @Valid
    @NotNull
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

    public FullOutletDTO phones(List<@Size(min = 1)String> phones) {
        this.phones = phones;
        return this;
    }

    public FullOutletDTO addPhonesItem(String phonesItem) {
        this.phones.add(phonesItem);
        return this;
    }

    /**
     * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
     * @return phones
     */
    @NotNull
    @Size(min=1)
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

    public FullOutletDTO workingSchedule(OutletWorkingScheduleDTO workingSchedule) {
        this.workingSchedule = workingSchedule;
        return this;
    }

    /**
     * Get workingSchedule
     * @return workingSchedule
     */
    @Valid
    @NotNull
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
     * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
     * @return deliveryRules
     */
    @Nullable
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

    public FullOutletDTO storagePeriod(Long storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
     * @return storagePeriod
     */
    @Nullable
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

    public FullOutletDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор точки продаж, присвоенный Маркетом.
     * @return id
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OutletStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RegionDTO getRegion() {
        return region;
    }

    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHOP_OUTLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getShopOutletId() {
        return shopOutletId;
    }

    @JsonProperty(JSON_PROPERTY_SHOP_OUTLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_WORKING_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWorkingTime() {
        return workingTime;
    }

    @JsonProperty(JSON_PROPERTY_WORKING_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_MODERATION_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getModerationReason() {
        return moderationReason;
    }

    @JsonProperty(JSON_PROPERTY_MODERATION_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

