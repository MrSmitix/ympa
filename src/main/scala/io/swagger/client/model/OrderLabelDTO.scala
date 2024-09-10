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

case class OrderLabelDTO (
            /* Идентификатор заказа. */
                  orderId: Long,
            /* Количество коробок в заказе. */
                  placesNumber: Int,
            /* URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  */
                  url: String,
            /* Информация на ярлыке. */
                  parcelBoxLabels: Seq[ParcelBoxLabelDTO]
)

object OrderLabelDTO {
implicit val format: Format[OrderLabelDTO] = Json.format
}

