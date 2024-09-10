goog.provide('API.Client.ChangeOutletRequest');

/**
 * @record
 */
API.Client.ChangeOutletRequest = function() {}

/**
 * Название точки продаж. 
 * @type {!string}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.name;

/**
 * @type {!API.Client.OutletType}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.type;

/**
 * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
 * @type {!string}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.coords;

/**
 * Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
 * @type {!boolean}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.isMain;

/**
 * Идентификатор точки продаж, присвоенный магазином.
 * @type {!string}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.shopOutletCode;

/**
 * @type {!API.Client.OutletVisibilityType}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.visibility;

/**
 * @type {!API.Client.OutletAddressDTO}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.address;

/**
 * Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.phones;

/**
 * @type {!API.Client.OutletWorkingScheduleDTO}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.workingSchedule;

/**
 * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
 * @type {!Array<!API.Client.OutletDeliveryRuleDTO>}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.deliveryRules;

/**
 * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
 * @type {!number}
 * @export
 */
API.Client.ChangeOutletRequest.prototype.storagePeriod;

