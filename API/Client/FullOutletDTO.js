goog.provide('API.Client.FullOutletDTO');

/**
 * Информация о точке продаж.
 * @record
 */
API.Client.FullOutletDTO = function() {}

/**
 * Название точки продаж. 
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.name;

/**
 * @type {!API.Client.OutletType}
 * @export
 */
API.Client.FullOutletDTO.prototype.type;

/**
 * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.coords;

/**
 * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
 * @type {!boolean}
 * @export
 */
API.Client.FullOutletDTO.prototype.isMain;

/**
 * Идентификатор точки продаж, присвоенный магазином.
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.shopOutletCode;

/**
 * @type {!API.Client.OutletVisibilityType}
 * @export
 */
API.Client.FullOutletDTO.prototype.visibility;

/**
 * @type {!API.Client.OutletAddressDTO}
 * @export
 */
API.Client.FullOutletDTO.prototype.address;

/**
 * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.FullOutletDTO.prototype.phones;

/**
 * @type {!API.Client.OutletWorkingScheduleDTO}
 * @export
 */
API.Client.FullOutletDTO.prototype.workingSchedule;

/**
 * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
 * @type {!Array<!API.Client.OutletDeliveryRuleDTO>}
 * @export
 */
API.Client.FullOutletDTO.prototype.deliveryRules;

/**
 * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
 * @type {!number}
 * @export
 */
API.Client.FullOutletDTO.prototype.storagePeriod;

/**
 * Идентификатор точки продаж, присвоенный Маркетом.
 * @type {!number}
 * @export
 */
API.Client.FullOutletDTO.prototype.id;

/**
 * @type {!API.Client.OutletStatusType}
 * @export
 */
API.Client.FullOutletDTO.prototype.status;

/**
 * @type {!API.Client.RegionDTO}
 * @export
 */
API.Client.FullOutletDTO.prototype.region;

/**
 * Идентификатор точки продаж, заданный магазином.
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.shopOutletId;

/**
 * Рабочее время.
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.workingTime;

/**
 * Статус модерации.
 * @type {!string}
 * @export
 */
API.Client.FullOutletDTO.prototype.moderationReason;

