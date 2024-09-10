package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о товарах в каталоге. 
 * @param marketSku SKU на Маркете.
 * @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 * @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 */
case class GetMappingDTO(marketSku: Option[Long],
                marketSkuName: Option[String],
                marketModelId: Option[Long],
                marketModelName: Option[String],
                marketCategoryId: Option[Long],
                marketCategoryName: Option[String]
                )

object GetMappingDTO {
    /**
     * Creates the codec for converting GetMappingDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetMappingDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetMappingDTO] = deriveEncoder
}
