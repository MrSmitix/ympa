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

case class DeletePromoOffersRequest (
            /* Идентификатор акции. */
                  promoId: String,
            /* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. */
                  deleteAllOffers: Option[Boolean],
            /* Товары, которые нужно убрать из акции. */
                  offerIds: Option[Seq[String]]
)

object DeletePromoOffersRequest {
implicit val format: Format[DeletePromoOffersRequest] = Json.format
}

