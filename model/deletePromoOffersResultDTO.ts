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
import { RejectedPromoOfferDeleteDTO } from './rejectedPromoOfferDeleteDTO';


/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 */
export interface DeletePromoOffersResultDTO { 
    /**
     * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
     */
    rejectedOffers?: Array<RejectedPromoOfferDeleteDTO> | null;
}

