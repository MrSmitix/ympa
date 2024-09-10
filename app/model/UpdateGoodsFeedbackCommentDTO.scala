package model

import play.api.libs.json._

/**
  * Комментарий к отзыву или другому комментарию.
  * @param id Идентификатор комментария к отзыву. 
  * @param parentId Идентификатор комментария к отзыву. 
  * @param text Текст комментария.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateGoodsFeedbackCommentDTO(
  id: Option[Long],
  parentId: Option[Long],
  text: String
)

object UpdateGoodsFeedbackCommentDTO {
  implicit lazy val updateGoodsFeedbackCommentDTOJsonFormat: Format[UpdateGoodsFeedbackCommentDTO] = Json.format[UpdateGoodsFeedbackCommentDTO]
}

