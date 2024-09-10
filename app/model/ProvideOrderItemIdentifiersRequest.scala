package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProvideOrderItemIdentifiersRequest.
  * @param items Список позиций, требующих маркировки. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ProvideOrderItemIdentifiersRequest(
  items: List[OrderItemInstanceModificationDTO]
)

object ProvideOrderItemIdentifiersRequest {
  implicit lazy val provideOrderItemIdentifiersRequestJsonFormat: Format[ProvideOrderItemIdentifiersRequest] = Json.format[ProvideOrderItemIdentifiersRequest]
}

