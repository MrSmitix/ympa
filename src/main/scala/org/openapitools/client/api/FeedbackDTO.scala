package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import FeedbackDTO._

case class FeedbackDTO (
  /* Идентификатор отзыва. */
  id: Option[Long],
/* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: Option[OffsetDateTime],
/* Комментарий автора отзыва. */
  text: Option[String],
state: Option[FeedbackStateType],
author: Option[FeedbackAuthorDTO],
/* Достоинства магазина, описанные в отзыве. */
  pro: Option[String],
/* Недостатки магазина, описанные в отзыве. */
  contra: Option[String],
/* Переписка автора отзыва с магазином. */
  comments: List[FeedbackCommentDTO],
shop: Option[FeedbackShopDTO],
/* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */
  resolved: Option[Boolean],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */
  verified: Option[Boolean],
/* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */
  recommend: Option[Boolean],
grades: Option[FeedbackGradesDTO],
order: Option[FeedbackOrderDTO])

object FeedbackDTO {
  import DateTimeCodecs._

  implicit val FeedbackDTOCodecJson: CodecJson[FeedbackDTO] = CodecJson.derive[FeedbackDTO]
  implicit val FeedbackDTODecoder: EntityDecoder[FeedbackDTO] = jsonOf[FeedbackDTO]
  implicit val FeedbackDTOEncoder: EntityEncoder[FeedbackDTO] = jsonEncoderOf[FeedbackDTO]
}
