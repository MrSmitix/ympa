package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GetGoodsFeedbackRequest._

case class GetGoodsFeedbackRequest (
  /* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  */
  dateTimeFrom: Option[OffsetDateTime],
/* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  */
  dateTimeTo: Option[OffsetDateTime],
reactionStatus: Option[FeedbackReactionStatusType],
/* Оценка товара. */
  ratingValues: Option[Set[Integer]],
/* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  */
  modelIds: Option[Set[Long]],
/* Фильтр отзывов за баллы Плюса. */
  paid: Option[Boolean])

object GetGoodsFeedbackRequest {
  import DateTimeCodecs._

  implicit val GetGoodsFeedbackRequestCodecJson: CodecJson[GetGoodsFeedbackRequest] = CodecJson.derive[GetGoodsFeedbackRequest]
  implicit val GetGoodsFeedbackRequestDecoder: EntityDecoder[GetGoodsFeedbackRequest] = jsonOf[GetGoodsFeedbackRequest]
  implicit val GetGoodsFeedbackRequestEncoder: EntityEncoder[GetGoodsFeedbackRequest] = jsonEncoderOf[GetGoodsFeedbackRequest]
}
