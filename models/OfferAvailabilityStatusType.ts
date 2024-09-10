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
 * Планы по поставкам:
 * 
 * * `ACTIVE` — поставки будут.
 * * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`.
 * * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`.
 * 
 * @export
 */
export const OfferAvailabilityStatusType = {
    Active: 'ACTIVE',
    Inactive: 'INACTIVE',
    Delisted: 'DELISTED'
} as const;
export type OfferAvailabilityStatusType = typeof OfferAvailabilityStatusType[keyof typeof OfferAvailabilityStatusType];


export function instanceOfOfferAvailabilityStatusType(value: any): boolean {
    for (const key in OfferAvailabilityStatusType) {
        if (Object.prototype.hasOwnProperty.call(OfferAvailabilityStatusType, key)) {
            if (OfferAvailabilityStatusType[key as keyof typeof OfferAvailabilityStatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function OfferAvailabilityStatusTypeFromJSON(json: any): OfferAvailabilityStatusType {
    return OfferAvailabilityStatusTypeFromJSONTyped(json, false);
}

export function OfferAvailabilityStatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferAvailabilityStatusType {
    return json as OfferAvailabilityStatusType;
}

export function OfferAvailabilityStatusTypeToJSON(value?: OfferAvailabilityStatusType | null): any {
    return value as any;
}
