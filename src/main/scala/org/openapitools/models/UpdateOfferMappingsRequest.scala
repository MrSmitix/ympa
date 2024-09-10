package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.UpdateOfferMappingDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param offerMappings Перечень товаров, которые нужно добавить или обновить.
 * @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
 */
case class UpdateOfferMappingsRequest(offerMappings: Seq[UpdateOfferMappingDTO],
                onlyPartnerMediaContent: Option[Boolean]
                )

object UpdateOfferMappingsRequest {
    /**
     * Creates the codec for converting UpdateOfferMappingsRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOfferMappingsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOfferMappingsRequest] = deriveEncoder
}
