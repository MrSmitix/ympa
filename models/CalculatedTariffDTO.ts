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
    CalculatedTariffType,
    TariffParameterDTO,
} from './';

/**
 * Информация об услугах Маркета.
 * @export
 * @interface CalculatedTariffDTO
 */
export interface CalculatedTariffDTO {
    /**
     * @type {CalculatedTariffType}
     * @memberof CalculatedTariffDTO
     */
    type: CalculatedTariffType;
    /**
     * Стоимость услуги в рублях.
     * @type {number}
     * @memberof CalculatedTariffDTO
     */
    amount?: number;
    /**
     * Параметры расчета тарифа.
     * @type {Array<TariffParameterDTO>}
     * @memberof CalculatedTariffDTO
     */
    parameters: Array<TariffParameterDTO>;
}


