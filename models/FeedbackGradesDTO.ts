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

import type {
    FeedbackFactorDTO,
} from './';

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 * @export
 * @interface FeedbackGradesDTO
 */
export interface FeedbackGradesDTO {
    /**
     * Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
     * @type {number}
     * @memberof FeedbackGradesDTO
     */
    average?: number;
    /**
     * Количество пользователей, считающих отзыв полезным.
     * @type {number}
     * @memberof FeedbackGradesDTO
     */
    agreeCount?: number;
    /**
     * Количество пользователей, считающих отзыв бесполезным.
     * @type {number}
     * @memberof FeedbackGradesDTO
     */
    rejectCount?: number;
    /**
     * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
     * @type {Array<FeedbackFactorDTO>}
     * @memberof FeedbackGradesDTO
     */
    factors: Array<FeedbackFactorDTO>;
}
