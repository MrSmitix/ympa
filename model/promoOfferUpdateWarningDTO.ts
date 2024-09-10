/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { PromoOfferUpdateWarningCodeType } from './promoOfferUpdateWarningCodeType';


/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */
export interface PromoOfferUpdateWarningDTO { 
    code: PromoOfferUpdateWarningCodeType;
    /**
     * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
     */
    campaignIds?: Array<number> | null;
}
export namespace PromoOfferUpdateWarningDTO {
}


