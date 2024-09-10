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
import java.time.LocalDate

case class QualityRatingDTO (
            /* Значение индекса качества. */
                  rating: Long,
            /* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
                  calculationDate: LocalDate,
            /* Составляющие индекса качества. */
                  components: Seq[QualityRatingComponentDTO]
)

object QualityRatingDTO {
implicit val format: Format[QualityRatingDTO] = Json.format
}

