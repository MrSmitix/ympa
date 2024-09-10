package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetPromoPromocodeInfoDTO
import org.openapitools.models.MechanicsType

/**
 * Информация о типе акции.
 * @param _type 
 * @param promocodeInfo 
 */
case class GetPromoMechanicsInfoDTO(_type: MechanicsType,
                promocodeInfo: Option[GetPromoPromocodeInfoDTO]
                )

object GetPromoMechanicsInfoDTO {
    /**
     * Creates the codec for converting GetPromoMechanicsInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetPromoMechanicsInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetPromoMechanicsInfoDTO] = deriveEncoder
}
