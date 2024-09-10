/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { TariffParameterDTO } from './TariffParameterDTO';
import {
    TariffParameterDTOFromJSON,
    TariffParameterDTOFromJSONTyped,
    TariffParameterDTOToJSON,
} from './TariffParameterDTO';
import type { TariffType } from './TariffType';
import {
    TariffTypeFromJSON,
    TariffTypeFromJSONTyped,
    TariffTypeToJSON,
} from './TariffType';

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 * @export
 * @interface TariffDTO
 */
export interface TariffDTO {
    /**
     * 
     * @type {TariffType}
     * @memberof TariffDTO
     */
    type: TariffType;
    /**
     * {% note warning "" %}
     * 
     * Этот параметр устарел. Не используйте его.
     * 
     * {% endnote %}
     * 
     * Значение тарифа в процентах.
     * 
     * @type {number}
     * @memberof TariffDTO
     * @deprecated
     */
    percent?: number;
    /**
     * Значение тарифа в рублях.
     * @type {number}
     * @memberof TariffDTO
     */
    amount: number;
    /**
     * Параметры расчета тарифа.
     * @type {Array<TariffParameterDTO>}
     * @memberof TariffDTO
     */
    parameters: Array<TariffParameterDTO>;
}



/**
 * Check if a given object implements the TariffDTO interface.
 */
export function instanceOfTariffDTO(value: object): value is TariffDTO {
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('amount' in value) || value['amount'] === undefined) return false;
    if (!('parameters' in value) || value['parameters'] === undefined) return false;
    return true;
}

export function TariffDTOFromJSON(json: any): TariffDTO {
    return TariffDTOFromJSONTyped(json, false);
}

export function TariffDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): TariffDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': TariffTypeFromJSON(json['type']),
        'percent': json['percent'] == null ? undefined : json['percent'],
        'amount': json['amount'],
        'parameters': ((json['parameters'] as Array<any>).map(TariffParameterDTOFromJSON)),
    };
}

export function TariffDTOToJSON(value?: TariffDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': TariffTypeToJSON(value['type']),
        'percent': value['percent'],
        'amount': value['amount'],
        'parameters': ((value['parameters'] as Array<any>).map(TariffParameterDTOToJSON)),
    };
}
