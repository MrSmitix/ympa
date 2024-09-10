
package org.openapitools.client.model

import java.time.OffsetDateTime

case class FeedbackDTO (
    /* Идентификатор отзыва. */
    _id: Option[Long],
    /* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    _createdAt: Option[OffsetDateTime],
    /* Комментарий автора отзыва. */
    _text: Option[String],
    _state: Option[FeedbackStateType],
    _author: Option[FeedbackAuthorDTO],
    /* Достоинства магазина, описанные в отзыве. */
    _pro: Option[String],
    /* Недостатки магазина, описанные в отзыве. */
    _contra: Option[String],
    /* Переписка автора отзыва с магазином. */
    _comments: List[FeedbackCommentDTO],
    _shop: Option[FeedbackShopDTO],
    /* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */
    _resolved: Option[Boolean],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */
    _verified: Option[Boolean],
    /* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */
    _recommend: Option[Boolean],
    _grades: Option[FeedbackGradesDTO],
    _order: Option[FeedbackOrderDTO]
)
object FeedbackDTO {
    def toStringBody(var_id: Object, var_createdAt: Object, var_text: Object, var_state: Object, var_author: Object, var_pro: Object, var_contra: Object, var_comments: Object, var_shop: Object, var_resolved: Object, var_verified: Object, var_recommend: Object, var_grades: Object, var_order: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"text":$var_text,"state":$var_state,"author":$var_author,"pro":$var_pro,"contra":$var_contra,"comments":$var_comments,"shop":$var_shop,"resolved":$var_resolved,"verified":$var_verified,"recommend":$var_recommend,"grades":$var_grades,"order":$var_order
        | }
        """.stripMargin
}
