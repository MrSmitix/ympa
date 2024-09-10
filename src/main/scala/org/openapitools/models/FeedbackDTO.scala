package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.FeedbackAuthorDTO
import org.openapitools.models.FeedbackCommentDTO
import org.openapitools.models.FeedbackGradesDTO
import org.openapitools.models.FeedbackOrderDTO
import org.openapitools.models.FeedbackShopDTO
import org.openapitools.models.FeedbackStateType
import scala.collection.immutable.Seq

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 * @param id Идентификатор отзыва.
 * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param text Комментарий автора отзыва.
 * @param state 
 * @param author 
 * @param pro Достоинства магазина, описанные в отзыве.
 * @param contra Недостатки магазина, описанные в отзыве.
 * @param comments Переписка автора отзыва с магазином.
 * @param shop 
 * @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
 * @param verified {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
 * @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
 * @param grades 
 * @param order 
 */
case class FeedbackDTO(id: Option[Long],
                createdAt: Option[ZonedDateTime],
                text: Option[String],
                state: Option[FeedbackStateType],
                author: Option[FeedbackAuthorDTO],
                pro: Option[String],
                contra: Option[String],
                comments: Seq[FeedbackCommentDTO],
                shop: Option[FeedbackShopDTO],
                resolved: Option[Boolean],
                verified: Option[Boolean],
                recommend: Option[Boolean],
                grades: Option[FeedbackGradesDTO],
                order: Option[FeedbackOrderDTO]
                )

object FeedbackDTO {
    /**
     * Creates the codec for converting FeedbackDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackDTO] = deriveEncoder
}
