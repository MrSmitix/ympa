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
 * Статус реакции на отзыв:
 * 
 * * `ALL` — все отзывы.
 * 
 * * `NEED_REACTION` — отзывы, на которые нужно ответить.
 * 
 * @export
 */
export const FeedbackReactionStatusType = {
    All: 'ALL',
    NeedReaction: 'NEED_REACTION'
} as const;
export type FeedbackReactionStatusType = typeof FeedbackReactionStatusType[keyof typeof FeedbackReactionStatusType];


export function instanceOfFeedbackReactionStatusType(value: any): boolean {
    for (const key in FeedbackReactionStatusType) {
        if (Object.prototype.hasOwnProperty.call(FeedbackReactionStatusType, key)) {
            if (FeedbackReactionStatusType[key as keyof typeof FeedbackReactionStatusType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function FeedbackReactionStatusTypeFromJSON(json: any): FeedbackReactionStatusType {
    return FeedbackReactionStatusTypeFromJSONTyped(json, false);
}

export function FeedbackReactionStatusTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedbackReactionStatusType {
    return json as FeedbackReactionStatusType;
}

export function FeedbackReactionStatusTypeToJSON(value?: FeedbackReactionStatusType | null): any {
    return value as any;
}

