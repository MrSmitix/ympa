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
import { FeedContentErrorDTO } from './feedContentErrorDTO';
import { FeedStatusType } from './feedStatusType';


/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
export interface FeedContentDTO { 
    /**
     * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
     */
    rejectedOffersCount?: number;
    status?: FeedStatusType;
    /**
     * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
     */
    totalOffersCount?: number;
    error?: FeedContentErrorDTO;
}
export namespace FeedContentDTO {
}


