package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferMappingsRequest._

case class UpdateOfferMappingsRequest (
  /* Перечень товаров, которые нужно добавить или обновить. */
  offerMappings: List[UpdateOfferMappingDTO],
/* Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  */
  onlyPartnerMediaContent: Option[Boolean])

object UpdateOfferMappingsRequest {
  import DateTimeCodecs._

  implicit val UpdateOfferMappingsRequestCodecJson: CodecJson[UpdateOfferMappingsRequest] = CodecJson.derive[UpdateOfferMappingsRequest]
  implicit val UpdateOfferMappingsRequestDecoder: EntityDecoder[UpdateOfferMappingsRequest] = jsonOf[UpdateOfferMappingsRequest]
  implicit val UpdateOfferMappingsRequestEncoder: EntityEncoder[UpdateOfferMappingsRequest] = jsonEncoderOf[UpdateOfferMappingsRequest]
}
