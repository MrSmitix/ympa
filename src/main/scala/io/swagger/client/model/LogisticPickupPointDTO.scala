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

case class LogisticPickupPointDTO (
            /* Идентификатор пункта вывоза. */
                  id: Option[Long],
            /* Название пункта вывоза. */
                  name: Option[String],
                  address: Option[PickupAddressDTO],
            /* Дополнительные инструкции к вывозу. */
                  instruction: Option[String],
                  `type`: Option[LogisticPointType],
            /* Идентификатор логистического партнера, к которому относится логистическая точка. */
                  logisticPartnerId: Option[Long]
)

object LogisticPickupPointDTO {
implicit val format: Format[LogisticPickupPointDTO] = Json.format
}

