package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ReturnDecisionDTO
import org.openapitools.models.ReturnInstanceDTO
import org.openapitools.models.TrackDTO
import scala.collection.immutable.Seq

/**
 * Список товаров в возврате.
 * @param marketSku SKU на Маркете.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param count Количество единиц товара.
 * @param decisions Список решений по возврату.
 * @param instances Список логистических позиций возврата.
 * @param tracks Список трек-кодов для почтовых отправлений.
 */
case class ReturnItemDTO(marketSku: Option[Long],
                shopSku: String,
                count: Long,
                decisions: Option[Seq[ReturnDecisionDTO]],
                instances: Option[Seq[ReturnInstanceDTO]],
                tracks: Option[Seq[TrackDTO]]
                )

object ReturnItemDTO {
    /**
     * Creates the codec for converting ReturnItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[ReturnItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnItemDTO] = deriveEncoder
}
