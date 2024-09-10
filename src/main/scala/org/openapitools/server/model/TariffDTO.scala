package org.openapitools.server.model


/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 *
 * @param `type`  for example: ''null''
 * @param percent {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  for example: ''null''
 * @param amount Значение тарифа в рублях. for example: ''null''
 * @param parameters Параметры расчета тарифа. for example: ''null''
*/
final case class TariffDTO (
  `type`: TariffType,
  percent: Option[Double] = None,
  amount: Double,
  parameters: Seq[TariffParameterDTO]
)

