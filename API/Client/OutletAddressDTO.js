goog.provide('API.Client.OutletAddressDTO');

/**
 * Адрес точки продаж. 
 * @record
 */
API.Client.OutletAddressDTO = function() {}

/**
 * Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
 * @type {!number}
 * @export
 */
API.Client.OutletAddressDTO.prototype.regionId;

/**
 * Улица.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.street;

/**
 * Номер дома.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.number;

/**
 * Номер строения.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.building;

/**
 * Номер владения.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.estate;

/**
 * Номер корпуса.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.block;

/**
 * Дополнительная информация.
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.additional;

/**
 * Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
 * @type {!number}
 * @export
 */
API.Client.OutletAddressDTO.prototype.km;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
 * @type {!string}
 * @export
 */
API.Client.OutletAddressDTO.prototype.city;

