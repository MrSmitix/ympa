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
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class UpdateGoodsFeedbackCommentDTO(
/* Идентификатор комментария к отзыву.  */
  id: Option[Long] = None ,

  /* Идентификатор комментария к отзыву.  */
  parentId: Option[Long] = None ,

  /* Текст комментария. */
  text: String

  ) {

  def asJson: String = asData.asJson

  def asData : UpdateGoodsFeedbackCommentDTOData = {
    UpdateGoodsFeedbackCommentDTOData(
            id = id.getOrElse(0),
            parentId = parentId.getOrElse(0),
            text = text
    )
  }

}

object UpdateGoodsFeedbackCommentDTO{

    given RW[UpdateGoodsFeedbackCommentDTO] = UpdateGoodsFeedbackCommentDTOData.readWriter.bimap[UpdateGoodsFeedbackCommentDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case parentId extends Fields("parentId")
            case text extends Fields("text")
    }


}

