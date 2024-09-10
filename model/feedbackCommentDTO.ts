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
import { FeedbackCommentAuthorDTO } from './feedbackCommentAuthorDTO';


/**
 * Комментарий к отзыву на магазин.
 */
export interface FeedbackCommentDTO { 
    /**
     * Идентификатор ответа.
     */
    id?: number;
    /**
     * Идентификатор родительского ответа.
     */
    parentId?: number;
    /**
     * Текст ответа.
     */
    body?: string;
    /**
     * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     */
    createdAt?: string;
    /**
     * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
     */
    updatedAt?: string;
    author?: FeedbackCommentAuthorDTO;
    /**
     * Дочерние ответы.
     */
    children?: Array<FeedbackCommentDTO> | null;
}
