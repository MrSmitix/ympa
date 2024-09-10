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

case class EnrichedOrderBoxLayoutDTO (
            /* Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  */
                  items: Seq[OrderBoxLayoutItemDTO],
            /* Идентификатор коробки. */
                  boxId: Option[Long]
)

object EnrichedOrderBoxLayoutDTO {
implicit val format: Format[EnrichedOrderBoxLayoutDTO] = Json.format
}

