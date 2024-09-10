<?php
/**
 * WarehouseStockType
 */
namespace app\Models;

/**
 * WarehouseStockType
 * @description Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован.
 */
class WarehouseStockType
{
    /**
     * Possible values of this enum
     */
    const FIT = 'FIT';

    const FREEZE = 'FREEZE';

    const AVAILABLE = 'AVAILABLE';

    const QUARANTINE = 'QUARANTINE';

    const UTILIZATION = 'UTILIZATION';

    const DEFECT = 'DEFECT';

    const EXPIRED = 'EXPIRED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FIT,
            self::FREEZE,
            self::AVAILABLE,
            self::QUARANTINE,
            self::UTILIZATION,
            self::DEFECT,
            self::EXPIRED
        ];
    }
}
