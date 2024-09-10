package org.openapitools.server.model


/**
 * Регион доставки.
 *
 * @param id Идентификатор региона. for example: ''null''
 * @param name Название региона. for example: ''null''
 * @param `type`  for example: ''null''
 * @param parent  for example: ''null''
 * @param children Дочерние регионы. for example: ''null''
*/
final case class RegionDTO (
  id: Option[Long] = None,
  name: String,
  `type`: RegionType,
  parent: Option[RegionDTO] = None,
  children: Option[Seq[RegionDTO]] = None
)

