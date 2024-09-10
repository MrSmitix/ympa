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
import { FullOutletDTO } from './fullOutletDTO';
import { FlippingPagerDTO } from './flippingPagerDTO';
import { ScrollingPagerDTO } from './scrollingPagerDTO';


/**
 * Ответ на запрос информации о точках продаж.
 */
export interface GetOutletsResponse { 
    /**
     * Информация о точках продаж.
     */
    outlets: Array<FullOutletDTO>;
    paging?: ScrollingPagerDTO;
    pager?: FlippingPagerDTO;
}

