package org.openapitools.server.model


/**
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param mapping  for example: ''null''
 * @param parameterValues Список характеристик с их значениями.  for example: ''null''
 * @param cardStatus  for example: ''null''
 * @param contentRating Процент заполненности карточки. for example: ''null''
 * @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  for example: ''null''
 * @param errors Ошибки в контенте, препятствующие размещению товара на витрине. for example: ''null''
 * @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. for example: ''null''
*/
final case class OfferCardDTO (
  offerId: String,
  mapping: Option[GetMappingDTO] = None,
  parameterValues: Option[Seq[ParameterValueDTO]] = None,
  cardStatus: Option[OfferCardStatusType] = None,
  contentRating: Option[Int] = None,
  recommendations: Option[Seq[OfferCardRecommendationDTO]] = None,
  errors: Option[Seq[OfferErrorDTO]] = None,
  warnings: Option[Seq[OfferErrorDTO]] = None
)

