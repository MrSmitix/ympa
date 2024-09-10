/**
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
package ympa_kotlin_vertx_server.models

import ympa_kotlin_vertx_server.models.OutletAddressDTO
import ympa_kotlin_vertx_server.models.OutletDeliveryRuleDTO
import ympa_kotlin_vertx_server.models.OutletType
import ympa_kotlin_vertx_server.models.OutletVisibilityType
import ympa_kotlin_vertx_server.models.OutletWorkingScheduleDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Информация о точке продаж.
 * @param name Название точки продаж. 
 * @param type 
 * @param address 
 * @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
 * @param workingSchedule 
 * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
 * @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
 * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
 * @param visibility 
 * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
 * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class OutletDTO (
    /* Название точки продаж.  */
    @SerializedName("name") private val _name: kotlin.String?,
    @SerializedName("type") private val _type: OutletType?,
    @SerializedName("address") private val _address: OutletAddressDTO?,
    /* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  */
    @SerializedName("phones") private val _phones: kotlin.Array<kotlin.String>?,
    @SerializedName("workingSchedule") private val _workingSchedule: OutletWorkingScheduleDTO?,
    /* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  */
    val coords: kotlin.String? = null,
    /* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  */
    val isMain: kotlin.Boolean? = null,
    /* Идентификатор точки продаж, присвоенный магазином. */
    val shopOutletCode: kotlin.String? = null,
    val visibility: OutletVisibilityType? = null,
    /* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  */
    val deliveryRules: kotlin.Array<OutletDeliveryRuleDTO>? = null,
    /* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. */
    val storagePeriod: kotlin.Long? = null
) {

        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val address get() = _address ?: throw IllegalArgumentException("address is required")
                    
        val phones get() = _phones ?: throw IllegalArgumentException("phones is required")
                    
        val workingSchedule get() = _workingSchedule ?: throw IllegalArgumentException("workingSchedule is required")
                    
}

