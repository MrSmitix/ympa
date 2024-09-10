package org.openapitools.server.model


/**
 * Информация о документах. 
 *
 * @param upd  for example: ''null''
 * @param ukd  for example: ''null''
 * @param torgTwelve  for example: ''null''
 * @param sf  for example: ''null''
 * @param ksf  for example: ''null''
*/
final case class OrderBusinessDocumentsDTO (
  upd: Option[DocumentDTO] = None,
  ukd: Option[DocumentDTO] = None,
  torgTwelve: Option[DocumentDTO] = None,
  sf: Option[DocumentDTO] = None,
  ksf: Option[DocumentDTO] = None
)

