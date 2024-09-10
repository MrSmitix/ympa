package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VerifyOrderEacResponse.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class VerifyOrderEacResponse(
  status: Option[ApiResponseStatusType],
  result: Option[EacVerificationResultDTO]
  additionalProperties: 
)

object VerifyOrderEacResponse {
  implicit lazy val verifyOrderEacResponseJsonFormat: Format[VerifyOrderEacResponse] = {
    val realJsonFormat = Json.format[VerifyOrderEacResponse]
    val declaredPropNames = Set("status", "result")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { verifyOrderEacResponse =>
        val jsObj = realJsonFormat.writes(verifyOrderEacResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

