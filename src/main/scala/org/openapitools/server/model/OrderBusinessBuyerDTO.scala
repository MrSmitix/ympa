package org.openapitools.server.model


/**
 * Информация о покупателе. 
 *
 * @param inn ИНН. for example: ''null''
 * @param kpp КПП. for example: ''null''
 * @param organizationName Наименование юридического лица. for example: ''null''
 * @param organizationJurAddress Юридический адрес. for example: ''null''
*/
final case class OrderBusinessBuyerDTO (
  inn: Option[String] = None,
  kpp: Option[String] = None,
  organizationName: Option[String] = None,
  organizationJurAddress: Option[String] = None
)

