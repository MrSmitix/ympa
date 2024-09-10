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

case class GetCampaignOffersRequest (
  /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
  offerIds: Option[Seq[String]] = None,
  /* Фильтр по статусам товаров.  */
  statuses: Option[Seq[OfferCampaignStatusType]] = None,
  /* Фильтр по категориям на Маркете. */
  categoryIds: Option[Seq[Int]] = None,
  /* Фильтр по брендам. */
  vendorNames: Option[Seq[String]] = None,
  /* Фильтр по тегам. */
  tags: Option[Seq[String]] = None
) extends ApiModel
