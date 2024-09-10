package org.openapitools.server.model


/**
 * Параметр карантина.
 *
 * @param name  for example: ''null''
 * @param value Значение параметра. for example: ''null''
*/
final case class PriceQuarantineVerdictParameterDTO (
  name: PriceQuarantineVerdictParamNameType,
  value: String
)

