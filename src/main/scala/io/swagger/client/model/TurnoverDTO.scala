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

case class TurnoverDTO (
                  turnover: TurnoverType,
            /* Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) */
                  turnoverDays: Option[Double]
)

object TurnoverDTO {
implicit val format: Format[TurnoverDTO] = Json.format
}

