package org.openapitools.server.model


/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 *
 * @param licenses Список лицензий. for example: ''null''
*/
final case class OutletLicensesResponseDTO (
  licenses: Seq[FullOutletLicenseDTO]
)

