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

case class ParcelBoxDTO (
            /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
                  id: Option[Long],
            /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
                  fulfilmentId: Option[String]
)

object ParcelBoxDTO {
implicit val format: Format[ParcelBoxDTO] = Json.format
}

