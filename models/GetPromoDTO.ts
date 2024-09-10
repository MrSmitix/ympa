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
import type { GetPromoMechanicsInfoDTO } from './GetPromoMechanicsInfoDTO';
import {
    GetPromoMechanicsInfoDTOFromJSON,
    GetPromoMechanicsInfoDTOFromJSONTyped,
    GetPromoMechanicsInfoDTOToJSON,
} from './GetPromoMechanicsInfoDTO';
import type { PromoPeriodDTO } from './PromoPeriodDTO';
import {
    PromoPeriodDTOFromJSON,
    PromoPeriodDTOFromJSONTyped,
    PromoPeriodDTOToJSON,
} from './PromoPeriodDTO';
import type { GetPromoAssortmentInfoDTO } from './GetPromoAssortmentInfoDTO';
import {
    GetPromoAssortmentInfoDTOFromJSON,
    GetPromoAssortmentInfoDTOFromJSONTyped,
    GetPromoAssortmentInfoDTOToJSON,
} from './GetPromoAssortmentInfoDTO';
import type { GetPromoBestsellerInfoDTO } from './GetPromoBestsellerInfoDTO';
import {
    GetPromoBestsellerInfoDTOFromJSON,
    GetPromoBestsellerInfoDTOFromJSONTyped,
    GetPromoBestsellerInfoDTOToJSON,
} from './GetPromoBestsellerInfoDTO';
import type { GetPromoConstraintsDTO } from './GetPromoConstraintsDTO';
import {
    GetPromoConstraintsDTOFromJSON,
    GetPromoConstraintsDTOFromJSONTyped,
    GetPromoConstraintsDTOToJSON,
} from './GetPromoConstraintsDTO';
import type { ChannelType } from './ChannelType';
import {
    ChannelTypeFromJSON,
    ChannelTypeFromJSONTyped,
    ChannelTypeToJSON,
} from './ChannelType';

/**
 * Информация об акции.
 * @export
 * @interface GetPromoDTO
 */
export interface GetPromoDTO {
    /**
     * Идентификатор акции.
     * @type {string}
     * @memberof GetPromoDTO
     */
    id: string;
    /**
     * Название акции.
     * @type {string}
     * @memberof GetPromoDTO
     */
    name: string;
    /**
     * 
     * @type {PromoPeriodDTO}
     * @memberof GetPromoDTO
     */
    period: PromoPeriodDTO;
    /**
     * Участвует или участвовал ли продавец в этой акции.
     * 
     * Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.
     * 
     * Для прошедших акций всегда возвращается со значением `true`.
     * 
     * Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
     * 
     * @type {boolean}
     * @memberof GetPromoDTO
     */
    participating: boolean;
    /**
     * 
     * @type {GetPromoAssortmentInfoDTO}
     * @memberof GetPromoDTO
     */
    assortmentInfo: GetPromoAssortmentInfoDTO;
    /**
     * 
     * @type {GetPromoMechanicsInfoDTO}
     * @memberof GetPromoDTO
     */
    mechanicsInfo: GetPromoMechanicsInfoDTO;
    /**
     * 
     * @type {GetPromoBestsellerInfoDTO}
     * @memberof GetPromoDTO
     */
    bestsellerInfo: GetPromoBestsellerInfoDTO;
    /**
     * Список каналов продвижения товаров.
     * @type {Array<ChannelType>}
     * @memberof GetPromoDTO
     */
    channels?: Array<ChannelType> | null;
    /**
     * 
     * @type {GetPromoConstraintsDTO}
     * @memberof GetPromoDTO
     */
    constraints?: GetPromoConstraintsDTO;
}

/**
 * Check if a given object implements the GetPromoDTO interface.
 */
export function instanceOfGetPromoDTO(value: object): value is GetPromoDTO {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('period' in value) || value['period'] === undefined) return false;
    if (!('participating' in value) || value['participating'] === undefined) return false;
    if (!('assortmentInfo' in value) || value['assortmentInfo'] === undefined) return false;
    if (!('mechanicsInfo' in value) || value['mechanicsInfo'] === undefined) return false;
    if (!('bestsellerInfo' in value) || value['bestsellerInfo'] === undefined) return false;
    return true;
}

export function GetPromoDTOFromJSON(json: any): GetPromoDTO {
    return GetPromoDTOFromJSONTyped(json, false);
}

export function GetPromoDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPromoDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'name': json['name'],
        'period': PromoPeriodDTOFromJSON(json['period']),
        'participating': json['participating'],
        'assortmentInfo': GetPromoAssortmentInfoDTOFromJSON(json['assortmentInfo']),
        'mechanicsInfo': GetPromoMechanicsInfoDTOFromJSON(json['mechanicsInfo']),
        'bestsellerInfo': GetPromoBestsellerInfoDTOFromJSON(json['bestsellerInfo']),
        'channels': json['channels'] == null ? undefined : ((json['channels'] as Array<any>).map(ChannelTypeFromJSON)),
        'constraints': json['constraints'] == null ? undefined : GetPromoConstraintsDTOFromJSON(json['constraints']),
    };
}

export function GetPromoDTOToJSON(value?: GetPromoDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'name': value['name'],
        'period': PromoPeriodDTOToJSON(value['period']),
        'participating': value['participating'],
        'assortmentInfo': GetPromoAssortmentInfoDTOToJSON(value['assortmentInfo']),
        'mechanicsInfo': GetPromoMechanicsInfoDTOToJSON(value['mechanicsInfo']),
        'bestsellerInfo': GetPromoBestsellerInfoDTOToJSON(value['bestsellerInfo']),
        'channels': value['channels'] == null ? undefined : ((value['channels'] as Array<any>).map(ChannelTypeToJSON)),
        'constraints': GetPromoConstraintsDTOToJSON(value['constraints']),
    };
}
