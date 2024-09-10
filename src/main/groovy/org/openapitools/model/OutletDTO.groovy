package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OutletAddressDTO;
import org.openapitools.model.OutletDeliveryRuleDTO;
import org.openapitools.model.OutletType;
import org.openapitools.model.OutletVisibilityType;
import org.openapitools.model.OutletWorkingScheduleDTO;

@Canonical
class OutletDTO {
    /* Название точки продаж.  */
    String name
    
    OutletType type
    /* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  */
    String coords
    /* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  */
    Boolean isMain
    /* Идентификатор точки продаж, присвоенный магазином. */
    String shopOutletCode
    
    OutletVisibilityType visibility
    
    OutletAddressDTO address
    /* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  */
    List<String> phones = new ArrayList<>()
    
    OutletWorkingScheduleDTO workingSchedule
    /* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  */
    List<OutletDeliveryRuleDTO> deliveryRules
    /* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. */
    Long storagePeriod
}
