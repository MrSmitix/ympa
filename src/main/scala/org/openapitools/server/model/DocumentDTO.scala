package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация о документе.
 *
 * @param status  for example: ''null''
 * @param number Номер документа. for example: ''null''
 * @param date Дата создания документа. for example: ''null''
*/
final case class DocumentDTO (
  status: Option[OrderDocumentStatusType] = None,
  number: Option[String] = None,
  date: Option[LocalDate] = None
)

