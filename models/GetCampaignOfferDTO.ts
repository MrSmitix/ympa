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
import type { GetPriceWithVatDTO } from './GetPriceWithVatDTO';
import {
    GetPriceWithVatDTOFromJSON,
    GetPriceWithVatDTOFromJSONTyped,
    GetPriceWithVatDTOToJSON,
} from './GetPriceWithVatDTO';
import type { OfferErrorDTO } from './OfferErrorDTO';
import {
    OfferErrorDTOFromJSON,
    OfferErrorDTOFromJSONTyped,
    OfferErrorDTOToJSON,
} from './OfferErrorDTO';
import type { QuantumDTO } from './QuantumDTO';
import {
    QuantumDTOFromJSON,
    QuantumDTOFromJSONTyped,
    QuantumDTOToJSON,
} from './QuantumDTO';
import type { GetPriceWithDiscountDTO } from './GetPriceWithDiscountDTO';
import {
    GetPriceWithDiscountDTOFromJSON,
    GetPriceWithDiscountDTOFromJSONTyped,
    GetPriceWithDiscountDTOToJSON,
} from './GetPriceWithDiscountDTO';
import type { OfferCampaignStatusType } from './OfferCampaignStatusType';
import {
    OfferCampaignStatusTypeFromJSON,
    OfferCampaignStatusTypeFromJSONTyped,
    OfferCampaignStatusTypeToJSON,
} from './OfferCampaignStatusType';

/**
 * Параметры размещения товара в магазине.
 * @export
 * @interface GetCampaignOfferDTO
 */
export interface GetCampaignOfferDTO {
    /**
     * Ваш SKU — идентификатор товара в вашей системе.
     * 
     * Разрешена любая последовательность длиной до 255 знаков.
     * 
     * Правила использования SKU:
     * 
     * * У каждого товара SKU должен быть свой.
     * 
     * * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.
     * 
     * * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.
     * 
     * [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * 
     * @type {string}
     * @memberof GetCampaignOfferDTO
     */
    offerId: string;
    /**
     * 
     * @type {QuantumDTO}
     * @memberof GetCampaignOfferDTO
     */
    quantum?: QuantumDTO;
    /**
     * Есть ли товар в продаже.
     * 
     * @type {boolean}
     * @memberof GetCampaignOfferDTO
     */
    available?: boolean;
    /**
     * 
     * @type {GetPriceWithDiscountDTO}
     * @memberof GetCampaignOfferDTO
     */
    basicPrice?: GetPriceWithDiscountDTO;
    /**
     * 
     * @type {GetPriceWithVatDTO}
     * @memberof GetCampaignOfferDTO
     */
    campaignPrice?: GetPriceWithVatDTO;
    /**
     * 
     * @type {OfferCampaignStatusType}
     * @memberof GetCampaignOfferDTO
     */
    status?: OfferCampaignStatusType;
    /**
     * Ошибки, препятствующие размещению товара на витрине.
     * 
     * @type {Array<OfferErrorDTO>}
     * @memberof GetCampaignOfferDTO
     */
    errors?: Array<OfferErrorDTO> | null;
    /**
     * Предупреждения, не препятствующие размещению товара на витрине.
     * 
     * @type {Array<OfferErrorDTO>}
     * @memberof GetCampaignOfferDTO
     */
    warnings?: Array<OfferErrorDTO> | null;
}



/**
 * Check if a given object implements the GetCampaignOfferDTO interface.
 */
export function instanceOfGetCampaignOfferDTO(value: object): value is GetCampaignOfferDTO {
    if (!('offerId' in value) || value['offerId'] === undefined) return false;
    return true;
}

export function GetCampaignOfferDTOFromJSON(json: any): GetCampaignOfferDTO {
    return GetCampaignOfferDTOFromJSONTyped(json, false);
}

export function GetCampaignOfferDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetCampaignOfferDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'offerId': json['offerId'],
        'quantum': json['quantum'] == null ? undefined : QuantumDTOFromJSON(json['quantum']),
        'available': json['available'] == null ? undefined : json['available'],
        'basicPrice': json['basicPrice'] == null ? undefined : GetPriceWithDiscountDTOFromJSON(json['basicPrice']),
        'campaignPrice': json['campaignPrice'] == null ? undefined : GetPriceWithVatDTOFromJSON(json['campaignPrice']),
        'status': json['status'] == null ? undefined : OfferCampaignStatusTypeFromJSON(json['status']),
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(OfferErrorDTOFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(OfferErrorDTOFromJSON)),
    };
}

export function GetCampaignOfferDTOToJSON(value?: GetCampaignOfferDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerId': value['offerId'],
        'quantum': QuantumDTOToJSON(value['quantum']),
        'available': value['available'],
        'basicPrice': GetPriceWithDiscountDTOToJSON(value['basicPrice']),
        'campaignPrice': GetPriceWithVatDTOToJSON(value['campaignPrice']),
        'status': OfferCampaignStatusTypeToJSON(value['status']),
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(OfferErrorDTOToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(OfferErrorDTOToJSON)),
    };
}

