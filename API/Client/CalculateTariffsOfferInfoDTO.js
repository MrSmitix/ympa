goog.provide('API.Client.CalculateTariffsOfferInfoDTO');

/**
 * Стоимость услуг.
 * @record
 */
API.Client.CalculateTariffsOfferInfoDTO = function() {}

/**
 * @type {!API.Client.CalculateTariffsOfferDTO}
 * @export
 */
API.Client.CalculateTariffsOfferInfoDTO.prototype.offer;

/**
 * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
 * @type {!Array<!API.Client.CalculatedTariffDTO>}
 * @export
 */
API.Client.CalculateTariffsOfferInfoDTO.prototype.tariffs;

