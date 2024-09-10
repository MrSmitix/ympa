package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoDTO._

case class GetPromoDTO (
  /* Идентификатор акции. */
  id: String,
/* Название акции. */
  name: String,
period: PromoPeriodDTO,
/* Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  */
  participating: Boolean,
assortmentInfo: GetPromoAssortmentInfoDTO,
mechanicsInfo: GetPromoMechanicsInfoDTO,
bestsellerInfo: GetPromoBestsellerInfoDTO,
/* Список каналов продвижения товаров. */
  channels: Option[List[ChannelType]],
constraints: Option[GetPromoConstraintsDTO])

object GetPromoDTO {
  import DateTimeCodecs._

  implicit val GetPromoDTOCodecJson: CodecJson[GetPromoDTO] = CodecJson.derive[GetPromoDTO]
  implicit val GetPromoDTODecoder: EntityDecoder[GetPromoDTO] = jsonOf[GetPromoDTO]
  implicit val GetPromoDTOEncoder: EntityEncoder[GetPromoDTO] = jsonEncoderOf[GetPromoDTO]
}
