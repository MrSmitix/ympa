package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCampaignOffersRequest._

case class GetCampaignOffersRequest (
  /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
  offerIds: Option[List[String]],
/* Фильтр по статусам товаров.  */
  statuses: Option[List[OfferCampaignStatusType]],
/* Фильтр по категориям на Маркете. */
  categoryIds: Option[List[Integer]],
/* Фильтр по брендам. */
  vendorNames: Option[List[String]],
/* Фильтр по тегам. */
  tags: Option[List[String]])

object GetCampaignOffersRequest {
  import DateTimeCodecs._

  implicit val GetCampaignOffersRequestCodecJson: CodecJson[GetCampaignOffersRequest] = CodecJson.derive[GetCampaignOffersRequest]
  implicit val GetCampaignOffersRequestDecoder: EntityDecoder[GetCampaignOffersRequest] = jsonOf[GetCampaignOffersRequest]
  implicit val GetCampaignOffersRequestEncoder: EntityEncoder[GetCampaignOffersRequest] = jsonEncoderOf[GetCampaignOffersRequest]
}
