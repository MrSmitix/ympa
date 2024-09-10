goog.provide('API.Client.FeedParameterDTO');

/**
 * Параметр прайс-листа.
 * @record
 */
API.Client.FeedParameterDTO = function() {}

/**
 * Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
 * @type {!boolean}
 * @export
 */
API.Client.FeedParameterDTO.prototype.deleted;

/**
 * Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
 * @type {!string}
 * @export
 */
API.Client.FeedParameterDTO.prototype.name;

/**
 * Значения параметра.  Используется вместе с параметром `name`. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.FeedParameterDTO.prototype.values;

