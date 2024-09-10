goog.provide('API.Client.GetPromoBestsellerInfoDTO');

/**
 * Информация об акции «Бестселлеры Маркета».
 * @record
 */
API.Client.GetPromoBestsellerInfoDTO = function() {}

/**
 * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
 * @type {!boolean}
 * @export
 */
API.Client.GetPromoBestsellerInfoDTO.prototype.bestseller;

/**
 * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
 * @type {!Date}
 * @export
 */
API.Client.GetPromoBestsellerInfoDTO.prototype.entryDeadline;

