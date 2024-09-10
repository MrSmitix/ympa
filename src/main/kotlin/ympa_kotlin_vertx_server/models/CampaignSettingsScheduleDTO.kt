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

import ympa_kotlin_vertx_server.models.CampaignSettingsTimePeriodDTO

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Расписание работы службы доставки в своем регионе.
 * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
 * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
 * @param weeklyHolidays Список выходных дней недели и государственных праздников.
 * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
 * @param period 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CampaignSettingsScheduleDTO (
    /* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
    @SerializedName("customHolidays") private val _customHolidays: kotlin.Array<kotlin.String>?,
    /* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
    @SerializedName("customWorkingDays") private val _customWorkingDays: kotlin.Array<kotlin.String>?,
    /* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
    @SerializedName("totalHolidays") private val _totalHolidays: kotlin.Array<kotlin.String>?,
    /* Список выходных дней недели и государственных праздников. */
    @SerializedName("weeklyHolidays") private val _weeklyHolidays: kotlin.Array<kotlin.Int>?,
    /* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
    val availableOnHolidays: kotlin.Boolean? = null,
    val period: CampaignSettingsTimePeriodDTO? = null
) {

        val customHolidays get() = _customHolidays ?: throw IllegalArgumentException("customHolidays is required")
                    
        val customWorkingDays get() = _customWorkingDays ?: throw IllegalArgumentException("customWorkingDays is required")
                    
        val totalHolidays get() = _totalHolidays ?: throw IllegalArgumentException("totalHolidays is required")
                    
        val weeklyHolidays get() = _weeklyHolidays ?: throw IllegalArgumentException("weeklyHolidays is required")
                    
}

