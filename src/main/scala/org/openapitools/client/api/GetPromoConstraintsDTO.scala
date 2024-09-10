package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPromoConstraintsDTO._

case class GetPromoConstraintsDTO (
  /* Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  */
  warehouseIds: Option[List[Long]])

object GetPromoConstraintsDTO {
  import DateTimeCodecs._

  implicit val GetPromoConstraintsDTOCodecJson: CodecJson[GetPromoConstraintsDTO] = CodecJson.derive[GetPromoConstraintsDTO]
  implicit val GetPromoConstraintsDTODecoder: EntityDecoder[GetPromoConstraintsDTO] = jsonOf[GetPromoConstraintsDTO]
  implicit val GetPromoConstraintsDTOEncoder: EntityEncoder[GetPromoConstraintsDTO] = jsonEncoderOf[GetPromoConstraintsDTO]
}
