goog.provide('API.Client.RegionDTO');

/**
 * Регион доставки.
 * @record
 */
API.Client.RegionDTO = function() {}

/**
 * Идентификатор региона.
 * @type {!number}
 * @export
 */
API.Client.RegionDTO.prototype.id;

/**
 * Название региона.
 * @type {!string}
 * @export
 */
API.Client.RegionDTO.prototype.name;

/**
 * @type {!API.Client.RegionType}
 * @export
 */
API.Client.RegionDTO.prototype.type;

/**
 * @type {!API.Client.RegionDTO}
 * @export
 */
API.Client.RegionDTO.prototype.parent;

/**
 * Дочерние регионы.
 * @type {!Array<!API.Client.RegionDTO>}
 * @export
 */
API.Client.RegionDTO.prototype.children;

