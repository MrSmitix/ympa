package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VerifyOrderEacRequest.
  * @param code Код для подтверждения ЭАПП.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class VerifyOrderEacRequest(
  code: Option[String]
)

object VerifyOrderEacRequest {
  implicit lazy val verifyOrderEacRequestJsonFormat: Format[VerifyOrderEacRequest] = Json.format[VerifyOrderEacRequest]
}

