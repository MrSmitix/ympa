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


/**
 * Язык:
 * 
 * * `RU` — русский.
 * 
 * * `EN` — английский.
 * 
 * @export
 */
export const LanguageType = {
    Ru: 'RU',
    En: 'EN'
} as const;
export type LanguageType = typeof LanguageType[keyof typeof LanguageType];


export function instanceOfLanguageType(value: any): boolean {
    for (const key in LanguageType) {
        if (Object.prototype.hasOwnProperty.call(LanguageType, key)) {
            if (LanguageType[key as keyof typeof LanguageType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function LanguageTypeFromJSON(json: any): LanguageType {
    return LanguageTypeFromJSONTyped(json, false);
}

export function LanguageTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): LanguageType {
    return json as LanguageType;
}

export function LanguageTypeToJSON(value?: LanguageType | null): any {
    return value as any;
}

