package model

import play.api.libs.json._

/**
  * Превышено ограничение на доступ к ресурсу.
  * @param errors Список ошибок.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ApiLimitErrorResponse(
  status: Option[ApiResponseStatusType],
  errors: Option[List[ApiErrorDTO]]
  additionalProperties: 
)

object ApiLimitErrorResponse {
  implicit lazy val apiLimitErrorResponseJsonFormat: Format[ApiLimitErrorResponse] = {
    val realJsonFormat = Json.format[ApiLimitErrorResponse]
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
      Writes { apiLimitErrorResponse =>
        val jsObj = realJsonFormat.writes(apiLimitErrorResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

