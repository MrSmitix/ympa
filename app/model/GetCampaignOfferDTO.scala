package model

import play.api.libs.json._

/**
  * Параметры размещения товара в магазине.
  * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @param available Есть ли товар в продаже. 
  * @param errors Ошибки, препятствующие размещению товара на витрине. 
  * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignOfferDTO(
  offerId: String,
  quantum: Option[QuantumDTO],
  available: Option[Boolean],
  basicPrice: Option[GetPriceWithDiscountDTO],
  campaignPrice: Option[GetPriceWithVatDTO],
  status: Option[OfferCampaignStatusType],
  errors: Option[List[OfferErrorDTO]],
  warnings: Option[List[OfferErrorDTO]]
  additionalProperties: 
)

object GetCampaignOfferDTO {
  implicit lazy val getCampaignOfferDTOJsonFormat: Format[GetCampaignOfferDTO] = {
    val realJsonFormat = Json.format[GetCampaignOfferDTO]
    val declaredPropNames = Set("offerId", "quantum", "available", "basicPrice", "campaignPrice", "status", "errors", "warnings")
    
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
      Writes { getCampaignOfferDTO =>
        val jsObj = realJsonFormat.writes(getCampaignOfferDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

