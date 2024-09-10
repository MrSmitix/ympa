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
 * Фильтр по заполненности или незаполненности поля:
 * 
 * * `SPECIFIED` — вывести товары, у которых поле заполнено.
 * * `EMPTY` — вывести товары, у которых поле не заполнено.
 * 
 * @export
 */
export const FieldStateType = {
    Specified: 'SPECIFIED',
    Empty: 'EMPTY'
} as const;
export type FieldStateType = typeof FieldStateType[keyof typeof FieldStateType];


export function instanceOfFieldStateType(value: any): boolean {
    for (const key in FieldStateType) {
        if (Object.prototype.hasOwnProperty.call(FieldStateType, key)) {
            if (FieldStateType[key as keyof typeof FieldStateType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function FieldStateTypeFromJSON(json: any): FieldStateType {
    return FieldStateTypeFromJSONTyped(json, false);
}

export function FieldStateTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): FieldStateType {
    return json as FieldStateType;
}

export function FieldStateTypeToJSON(value?: FieldStateType | null): any {
    return value as any;
}
