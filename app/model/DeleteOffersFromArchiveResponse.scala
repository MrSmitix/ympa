package model

import play.api.libs.json._

/**
  * Результат разархивации товаров.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteOffersFromArchiveResponse(
  status: Option[ApiResponseStatusType],
  result: Option[DeleteOffersFromArchiveDTO]
  additionalProperties: 
)

object DeleteOffersFromArchiveResponse {
  implicit lazy val deleteOffersFromArchiveResponseJsonFormat: Format[DeleteOffersFromArchiveResponse] = {
    val realJsonFormat = Json.format[DeleteOffersFromArchiveResponse]
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
      Writes { deleteOffersFromArchiveResponse =>
        val jsObj = realJsonFormat.writes(deleteOffersFromArchiveResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

