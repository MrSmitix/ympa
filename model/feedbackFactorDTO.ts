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
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 */
export interface FeedbackFactorDTO { 
    /**
     * Идентификатор параметра.
     */
    id?: number;
    /**
     * Название параметра. Например, `Скорость обработки заказа`.
     */
    title?: string;
    /**
     * Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
     */
    description?: string;
    /**
     * Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
     */
    value?: number;
}

