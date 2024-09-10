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
import { TariffParameterDTO } from './tariffParameterDTO';
import { CalculatedTariffType } from './calculatedTariffType';


/**
 * Информация об услугах Маркета.
 */
export interface CalculatedTariffDTO { 
    type: CalculatedTariffType;
    /**
     * Стоимость услуги в рублях.
     */
    amount?: number;
    /**
     * Параметры расчета тарифа.
     */
    parameters: Array<TariffParameterDTO>;
}
export namespace CalculatedTariffDTO {
}


