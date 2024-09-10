package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoAssortmentInfoDTO._

case class GetPromoAssortmentInfoDTO (
  /* Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
  activeOffers: Integer,
/* Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  */
  potentialOffers: Option[Integer],
/* Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  */
  processing: Option[Boolean])

object GetPromoAssortmentInfoDTO {
  import DateTimeCodecs._

  implicit val GetPromoAssortmentInfoDTOCodecJson: CodecJson[GetPromoAssortmentInfoDTO] = CodecJson.derive[GetPromoAssortmentInfoDTO]
  implicit val GetPromoAssortmentInfoDTODecoder: EntityDecoder[GetPromoAssortmentInfoDTO] = jsonOf[GetPromoAssortmentInfoDTO]
  implicit val GetPromoAssortmentInfoDTOEncoder: EntityEncoder[GetPromoAssortmentInfoDTO] = jsonEncoderOf[GetPromoAssortmentInfoDTO]
}
