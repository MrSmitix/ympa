package org.openapitools.server.model


/**
 * Стоимость услуг.
 *
 * @param offer  for example: ''null''
 * @param tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  for example: ''null''
*/
final case class CalculateTariffsOfferInfoDTO (
  offer: CalculateTariffsOfferDTO,
  tariffs: Seq[CalculatedTariffDTO]
)

