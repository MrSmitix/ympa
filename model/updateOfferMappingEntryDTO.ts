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
import { OfferMappingDTO } from './offerMappingDTO';
import { UpdateMappingsOfferDTO } from './updateMappingsOfferDTO';


/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 */
export interface UpdateOfferMappingEntryDTO { 
    mapping?: OfferMappingDTO;
    awaitingModerationMapping?: OfferMappingDTO;
    rejectedMapping?: OfferMappingDTO;
    offer?: UpdateMappingsOfferDTO;
}

