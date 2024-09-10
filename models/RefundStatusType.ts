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
 * Cтатус возврата денег:
 * 
 * * `STARTED_BY_USER` — создан клиентом из личного кабинета.
 * 
 * * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.
 * 
 * * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.
 * 
 * * `FAILED` — невозможно провести возврат покупателю.
 * 
 * * `WAITING_FOR_DECISION` — ожидает решения.
 * 
 * * `DECISION_MADE` — по возврату принято решение.
 * 
 * * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.
 * 
 * * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.
 * 
 * * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.
 * 
 * * `CANCELLED` — возврат отменен.
 * 
 * @export
 */
export const RefundStatusType = {
    StartedByUser: 'STARTED_BY_USER',
    RefundInProgress: 'REFUND_IN_PROGRESS',
    Refunded: 'REFUNDED',
    Failed: 'FAILED',
    WaitingForDecision: 'WAITING_FOR_DECISION',
    DecisionMade: 'DECISION_MADE',
    RefundedWithBonuses: 'REFUNDED_WITH_BONUSES',
    RefundedByShop: 'REFUNDED_BY_SHOP',
    Cancelled: 'CANCELLED',
    CompleteWithoutRefund: 'COMPLETE_WITHOUT_REFUND',
    Unknown: 'UNKNOWN'
} as const;
export type RefundStatusType = typeof RefundStatusType[keyof typeof RefundStatusType];


export function instanceOfRefundStatusType(value: any): boolean {
    for (const key in RefundStatusType) {
        if (Object.prototype.hasOwnProperty.call(RefundStatusType, key)) {
            if (RefundStatusType[key as keyof typeof RefundStatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function RefundStatusTypeFromJSON(json: any): RefundStatusType {
    return RefundStatusTypeFromJSONTyped(json, false);
}

export function RefundStatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): RefundStatusType {
    return json as RefundStatusType;
}

export function RefundStatusTypeToJSON(value?: RefundStatusType | null): any {
    return value as any;
}
