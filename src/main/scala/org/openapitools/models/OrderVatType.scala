package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. 
 */
case class OrderVatType()

object OrderVatType {
    /**
     * Creates the codec for converting OrderVatType from and to JSON.
     */
    implicit val decoder: Decoder[OrderVatType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderVatType] = deriveEncoder
}
