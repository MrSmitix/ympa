package org.openapitools.server.model


/**
 * Запрос на подтверждение цены. 
 *
 * @param offerIds Идентификаторы товаров, у которых подтверждается цена. for example: ''null''
*/
final case class ConfirmPricesRequest (
  offerIds: Seq[String]
)

