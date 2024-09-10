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
import { LogisticPointType } from './logisticPointType';
import { PickupAddressDTO } from './pickupAddressDTO';


/**
 * Описание пункта вывоза для возврата.
 */
export interface LogisticPickupPointDTO { 
    /**
     * Идентификатор пункта вывоза.
     */
    id?: number;
    /**
     * Название пункта вывоза.
     */
    name?: string;
    address?: PickupAddressDTO;
    /**
     * Дополнительные инструкции к вывозу.
     */
    instruction?: string;
    type?: LogisticPointType;
    /**
     * Идентификатор логистического партнера, к которому относится логистическая точка.
     */
    logisticPartnerId?: number;
}
export namespace LogisticPickupPointDTO {
}


