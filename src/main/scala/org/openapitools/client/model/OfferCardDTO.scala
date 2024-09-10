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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class OfferCardDTO (
  /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,
  mapping: Option[GetMappingDTO] = None,
  /* Список характеристик с их значениями.  */
  parameterValues: Option[Seq[ParameterValueDTO]] = None,
  cardStatus: Option[OfferCardStatusType] = None,
  /* Процент заполненности карточки. */
  contentRating: Option[Int] = None,
  /* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  */
  recommendations: Option[Seq[OfferCardRecommendationDTO]] = None,
  /* Ошибки в контенте, препятствующие размещению товара на витрине. */
  errors: Option[Seq[OfferErrorDTO]] = None,
  /* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. */
  warnings: Option[Seq[OfferErrorDTO]] = None
) extends ApiModel

object OfferCardDTOEnums {

}
