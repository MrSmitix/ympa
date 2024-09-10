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

/**
 * Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
 * @export
 * @enum {string}
 */
export enum SellingProgramType {
    Fby = 'FBY',
    Fbs = 'FBS',
    Dbs = 'DBS',
    Express = 'EXPRESS'
}

export function SellingProgramTypeFromJSON(json: any): SellingProgramType {
    return json as SellingProgramType;
}

export function SellingProgramTypeToJSON(value?: SellingProgramType): any {
    return value as any;
}

