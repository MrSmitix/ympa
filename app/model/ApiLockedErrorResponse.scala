package model

import play.api.libs.json._

/**
  * Ресурс из запроса заблокирован от применения к нему указанного метода.
  * @param errors Список ошибок.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ApiLockedErrorResponse(
  status: Option[ApiResponseStatusType],
  errors: Option[List[ApiErrorDTO]]
  additionalProperties: 
)

object ApiLockedErrorResponse {
  implicit lazy val apiLockedErrorResponseJsonFormat: Format[ApiLockedErrorResponse] = {
    val realJsonFormat = Json.format[ApiLockedErrorResponse]
    val declaredPropNames = Set("status", "errors")
    
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
      Writes { apiLockedErrorResponse =>
        val jsObj = realJsonFormat.writes(apiLockedErrorResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

