/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using model.mustache
package ympa_scala_cask_server.model
import java.time.OffsetDateTime
import ympa_scala_cask_server.model.FeedbackAuthorDTO
import ympa_scala_cask_server.model.FeedbackCommentDTO
import ympa_scala_cask_server.model.FeedbackGradesDTO
import ympa_scala_cask_server.model.FeedbackOrderDTO
import ympa_scala_cask_server.model.FeedbackShopDTO
import ympa_scala_cask_server.model.FeedbackStateType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class FeedbackDTO(
/* Идентификатор отзыва. */
  id: Option[Long] = None ,

  /* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: Option[OffsetDateTime] = None ,

  /* Комментарий автора отзыва. */
  text: Option[String] = None ,

    state: Option[FeedbackStateType] = None ,

    author: Option[FeedbackAuthorDTO] = None ,

  /* Достоинства магазина, описанные в отзыве. */
  pro: Option[String] = None ,

  /* Недостатки магазина, описанные в отзыве. */
  contra: Option[String] = None ,

  /* Переписка автора отзыва с магазином. */
  comments: Seq[FeedbackCommentDTO],

    shop: Option[FeedbackShopDTO] = None ,

  /* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */
  resolved: Option[Boolean] = None ,

  /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */
  verified: Option[Boolean] = None ,

  /* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */
  recommend: Option[Boolean] = None ,

    grades: Option[FeedbackGradesDTO] = None ,

    order: Option[FeedbackOrderDTO] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : FeedbackDTOData = {
    FeedbackDTOData(
            id = id.getOrElse(0),
            createdAt = createdAt.getOrElse(null),
            text = text.getOrElse(""),
            state = state.getOrElse(null),
            author = author.map(_.asData).getOrElse(null),
            pro = pro.getOrElse(""),
            contra = contra.getOrElse(""),
            comments = comments.map(_.asData),
            shop = shop.map(_.asData).getOrElse(null),
            resolved = resolved.getOrElse(false),
            verified = verified.getOrElse(false),
            recommend = recommend.getOrElse(false),
            grades = grades.map(_.asData).getOrElse(null),
            order = order.map(_.asData).getOrElse(null)
    )
  }

}

object FeedbackDTO{

    given RW[FeedbackDTO] = FeedbackDTOData.readWriter.bimap[FeedbackDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case createdAt extends Fields("createdAt")
            case text extends Fields("text")
            case state extends Fields("state")
            case author extends Fields("author")
            case pro extends Fields("pro")
            case contra extends Fields("contra")
            case comments extends Fields("comments")
            case shop extends Fields("shop")
            case resolved extends Fields("resolved")
            case verified extends Fields("verified")
            case recommend extends Fields("recommend")
            case grades extends Fields("grades")
            case order extends Fields("order")
    }


}

