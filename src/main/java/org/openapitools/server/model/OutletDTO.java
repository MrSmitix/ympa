package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OutletAddressDTO;
import org.openapitools.server.model.OutletDeliveryRuleDTO;
import org.openapitools.server.model.OutletType;
import org.openapitools.server.model.OutletVisibilityType;
import org.openapitools.server.model.OutletWorkingScheduleDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о точке продаж.
 */
public class OutletDTO   {

    private String name;
    private OutletType type;
    private String coords;
    private Boolean isMain;
    private String shopOutletCode;
    private OutletVisibilityType visibility;
    private OutletAddressDTO address;
    private List<@Size(min = 1)String> phones = new ArrayList<>();
    private OutletWorkingScheduleDTO workingSchedule;
    private List<@Valid OutletDeliveryRuleDTO> deliveryRules;
    private Long storagePeriod;

    /**
     * Default constructor.
     */
    public OutletDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletDTO.
     *
     * @param name Название точки продаж. 
     * @param type type
     * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. 
     * @param isMain Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. 
     * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
     * @param visibility visibility
     * @param address address
     * @param phones Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. 
     * @param workingSchedule workingSchedule
     * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. 
     * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
     */
    public OutletDTO(
        String name, 
        OutletType type, 
        String coords, 
        Boolean isMain, 
        String shopOutletCode, 
        OutletVisibilityType visibility, 
        OutletAddressDTO address, 
        List<@Size(min = 1)String> phones, 
        OutletWorkingScheduleDTO workingSchedule, 
        List<@Valid OutletDeliveryRuleDTO> deliveryRules, 
        Long storagePeriod
    ) {
        this.name = name;
        this.type = type;
        this.coords = coords;
        this.isMain = isMain;
        this.shopOutletCode = shopOutletCode;
        this.visibility = visibility;
        this.address = address;
        this.phones = phones;
        this.workingSchedule = workingSchedule;
        this.deliveryRules = deliveryRules;
        this.storagePeriod = storagePeriod;
    }



    /**
     * Название точки продаж. 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get type
     * @return type
     */
    public OutletType getType() {
        return type;
    }

    public void setType(OutletType type) {
        this.type = type;
    }

    /**
     * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
     * @return coords
     */
    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    /**
     * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
     * @return isMain
     */
    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    /**
     * Идентификатор точки продаж, присвоенный магазином.
     * @return shopOutletCode
     */
    public String getShopOutletCode() {
        return shopOutletCode;
    }

    public void setShopOutletCode(String shopOutletCode) {
        this.shopOutletCode = shopOutletCode;
    }

    /**
     * Get visibility
     * @return visibility
     */
    public OutletVisibilityType getVisibility() {
        return visibility;
    }

    public void setVisibility(OutletVisibilityType visibility) {
        this.visibility = visibility;
    }

    /**
     * Get address
     * @return address
     */
    public OutletAddressDTO getAddress() {
        return address;
    }

    public void setAddress(OutletAddressDTO address) {
        this.address = address;
    }

    /**
     * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
     * @return phones
     */
    public List<@Size(min = 1)String> getPhones() {
        return phones;
    }

    public void setPhones(List<@Size(min = 1)String> phones) {
        this.phones = phones;
    }

    /**
     * Get workingSchedule
     * @return workingSchedule
     */
    public OutletWorkingScheduleDTO getWorkingSchedule() {
        return workingSchedule;
    }

    public void setWorkingSchedule(OutletWorkingScheduleDTO workingSchedule) {
        this.workingSchedule = workingSchedule;
    }

    /**
     * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
     * @return deliveryRules
     */
    public List<@Valid OutletDeliveryRuleDTO> getDeliveryRules() {
        return deliveryRules;
    }

    public void setDeliveryRules(List<@Valid OutletDeliveryRuleDTO> deliveryRules) {
        this.deliveryRules = deliveryRules;
    }

    /**
     * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
     * @return storagePeriod
     */
    public Long getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Long storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

