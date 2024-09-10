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
import type { ParameterType } from './ParameterType';
import {
    ParameterTypeFromJSON,
    ParameterTypeFromJSONTyped,
    ParameterTypeToJSON,
} from './ParameterType';
import type { CategoryParameterUnitDTO } from './CategoryParameterUnitDTO';
import {
    CategoryParameterUnitDTOFromJSON,
    CategoryParameterUnitDTOFromJSONTyped,
    CategoryParameterUnitDTOToJSON,
} from './CategoryParameterUnitDTO';
import type { ValueRestrictionDTO } from './ValueRestrictionDTO';
import {
    ValueRestrictionDTOFromJSON,
    ValueRestrictionDTOFromJSONTyped,
    ValueRestrictionDTOToJSON,
} from './ValueRestrictionDTO';
import type { OfferCardRecommendationType } from './OfferCardRecommendationType';
import {
    OfferCardRecommendationTypeFromJSON,
    OfferCardRecommendationTypeFromJSONTyped,
    OfferCardRecommendationTypeToJSON,
} from './OfferCardRecommendationType';
import type { ParameterValueOptionDTO } from './ParameterValueOptionDTO';
import {
    ParameterValueOptionDTOFromJSON,
    ParameterValueOptionDTOFromJSONTyped,
    ParameterValueOptionDTOToJSON,
} from './ParameterValueOptionDTO';
import type { ParameterValueConstraintsDTO } from './ParameterValueConstraintsDTO';
import {
    ParameterValueConstraintsDTOFromJSON,
    ParameterValueConstraintsDTOFromJSONTyped,
    ParameterValueConstraintsDTOToJSON,
} from './ParameterValueConstraintsDTO';

/**
 * Характеристика товара.
 * @export
 * @interface CategoryParameterDTO
 */
export interface CategoryParameterDTO {
    /**
     * Идентификатор характеристики.
     * @type {number}
     * @memberof CategoryParameterDTO
     */
    id: number;
    /**
     * Название характеристики.
     * @type {string}
     * @memberof CategoryParameterDTO
     */
    name?: string;
    /**
     * 
     * @type {ParameterType}
     * @memberof CategoryParameterDTO
     */
    type: ParameterType;
    /**
     * 
     * @type {CategoryParameterUnitDTO}
     * @memberof CategoryParameterDTO
     */
    unit?: CategoryParameterUnitDTO;
    /**
     * Описание характеристики.
     * @type {string}
     * @memberof CategoryParameterDTO
     */
    description?: string;
    /**
     * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
     * @type {Array<OfferCardRecommendationType>}
     * @memberof CategoryParameterDTO
     */
    recommendationTypes?: Array<OfferCardRecommendationType> | null;
    /**
     * Обязательность характеристики.
     * @type {boolean}
     * @memberof CategoryParameterDTO
     */
    required: boolean;
    /**
     * Используется ли характеристика в фильтре.
     * @type {boolean}
     * @memberof CategoryParameterDTO
     */
    filtering: boolean;
    /**
     * Является ли характеристика особенностью варианта.
     * @type {boolean}
     * @memberof CategoryParameterDTO
     */
    distinctive: boolean;
    /**
     * Можно ли передать сразу несколько значений.
     * @type {boolean}
     * @memberof CategoryParameterDTO
     */
    multivalue: boolean;
    /**
     * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
     * @type {boolean}
     * @memberof CategoryParameterDTO
     */
    allowCustomValues: boolean;
    /**
     * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
     * @type {Array<ParameterValueOptionDTO>}
     * @memberof CategoryParameterDTO
     */
    values?: Array<ParameterValueOptionDTO> | null;
    /**
     * 
     * @type {ParameterValueConstraintsDTO}
     * @memberof CategoryParameterDTO
     */
    constraints?: ParameterValueConstraintsDTO;
    /**
     * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
     * @type {Array<ValueRestrictionDTO>}
     * @memberof CategoryParameterDTO
     */
    valueRestrictions?: Array<ValueRestrictionDTO> | null;
}



/**
 * Check if a given object implements the CategoryParameterDTO interface.
 */
export function instanceOfCategoryParameterDTO(value: object): value is CategoryParameterDTO {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('required' in value) || value['required'] === undefined) return false;
    if (!('filtering' in value) || value['filtering'] === undefined) return false;
    if (!('distinctive' in value) || value['distinctive'] === undefined) return false;
    if (!('multivalue' in value) || value['multivalue'] === undefined) return false;
    if (!('allowCustomValues' in value) || value['allowCustomValues'] === undefined) return false;
    return true;
}

export function CategoryParameterDTOFromJSON(json: any): CategoryParameterDTO {
    return CategoryParameterDTOFromJSONTyped(json, false);
}

export function CategoryParameterDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): CategoryParameterDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'name': json['name'] == null ? undefined : json['name'],
        'type': ParameterTypeFromJSON(json['type']),
        'unit': json['unit'] == null ? undefined : CategoryParameterUnitDTOFromJSON(json['unit']),
        'description': json['description'] == null ? undefined : json['description'],
        'recommendationTypes': json['recommendationTypes'] == null ? undefined : ((json['recommendationTypes'] as Array<any>).map(OfferCardRecommendationTypeFromJSON)),
        'required': json['required'],
        'filtering': json['filtering'],
        'distinctive': json['distinctive'],
        'multivalue': json['multivalue'],
        'allowCustomValues': json['allowCustomValues'],
        'values': json['values'] == null ? undefined : ((json['values'] as Array<any>).map(ParameterValueOptionDTOFromJSON)),
        'constraints': json['constraints'] == null ? undefined : ParameterValueConstraintsDTOFromJSON(json['constraints']),
        'valueRestrictions': json['valueRestrictions'] == null ? undefined : ((json['valueRestrictions'] as Array<any>).map(ValueRestrictionDTOFromJSON)),
    };
}

export function CategoryParameterDTOToJSON(value?: CategoryParameterDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'name': value['name'],
        'type': ParameterTypeToJSON(value['type']),
        'unit': CategoryParameterUnitDTOToJSON(value['unit']),
        'description': value['description'],
        'recommendationTypes': value['recommendationTypes'] == null ? undefined : ((value['recommendationTypes'] as Array<any>).map(OfferCardRecommendationTypeToJSON)),
        'required': value['required'],
        'filtering': value['filtering'],
        'distinctive': value['distinctive'],
        'multivalue': value['multivalue'],
        'allowCustomValues': value['allowCustomValues'],
        'values': value['values'] == null ? undefined : ((value['values'] as Array<any>).map(ParameterValueOptionDTOToJSON)),
        'constraints': ParameterValueConstraintsDTOToJSON(value['constraints']),
        'valueRestrictions': value['valueRestrictions'] == null ? undefined : ((value['valueRestrictions'] as Array<any>).map(ValueRestrictionDTOToJSON)),
    };
}

