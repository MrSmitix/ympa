goog.provide('API.Client.LogisticPickupPointDTO');

/**
 * Описание пункта вывоза для возврата.
 * @record
 */
API.Client.LogisticPickupPointDTO = function() {}

/**
 * Идентификатор пункта вывоза.
 * @type {!number}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.id;

/**
 * Название пункта вывоза.
 * @type {!string}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.name;

/**
 * @type {!API.Client.PickupAddressDTO}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.address;

/**
 * Дополнительные инструкции к вывозу.
 * @type {!string}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.instruction;

/**
 * @type {!API.Client.LogisticPointType}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.type;

/**
 * Идентификатор логистического партнера, к которому относится логистическая точка.
 * @type {!number}
 * @export
 */
API.Client.LogisticPickupPointDTO.prototype.logisticPartnerId;

