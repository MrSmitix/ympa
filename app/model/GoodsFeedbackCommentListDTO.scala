package model

import play.api.libs.json._

/**
  * Комментарии к отзыву.
  * @param comments Список комментариев.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackCommentListDTO(
  comments: List[GoodsFeedbackCommentDTO],
  paging: Option[ForwardScrollingPagerDTO]
)

object GoodsFeedbackCommentListDTO {
  implicit lazy val goodsFeedbackCommentListDTOJsonFormat: Format[GoodsFeedbackCommentListDTO] = Json.format[GoodsFeedbackCommentListDTO]
}

