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
import { ForwardScrollingPagerDTO } from './forwardScrollingPagerDTO';
import { OfferCardDTO } from './offerCardDTO';


/**
 * Список товаров с информацией о состоянии карточек.
 */
export interface OfferCardsContentStatusDTO { 
    /**
     * Страница списка товаров с информацией о состоянии карточек.
     */
    offerCards: Array<OfferCardDTO>;
    paging?: ForwardScrollingPagerDTO;
}

