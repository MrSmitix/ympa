package org.openapitools.server.model


/**
 * Информация об услугах Маркета.
 *
 * @param `type`  for example: ''null''
 * @param amount Стоимость услуги в рублях. for example: ''null''
 * @param parameters Параметры расчета тарифа. for example: ''null''
*/
final case class CalculatedTariffDTO (
  `type`: CalculatedTariffType,
  amount: Option[Double] = None,
  parameters: Seq[TariffParameterDTO]
)

