package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnrichedModelDTO._

case class EnrichedModelDTO (
  /* Идентификатор модели товара. */
  id: Option[Long],
/* Название модели товара. */
  name: Option[String],
prices: Option[ModelPriceDTO],
/* Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  */
  offers: Option[List[ModelOfferDTO]],
/* Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. */
  offlineOffers: Option[Integer],
/* Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. */
  onlineOffers: Option[Integer])

object EnrichedModelDTO {
  import DateTimeCodecs._

  implicit val EnrichedModelDTOCodecJson: CodecJson[EnrichedModelDTO] = CodecJson.derive[EnrichedModelDTO]
  implicit val EnrichedModelDTODecoder: EntityDecoder[EnrichedModelDTO] = jsonOf[EnrichedModelDTO]
  implicit val EnrichedModelDTOEncoder: EntityEncoder[EnrichedModelDTO] = jsonEncoderOf[EnrichedModelDTO]
}
