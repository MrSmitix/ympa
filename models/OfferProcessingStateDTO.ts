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
    OfferProcessingNoteDTO,
    OfferProcessingStatusType,
} from './';

/**
 * Информация о статусе публикации товара на Маркете.
 * @export
 * @interface OfferProcessingStateDTO
 */
export interface OfferProcessingStateDTO {
    /**
     * @type {OfferProcessingStatusType}
     * @memberof OfferProcessingStateDTO
     */
    status?: OfferProcessingStatusType;
    /**
     * Причины, по которым товар не прошел модерацию.
     * @type {Array<OfferProcessingNoteDTO>}
     * @memberof OfferProcessingStateDTO
     */
    notes?: Array<OfferProcessingNoteDTO> | null;
}


