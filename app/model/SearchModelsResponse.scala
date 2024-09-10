package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SearchModelsResponse.
  * @param models Список моделей товаров.
  * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SearchModelsResponse(
  models: List[ModelDTO],
  currency: Option[CurrencyType],
  regionId: Option[Long],
  pager: Option[FlippingPagerDTO]
  additionalProperties: 
)

object SearchModelsResponse {
  implicit lazy val searchModelsResponseJsonFormat: Format[SearchModelsResponse] = {
    val realJsonFormat = Json.format[SearchModelsResponse]
    val declaredPropNames = Set("models", "currency", "regionId", "pager")
    
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
      Writes { searchModelsResponse =>
        val jsObj = realJsonFormat.writes(searchModelsResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

