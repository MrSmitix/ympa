package model

import play.api.libs.json._

/**
  * В запросе не указаны авторизационные данные.
  * @param errors Список ошибок.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ApiUnauthorizedErrorResponse(
  status: Option[ApiResponseStatusType],
  errors: Option[List[ApiErrorDTO]]
  additionalProperties: 
)

object ApiUnauthorizedErrorResponse {
  implicit lazy val apiUnauthorizedErrorResponseJsonFormat: Format[ApiUnauthorizedErrorResponse] = {
    val realJsonFormat = Json.format[ApiUnauthorizedErrorResponse]
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
      Writes { apiUnauthorizedErrorResponse =>
        val jsObj = realJsonFormat.writes(apiUnauthorizedErrorResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

