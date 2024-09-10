goog.provide('API.Client.CampaignSettingsScheduleDTO');

/**
 * Расписание работы службы доставки в своем регионе.
 * @record
 */
API.Client.CampaignSettingsScheduleDTO = function() {}

/**
 * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
 * @type {!boolean}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.availableOnHolidays;

/**
 * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.customHolidays;

/**
 * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.customWorkingDays;

/**
 * @type {!API.Client.CampaignSettingsTimePeriodDTO}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.period;

/**
 * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.totalHolidays;

/**
 * Список выходных дней недели и государственных праздников.
 * @type {!Array<!number>}
 * @export
 */
API.Client.CampaignSettingsScheduleDTO.prototype.weeklyHolidays;

