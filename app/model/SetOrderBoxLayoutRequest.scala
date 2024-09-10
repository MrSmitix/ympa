package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SetOrderBoxLayoutRequest.
  * @param boxes Список коробок.
  * @param allowRemove Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetOrderBoxLayoutRequest(
  boxes: List[OrderBoxLayoutDTO],
  allowRemove: Option[Boolean]
)

object SetOrderBoxLayoutRequest {
  implicit lazy val setOrderBoxLayoutRequestJsonFormat: Format[SetOrderBoxLayoutRequest] = Json.format[SetOrderBoxLayoutRequest]
}

