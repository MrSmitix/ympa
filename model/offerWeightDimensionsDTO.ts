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
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */
export interface OfferWeightDimensionsDTO { 
    /**
     * Длина упаковки в см. 
     */
    length: number;
    /**
     * Ширина упаковки в см. 
     */
    width: number;
    /**
     * Высота упаковки в см. 
     */
    height: number;
    /**
     * Вес товара в кг с учетом упаковки (брутто). 
     */
    weight: number;
}
