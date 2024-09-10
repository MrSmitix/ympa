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

import { exists, mapValues } from '../runtime';
import {
    ModelDTO,
    ModelDTOFromJSON,
    ModelDTOToJSON,
} from './';

/**
 * Список моделей товаров.
 * @export
 * @interface ModelsDTO
 */
export interface ModelsDTO  {
    /**
     * Список моделей товаров.
     * @type {Array<ModelDTO>}
     * @memberof ModelsDTO
     */
    models: Array<ModelDTO>;
}

export function ModelsDTOFromJSON(json: any): ModelsDTO {
    return {
        'models': (json['models'] as Array<any>).map(ModelDTOFromJSON),
    };
}

export function ModelsDTOToJSON(value?: ModelsDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'models': (value.models as Array<any>).map(ModelDTOToJSON),
    };
}


