package model

import play.api.libs.json._

/**
  * Модель товара.
  * @param id Идентификатор модели товара.
  * @param name Название модели товара.
  * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
  * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
  * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class EnrichedModelDTO(
  id: Option[Long],
  name: Option[String],
  prices: Option[ModelPriceDTO],
  offers: Option[List[ModelOfferDTO]],
  offlineOffers: Option[Int],
  onlineOffers: Option[Int]
  additionalProperties: 
)

object EnrichedModelDTO {
  implicit lazy val enrichedModelDTOJsonFormat: Format[EnrichedModelDTO] = {
    val realJsonFormat = Json.format[EnrichedModelDTO]
    val declaredPropNames = Set("id", "name", "prices", "offers", "offlineOffers", "onlineOffers")
    
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
      Writes { enrichedModelDTO =>
        val jsObj = realJsonFormat.writes(enrichedModelDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

