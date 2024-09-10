goog.provide('API.Client.OfferParamDTO');

/**
 * Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} 
 * @record
 */
API.Client.OfferParamDTO = function() {}

/**
 * Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
 * @type {!string}
 * @export
 */
API.Client.OfferParamDTO.prototype.name;

/**
 * Значение. 
 * @type {!string}
 * @export
 */
API.Client.OfferParamDTO.prototype.value;

