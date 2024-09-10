package org.openapitools.server.model


/**
 * Запрос на создание или изменение лицензий для точек продаж.
 *
 * @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  for example: ''null''
*/
final case class UpdateOutletLicenseRequest (
  licenses: Seq[OutletLicenseDTO]
)

