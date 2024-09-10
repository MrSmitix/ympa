package model

import play.api.libs.json._

/**
  * Пустой ответ сервера.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class EmptyApiResponse(
  status: Option[ApiResponseStatusType]
  additionalProperties: 
)

object EmptyApiResponse {
  implicit lazy val emptyApiResponseJsonFormat: Format[EmptyApiResponse] = {
    val realJsonFormat = Json.format[EmptyApiResponse]
    val declaredPropNames = Set("status")
    
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
      Writes { emptyApiResponse =>
        val jsObj = realJsonFormat.writes(emptyApiResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

