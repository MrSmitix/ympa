package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ReturnDecisionReasonType
import org.openapitools.models.ReturnDecisionSubreasonType
import org.openapitools.models.ReturnDecisionType
import scala.collection.immutable.Seq

/**
 * Решения по возвратам.
 * @param returnItemId Идентификатор товара в возврате.
 * @param count Количество единиц товара.
 * @param comment Комментарий.
 * @param reasonType 
 * @param subreasonType 
 * @param decisionType 
 * @param refundAmount Сумма возврата.
 * @param partnerCompensation Компенсация за обратную доставку.
 * @param images Список хеш-кодов фотографий товара от покупателя.
 */
case class ReturnDecisionDTO(returnItemId: Option[Long],
                count: Option[Int],
                comment: Option[String],
                reasonType: Option[ReturnDecisionReasonType],
                subreasonType: Option[ReturnDecisionSubreasonType],
                decisionType: Option[ReturnDecisionType],
                refundAmount: Option[Long],
                partnerCompensation: Option[Long],
                images: Option[Seq[String]]
                )

object ReturnDecisionDTO {
    /**
     * Creates the codec for converting ReturnDecisionDTO from and to JSON.
     */
    implicit val decoder: Decoder[ReturnDecisionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnDecisionDTO] = deriveEncoder
}
