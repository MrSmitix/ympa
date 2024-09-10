// tslint:disable
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
 */

import type {
    ForwardScrollingPagerDTO,
    GetChatInfoDTO,
} from './';

/**
 * Список чатов.
 * @export
 * @interface GetChatsInfoDTO
 */
export interface GetChatsInfoDTO {
    /**
     * Информация о чатах.
     * @type {Array<GetChatInfoDTO>}
     * @memberof GetChatsInfoDTO
     */
    chats: Array<GetChatInfoDTO>;
    /**
     * @type {ForwardScrollingPagerDTO}
     * @memberof GetChatsInfoDTO
     */
    paging?: ForwardScrollingPagerDTO;
}
