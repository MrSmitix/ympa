package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 *
 * @param id Идентификатор отзыва. for example: ''null''
 * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  for example: ''null''
 * @param text Комментарий автора отзыва. for example: ''null''
 * @param state  for example: ''null''
 * @param author  for example: ''null''
 * @param pro Достоинства магазина, описанные в отзыве. for example: ''null''
 * @param contra Недостатки магазина, описанные в отзыве. for example: ''null''
 * @param comments Переписка автора отзыва с магазином. for example: ''null''
 * @param shop  for example: ''null''
 * @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  for example: ''null''
 * @param verified {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  for example: ''null''
 * @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  for example: ''null''
 * @param grades  for example: ''null''
 * @param order  for example: ''null''
*/
final case class FeedbackDTO (
  id: Option[Long] = None,
  createdAt: Option[OffsetDateTime] = None,
  text: Option[String] = None,
  state: Option[FeedbackStateType] = None,
  author: Option[FeedbackAuthorDTO] = None,
  pro: Option[String] = None,
  contra: Option[String] = None,
  comments: Seq[FeedbackCommentDTO],
  shop: Option[FeedbackShopDTO] = None,
  resolved: Option[Boolean] = None,
  verified: Option[Boolean] = None,
  recommend: Option[Boolean] = None,
  grades: Option[FeedbackGradesDTO] = None,
  order: Option[FeedbackOrderDTO] = None
)

