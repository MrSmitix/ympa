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
 * Размещение ярлыков на странице:
 * * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей).
 * * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей.
 * 
 * @export
 */
export const PageFormatType = {
    A7: 'A7',
    A4: 'A4'
} as const;
export type PageFormatType = typeof PageFormatType[keyof typeof PageFormatType];


export function instanceOfPageFormatType(value: any): boolean {
    for (const key in PageFormatType) {
        if (Object.prototype.hasOwnProperty.call(PageFormatType, key)) {
            if (PageFormatType[key as keyof typeof PageFormatType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function PageFormatTypeFromJSON(json: any): PageFormatType {
    return PageFormatTypeFromJSONTyped(json, false);
}

export function PageFormatTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): PageFormatType {
    return json as PageFormatType;
}

export function PageFormatTypeToJSON(value?: PageFormatType | null): any {
    return value as any;
}

