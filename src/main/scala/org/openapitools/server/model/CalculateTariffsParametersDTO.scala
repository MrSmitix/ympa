package org.openapitools.server.model


/**
 * Параметры для расчета стоимости услуг.
 *
 * @param campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  for example: ''null''
 * @param sellingProgram  for example: ''null''
 * @param frequency  for example: ''null''
*/
final case class CalculateTariffsParametersDTO (
  campaignId: Option[Long] = None,
  sellingProgram: Option[SellingProgramType] = None,
  frequency: Option[PaymentFrequencyType] = None
)

