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

package io.swagger.client.model
import play.api.libs.json._

case class CampaignSettingsScheduleDTO (
            /* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
                  availableOnHolidays: Option[Boolean],
            /* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
                  customHolidays: Seq[String],
            /* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
                  customWorkingDays: Seq[String],
                  period: Option[CampaignSettingsTimePeriodDTO],
            /* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
                  totalHolidays: Seq[String],
            /* Список выходных дней недели и государственных праздников. */
                  weeklyHolidays: Seq[Int]
)

object CampaignSettingsScheduleDTO {
implicit val format: Format[CampaignSettingsScheduleDTO] = Json.format
}

