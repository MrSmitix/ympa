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
 * Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
 */
export type CategoryErrorType = 'UNKNOWN_CATEGORY' | 'CATEGORY_IS_NOT_LEAF';

export const CategoryErrorType = {
    UnknownCategory: 'UNKNOWN_CATEGORY' as CategoryErrorType,
    CategoryIsNotLeaf: 'CATEGORY_IS_NOT_LEAF' as CategoryErrorType
}
