goog.provide('API.Client.UpdateStockItemDTO');

/**
 * Информация об остатках товара. 
 * @record
 */
API.Client.UpdateStockItemDTO = function() {}

/**
 * Количество доступного товара. 
 * @type {!number}
 * @export
 */
API.Client.UpdateStockItemDTO.prototype.count;

/**
 * Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.UpdateStockItemDTO.prototype.updatedAt;

