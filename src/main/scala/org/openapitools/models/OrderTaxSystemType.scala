package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
 */
case class OrderTaxSystemType()

object OrderTaxSystemType {
    /**
     * Creates the codec for converting OrderTaxSystemType from and to JSON.
     */
    implicit val decoder: Decoder[OrderTaxSystemType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderTaxSystemType] = deriveEncoder
}
