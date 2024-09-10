package org.openapitools.server.model


/**
 * Модель товара.
 *
 * @param id Идентификатор модели товара. for example: ''null''
 * @param name Название модели товара. for example: ''null''
 * @param prices  for example: ''null''
 * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  for example: ''null''
 * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. for example: ''null''
 * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. for example: ''null''
*/
final case class EnrichedModelDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  prices: Option[ModelPriceDTO] = None,
  offers: Option[Seq[ModelOfferDTO]] = None,
  offlineOffers: Option[Int] = None,
  onlineOffers: Option[Int] = None
)

