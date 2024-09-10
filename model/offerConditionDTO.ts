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
import { OfferConditionQualityType } from './offerConditionQualityType';
import { OfferConditionType } from './offerConditionType';


/**
 * Состояние уцененного товара. 
 */
export interface OfferConditionDTO { 
    type?: OfferConditionType;
    quality?: OfferConditionQualityType;
    /**
     * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
     */
    reason?: string;
}
export namespace OfferConditionDTO {
}


