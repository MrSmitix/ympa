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
 * Типы ошибок:
 * 
 * * `UNKNOWN_CATEGORY` — указана неизвестная категория.
 * * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий.
 * 
 * @export
 */
export const CategoryErrorType = {
    UnknownCategory: 'UNKNOWN_CATEGORY',
    CategoryIsNotLeaf: 'CATEGORY_IS_NOT_LEAF'
} as const;
export type CategoryErrorType = typeof CategoryErrorType[keyof typeof CategoryErrorType];


export function instanceOfCategoryErrorType(value: any): boolean {
    for (const key in CategoryErrorType) {
        if (Object.prototype.hasOwnProperty.call(CategoryErrorType, key)) {
            if (CategoryErrorType[key as keyof typeof CategoryErrorType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function CategoryErrorTypeFromJSON(json: any): CategoryErrorType {
    return CategoryErrorTypeFromJSONTyped(json, false);
}

export function CategoryErrorTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): CategoryErrorType {
    return json as CategoryErrorType;
}

export function CategoryErrorTypeToJSON(value?: CategoryErrorType | null): any {
    return value as any;
}
