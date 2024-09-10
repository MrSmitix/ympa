package model

import play.api.libs.json._

/**
  * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
  * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @param parameterValues Список характеристик с их значениями. 
  * @param contentRating Процент заполненности карточки.
  * @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  * @param errors Ошибки в контенте, препятствующие размещению товара на витрине.
  * @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferCardDTO(
  offerId: String,
  mapping: Option[GetMappingDTO],
  parameterValues: Option[List[ParameterValueDTO]],
  cardStatus: Option[OfferCardStatusType],
  contentRating: Option[Int],
  recommendations: Option[List[OfferCardRecommendationDTO]],
  errors: Option[List[OfferErrorDTO]],
  warnings: Option[List[OfferErrorDTO]]
)

object OfferCardDTO {
  implicit lazy val offerCardDTOJsonFormat: Format[OfferCardDTO] = Json.format[OfferCardDTO]
}

