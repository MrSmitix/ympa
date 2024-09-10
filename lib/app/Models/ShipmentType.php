<?php
/**
 * ShipmentType
 */
namespace app\Models;

/**
 * ShipmentType
 * @description Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета.
 */
class ShipmentType
{
    /**
     * Possible values of this enum
     */
    const IMPORT = 'IMPORT';

    const WITHDRAW = 'WITHDRAW';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::IMPORT,
            self::WITHDRAW
        ];
    }
}
