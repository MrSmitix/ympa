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

case class GetCategoriesMaxSaleQuantumDTO (
            /* Категории и лимит на установку кванта и минимального количества товаров. */
                  results: Seq[MaxSaleQuantumDTO],
            /* Ошибки, которые появились из-за переданных категорий. */
                  errors: Option[Seq[CategoryErrorDTO]]
)

object GetCategoriesMaxSaleQuantumDTO {
implicit val format: Format[GetCategoriesMaxSaleQuantumDTO] = Json.format
}

