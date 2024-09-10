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

case class ReturnDecisionDTO(
  /* Идентификатор товара в возврате. */
  returnItemId: Option[Long],

  /* Количество единиц товара. */
  count: Option[Int],

  /* Комментарий. */
  comment: Option[String],

  reasonType: Option[ReturnDecisionReasonType],

  subreasonType: Option[ReturnDecisionSubreasonType],

  decisionType: Option[ReturnDecisionType],

  /* Сумма возврата. */
  refundAmount: Option[Long],

  /* Компенсация за обратную доставку. */
  partnerCompensation: Option[Long],

  /* Список хеш-кодов фотографий товара от покупателя. */
  images: Option[List[String]]

 )