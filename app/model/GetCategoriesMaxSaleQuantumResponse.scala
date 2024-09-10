package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetCategoriesMaxSaleQuantumResponse.
  * @param results Категории и лимит на установку кванта и минимального количества товаров.
  * @param errors Ошибки, которые появились из-за переданных категорий.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCategoriesMaxSaleQuantumResponse(
  status: Option[ApiResponseStatusType],
  results: List[MaxSaleQuantumDTO],
  errors: Option[List[CategoryErrorDTO]]
  additionalProperties: 
)

object GetCategoriesMaxSaleQuantumResponse {
  implicit lazy val getCategoriesMaxSaleQuantumResponseJsonFormat: Format[GetCategoriesMaxSaleQuantumResponse] = {
    val realJsonFormat = Json.format[GetCategoriesMaxSaleQuantumResponse]
    val declaredPropNames = Set("status", "results", "errors")
    
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
      Writes { getCategoriesMaxSaleQuantumResponse =>
        val jsObj = realJsonFormat.writes(getCategoriesMaxSaleQuantumResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

