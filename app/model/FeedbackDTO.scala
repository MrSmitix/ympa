package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Отзыв пользователя Яндекс Маркета об указанном магазине.
  * @param id Идентификатор отзыва.
  * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  * @param text Комментарий автора отзыва.
  * @param pro Достоинства магазина, описанные в отзыве.
  * @param contra Недостатки магазина, описанные в отзыве.
  * @param comments Переписка автора отзыва с магазином.
  * @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
  * @param verified {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
  * @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackDTO(
  id: Option[Long],
  createdAt: Option[OffsetDateTime],
  text: Option[String],
  state: Option[FeedbackStateType],
  author: Option[FeedbackAuthorDTO],
  pro: Option[String],
  contra: Option[String],
  comments: List[FeedbackCommentDTO],
  shop: Option[FeedbackShopDTO],
  resolved: Option[Boolean],
  verified: Option[Boolean],
  recommend: Option[Boolean],
  grades: Option[FeedbackGradesDTO],
  order: Option[FeedbackOrderDTO]
)

object FeedbackDTO {
  implicit lazy val feedbackDTOJsonFormat: Format[FeedbackDTO] = Json.format[FeedbackDTO]
}

