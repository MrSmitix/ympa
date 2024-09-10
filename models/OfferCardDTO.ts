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
import type { OfferCardRecommendationDTO } from './OfferCardRecommendationDTO';
import {
    OfferCardRecommendationDTOFromJSON,
    OfferCardRecommendationDTOFromJSONTyped,
    OfferCardRecommendationDTOToJSON,
} from './OfferCardRecommendationDTO';
import type { OfferCardStatusType } from './OfferCardStatusType';
import {
    OfferCardStatusTypeFromJSON,
    OfferCardStatusTypeFromJSONTyped,
    OfferCardStatusTypeToJSON,
} from './OfferCardStatusType';
import type { OfferErrorDTO } from './OfferErrorDTO';
import {
    OfferErrorDTOFromJSON,
    OfferErrorDTOFromJSONTyped,
    OfferErrorDTOToJSON,
} from './OfferErrorDTO';
import type { GetMappingDTO } from './GetMappingDTO';
import {
    GetMappingDTOFromJSON,
    GetMappingDTOFromJSONTyped,
    GetMappingDTOToJSON,
} from './GetMappingDTO';
import type { ParameterValueDTO } from './ParameterValueDTO';
import {
    ParameterValueDTOFromJSON,
    ParameterValueDTOFromJSONTyped,
    ParameterValueDTOToJSON,
} from './ParameterValueDTO';

/**
 * Информация о состоянии карточки товара.
 * 
 * Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут.
 * 
 * @export
 * @interface OfferCardDTO
 */
export interface OfferCardDTO {
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
     * @memberof OfferCardDTO
     */
    offerId: string;
    /**
     * 
     * @type {GetMappingDTO}
     * @memberof OfferCardDTO
     */
    mapping?: GetMappingDTO;
    /**
     * Список характеристик с их значениями.
     * 
     * @type {Array<ParameterValueDTO>}
     * @memberof OfferCardDTO
     */
    parameterValues?: Array<ParameterValueDTO> | null;
    /**
     * 
     * @type {OfferCardStatusType}
     * @memberof OfferCardDTO
     */
    cardStatus?: OfferCardStatusType;
    /**
     * Процент заполненности карточки.
     * @type {number}
     * @memberof OfferCardDTO
     */
    contentRating?: number;
    /**
     * Список рекомендаций к заполнению карточки.
     * 
     * Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.
     * 
     * @type {Array<OfferCardRecommendationDTO>}
     * @memberof OfferCardDTO
     */
    recommendations?: Array<OfferCardRecommendationDTO> | null;
    /**
     * Ошибки в контенте, препятствующие размещению товара на витрине.
     * @type {Array<OfferErrorDTO>}
     * @memberof OfferCardDTO
     */
    errors?: Array<OfferErrorDTO> | null;
    /**
     * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
     * @type {Array<OfferErrorDTO>}
     * @memberof OfferCardDTO
     */
    warnings?: Array<OfferErrorDTO> | null;
}



/**
 * Check if a given object implements the OfferCardDTO interface.
 */
export function instanceOfOfferCardDTO(value: object): value is OfferCardDTO {
    if (!('offerId' in value) || value['offerId'] === undefined) return false;
    return true;
}

export function OfferCardDTOFromJSON(json: any): OfferCardDTO {
    return OfferCardDTOFromJSONTyped(json, false);
}

export function OfferCardDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferCardDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'offerId': json['offerId'],
        'mapping': json['mapping'] == null ? undefined : GetMappingDTOFromJSON(json['mapping']),
        'parameterValues': json['parameterValues'] == null ? undefined : ((json['parameterValues'] as Array<any>).map(ParameterValueDTOFromJSON)),
        'cardStatus': json['cardStatus'] == null ? undefined : OfferCardStatusTypeFromJSON(json['cardStatus']),
        'contentRating': json['contentRating'] == null ? undefined : json['contentRating'],
        'recommendations': json['recommendations'] == null ? undefined : ((json['recommendations'] as Array<any>).map(OfferCardRecommendationDTOFromJSON)),
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(OfferErrorDTOFromJSON)),
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(OfferErrorDTOFromJSON)),
    };
}

export function OfferCardDTOToJSON(value?: OfferCardDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offerId': value['offerId'],
        'mapping': GetMappingDTOToJSON(value['mapping']),
        'parameterValues': value['parameterValues'] == null ? undefined : ((value['parameterValues'] as Array<any>).map(ParameterValueDTOToJSON)),
        'cardStatus': OfferCardStatusTypeToJSON(value['cardStatus']),
        'contentRating': value['contentRating'],
        'recommendations': value['recommendations'] == null ? undefined : ((value['recommendations'] as Array<any>).map(OfferCardRecommendationDTOToJSON)),
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(OfferErrorDTOToJSON)),
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(OfferErrorDTOToJSON)),
    };
}

