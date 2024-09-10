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
 * Модель для пагинации.
 */
export interface FlippingPagerDTO { 
    /**
     * Сколько всего найдено элементов.
     */
    total?: number;
    /**
     * Начальный номер найденного элемента на странице.
     */
    from?: number;
    /**
     * Конечный номер найденного элемента на странице.
     */
    to?: number;
    /**
     * Текущая страница.
     */
    currentPage?: number;
    /**
     * Общее количество страниц.
     */
    pagesCount?: number;
    /**
     * Размер страницы.
     */
    pageSize?: number;
}

