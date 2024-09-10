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

/**
 * The ChatMessagePayloadDTO model module.
 * @module model/ChatMessagePayloadDTO
 * @version LATEST
 */
class ChatMessagePayloadDTO {
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} url
     * @type {String}
     */
    url;
    /**
     * @member {Number} size
     * @type {Number}
     */
    size;

    

    /**
     * Constructs a new <code>ChatMessagePayloadDTO</code>.
     * Информация о приложенных к сообщению файлах.
     * @alias module:model/ChatMessagePayloadDTO
     * @param name {String} Имя файла.
     * @param url {String} Ссылка для скачивания файла.
     * @param size {Number} Размер файла в байтах.
     */
    constructor(name, url, size) { 
        
        ChatMessagePayloadDTO.initialize(this, name, url, size);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, url, size) { 
        obj['name'] = name;
        obj['url'] = url;
        obj['size'] = size;
    }

    /**
     * Constructs a <code>ChatMessagePayloadDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatMessagePayloadDTO} obj Optional instance to populate.
     * @return {module:model/ChatMessagePayloadDTO} The populated <code>ChatMessagePayloadDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatMessagePayloadDTO();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
        }
        return obj;
    }
}



export default ChatMessagePayloadDTO;

