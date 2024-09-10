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
 * Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
 */
export type WarehouseStockType = 'FIT' | 'FREEZE' | 'AVAILABLE' | 'QUARANTINE' | 'UTILIZATION' | 'DEFECT' | 'EXPIRED';

export const WarehouseStockType = {
    Fit: 'FIT' as WarehouseStockType,
    Freeze: 'FREEZE' as WarehouseStockType,
    Available: 'AVAILABLE' as WarehouseStockType,
    Quarantine: 'QUARANTINE' as WarehouseStockType,
    Utilization: 'UTILIZATION' as WarehouseStockType,
    Defect: 'DEFECT' as WarehouseStockType,
    Expired: 'EXPIRED' as WarehouseStockType
};

