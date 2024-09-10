/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Комментарий к отзыву или другому комментарию.
 */
export interface UpdateGoodsFeedbackCommentDTO { 
    /**
     * Идентификатор комментария к отзыву. 
     */
    id?: number;
    /**
     * Идентификатор комментария к отзыву. 
     */
    parentId?: number;
    /**
     * Текст комментария.
     */
    text: string;
}

