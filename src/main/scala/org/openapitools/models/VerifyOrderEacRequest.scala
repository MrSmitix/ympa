package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * 
 * @param code Код для подтверждения ЭАПП.
 */
case class VerifyOrderEacRequest(code: Option[String]
                )

object VerifyOrderEacRequest {
    /**
     * Creates the codec for converting VerifyOrderEacRequest from and to JSON.
     */
    implicit val decoder: Decoder[VerifyOrderEacRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[VerifyOrderEacRequest] = deriveEncoder
}
