package org.openapitools.server.model


/**
 * GPS-координаты широты и долготы. 
 *
 * @param latitude Широта. for example: ''null''
 * @param longitude Долгота. for example: ''null''
*/
final case class GpsDTO (
  latitude: Double,
  longitude: Double
)

