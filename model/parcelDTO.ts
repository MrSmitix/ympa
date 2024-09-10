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
import { ParcelBoxDTO } from './parcelBoxDTO';


/**
 * Информация о грузовых местах в заказе.
 */
export interface ParcelDTO { 
    /**
     * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
     */
    boxes: Array<ParcelBoxDTO>;
}

