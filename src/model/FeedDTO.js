/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FeedContentDTO from './FeedContentDTO';
import FeedDownloadDTO from './FeedDownloadDTO';
import FeedPlacementDTO from './FeedPlacementDTO';
import FeedPublicationDTO from './FeedPublicationDTO';

/**
 * The FeedDTO model module.
 * @module model/FeedDTO
 * @version LATEST
 */
class FeedDTO {
    /**
     * Constructs a new <code>FeedDTO</code>.
     * Информация о прайс-листе.
     * @alias module:model/FeedDTO
     */
    constructor() { 
        
        FeedDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FeedDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FeedDTO} obj Optional instance to populate.
     * @return {module:model/FeedDTO} The populated <code>FeedDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FeedDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('login')) {
                obj['login'] = ApiClient.convertToType(data['login'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ApiClient.convertToType(data['password'], 'String');
            }
            if (data.hasOwnProperty('uploadDate')) {
                obj['uploadDate'] = ApiClient.convertToType(data['uploadDate'], 'Date');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = FeedContentDTO.constructFromObject(data['content']);
            }
            if (data.hasOwnProperty('download')) {
                obj['download'] = FeedDownloadDTO.constructFromObject(data['download']);
            }
            if (data.hasOwnProperty('placement')) {
                obj['placement'] = FeedPlacementDTO.constructFromObject(data['placement']);
            }
            if (data.hasOwnProperty('publication')) {
                obj['publication'] = FeedPublicationDTO.constructFromObject(data['publication']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>FeedDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>FeedDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['login'] && !(typeof data['login'] === 'string' || data['login'] instanceof String)) {
            throw new Error("Expected the field `login` to be a primitive type in the JSON string but got " + data['login']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['password'] && !(typeof data['password'] === 'string' || data['password'] instanceof String)) {
            throw new Error("Expected the field `password` to be a primitive type in the JSON string but got " + data['password']);
        }
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }
        // validate the optional field `content`
        if (data['content']) { // data not null
          FeedContentDTO.validateJSON(data['content']);
        }
        // validate the optional field `download`
        if (data['download']) { // data not null
          FeedDownloadDTO.validateJSON(data['download']);
        }
        // validate the optional field `placement`
        if (data['placement']) { // data not null
          FeedPlacementDTO.validateJSON(data['placement']);
        }
        // validate the optional field `publication`
        if (data['publication']) { // data not null
          FeedPublicationDTO.validateJSON(data['publication']);
        }

        return true;
    }


}



/**
 * Идентификатор прайс-листа.
 * @member {Number} id
 */
FeedDTO.prototype['id'] = undefined;

/**
 * Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @member {String} login
 */
FeedDTO.prototype['login'] = undefined;

/**
 * Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @member {String} name
 */
FeedDTO.prototype['name'] = undefined;

/**
 * Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @member {String} password
 */
FeedDTO.prototype['password'] = undefined;

/**
 * Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @member {Date} uploadDate
 */
FeedDTO.prototype['uploadDate'] = undefined;

/**
 * URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
 * @member {String} url
 */
FeedDTO.prototype['url'] = undefined;

/**
 * @member {module:model/FeedContentDTO} content
 */
FeedDTO.prototype['content'] = undefined;

/**
 * @member {module:model/FeedDownloadDTO} download
 */
FeedDTO.prototype['download'] = undefined;

/**
 * @member {module:model/FeedPlacementDTO} placement
 */
FeedDTO.prototype['placement'] = undefined;

/**
 * @member {module:model/FeedPublicationDTO} publication
 */
FeedDTO.prototype['publication'] = undefined;






export default FeedDTO;

