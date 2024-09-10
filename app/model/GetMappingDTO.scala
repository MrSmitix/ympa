package model

import play.api.libs.json._

/**
  * Информация о товарах в каталоге. 
  * @param marketSku SKU на Маркете.
  * @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  * @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  * @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  * @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  * @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetMappingDTO(
  marketSku: Option[Long],
  marketSkuName: Option[String],
  marketModelId: Option[Long],
  marketModelName: Option[String],
  marketCategoryId: Option[Long],
  marketCategoryName: Option[String]
  additionalProperties: 
)

object GetMappingDTO {
  implicit lazy val getMappingDTOJsonFormat: Format[GetMappingDTO] = {
    val realJsonFormat = Json.format[GetMappingDTO]
    val declaredPropNames = Set("marketSku", "marketSkuName", "marketModelId", "marketModelName", "marketCategoryId", "marketCategoryName")
    
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
      Writes { getMappingDTO =>
        val jsObj = realJsonFormat.writes(getMappingDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

