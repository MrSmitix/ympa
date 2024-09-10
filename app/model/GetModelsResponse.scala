package model

import play.api.libs.json._

/**
  * Ответ на запрос информации о моделях.
  * @param models Список моделей товаров.
  * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetModelsResponse(
  models: List[ModelDTO],
  currency: Option[CurrencyType],
  regionId: Option[Long]
  additionalProperties: 
)

object GetModelsResponse {
  implicit lazy val getModelsResponseJsonFormat: Format[GetModelsResponse] = {
    val realJsonFormat = Json.format[GetModelsResponse]
    val declaredPropNames = Set("models", "currency", "regionId")
    
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
      Writes { getModelsResponse =>
        val jsObj = realJsonFormat.writes(getModelsResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

