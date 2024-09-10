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

case class OutletDTO (
            /* Название точки продаж.  */
                  name: String,
                  `type`: OutletType,
            /* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  */
                  coords: Option[String],
            /* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  */
                  isMain: Option[Boolean],
            /* Идентификатор точки продаж, присвоенный магазином. */
                  shopOutletCode: Option[String],
                  visibility: Option[OutletVisibilityType],
                  address: OutletAddressDTO,
            /* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  */
                  phones: Seq[String],
                  workingSchedule: OutletWorkingScheduleDTO,
            /* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  */
                  deliveryRules: Option[Seq[OutletDeliveryRuleDTO]],
            /* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. */
                  storagePeriod: Option[Long]
)

object OutletDTO {
implicit val format: Format[OutletDTO] = Json.format
}

