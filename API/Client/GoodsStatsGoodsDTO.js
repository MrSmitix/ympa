goog.provide('API.Client.GoodsStatsGoodsDTO');

/**
 * Информация о товаре.
 * @record
 */
API.Client.GoodsStatsGoodsDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.shopSku;

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.marketSku;

/**
 * Название товара.
 * @type {!string}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.name;

/**
 * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.price;

/**
 * Идентификатор категории товара на Маркете.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.categoryId;

/**
 * Название категории товара на Маркете.
 * @type {!string}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.categoryName;

/**
 * @type {!API.Client.GoodsStatsWeightDimensionsDTO}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.weightDimensions;

/**
 * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
 * @type {!Array<!API.Client.GoodsStatsWarehouseDTO>}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.warehouses;

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
 * @type {!Array<!API.Client.TariffDTO>}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.tariffs;

/**
 * Ссылки (URL) изображений товара в хорошем качестве.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GoodsStatsGoodsDTO.prototype.pictures;

