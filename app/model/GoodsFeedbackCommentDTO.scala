package model

import play.api.libs.json._

/**
  * Комментарий к отзыву.
  * @param id Идентификатор комментария к отзыву. 
  * @param text Текст комментария.
  * @param canModify Может ли продавец изменять комментарий или удалять его.
  * @param parentId Идентификатор комментария к отзыву. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsFeedbackCommentDTO(
  id: Long,
  text: String,
  canModify: Option[Boolean],
  parentId: Option[Long],
  author: GoodsFeedbackCommentAuthorDTO,
  status: GoodsFeedbackCommentStatusType
)

object GoodsFeedbackCommentDTO {
  implicit lazy val goodsFeedbackCommentDTOJsonFormat: Format[GoodsFeedbackCommentDTO] = Json.format[GoodsFeedbackCommentDTO]
}

