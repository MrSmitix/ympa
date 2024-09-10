goog.provide('API.Client.FeedDTO');

/**
 * Информация о прайс-листе.
 * @record
 */
API.Client.FeedDTO = function() {}

/**
 * Идентификатор прайс-листа.
 * @type {!number}
 * @export
 */
API.Client.FeedDTO.prototype.id;

/**
 * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @type {!string}
 * @export
 */
API.Client.FeedDTO.prototype.login;

/**
 * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @type {!string}
 * @export
 */
API.Client.FeedDTO.prototype.name;

/**
 * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @type {!string}
 * @export
 */
API.Client.FeedDTO.prototype.password;

/**
 * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @type {!Date}
 * @export
 */
API.Client.FeedDTO.prototype.uploadDate;

/**
 * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
 * @type {!string}
 * @export
 */
API.Client.FeedDTO.prototype.url;

/**
 * @type {!API.Client.FeedContentDTO}
 * @export
 */
API.Client.FeedDTO.prototype.content;

/**
 * @type {!API.Client.FeedDownloadDTO}
 * @export
 */
API.Client.FeedDTO.prototype.download;

/**
 * @type {!API.Client.FeedPlacementDTO}
 * @export
 */
API.Client.FeedDTO.prototype.placement;

/**
 * @type {!API.Client.FeedPublicationDTO}
 * @export
 */
API.Client.FeedDTO.prototype.publication;

