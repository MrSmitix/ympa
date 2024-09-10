package model

import play.api.libs.json._

/**
  * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
  * @param errors Список ошибок.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ApiForbiddenErrorResponse(
  status: Option[ApiResponseStatusType],
  errors: Option[List[ApiErrorDTO]]
  additionalProperties: 
)

object ApiForbiddenErrorResponse {
  implicit lazy val apiForbiddenErrorResponseJsonFormat: Format[ApiForbiddenErrorResponse] = {
    val realJsonFormat = Json.format[ApiForbiddenErrorResponse]
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
      Writes { apiForbiddenErrorResponse =>
        val jsObj = realJsonFormat.writes(apiForbiddenErrorResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

