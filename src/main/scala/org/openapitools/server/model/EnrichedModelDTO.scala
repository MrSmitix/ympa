/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class EnrichedModelDTO(
  /* Идентификатор модели товара. */
  id: Option[Long],

  /* Название модели товара. */
  name: Option[String],

  prices: Option[ModelPriceDTO],

  /* Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
  offers: Option[List[ModelOfferDTO]],

  /* Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
  offlineOffers: Option[Int],

  /* Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
  onlineOffers: Option[Int]

 )