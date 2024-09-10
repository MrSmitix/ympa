<?php
/**
 * ShipmentActionType
 */
namespace app\Models;

/**
 * ShipmentActionType
 * @description Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет.
 */
class ShipmentActionType
{
    /**
     * Possible values of this enum
     */
    const CONFIRM = 'CONFIRM';

    const DOWNLOAD_ACT = 'DOWNLOAD_ACT';

    const DOWNLOAD_INBOUND_ACT = 'DOWNLOAD_INBOUND_ACT';

    const DOWNLOAD_DISCREPANCY_ACT = 'DOWNLOAD_DISCREPANCY_ACT';

    const CHANGE_PALLETS_COUNT = 'CHANGE_PALLETS_COUNT';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::CONFIRM,
            self::DOWNLOAD_ACT,
            self::DOWNLOAD_INBOUND_ACT,
            self::DOWNLOAD_DISCREPANCY_ACT,
            self::CHANGE_PALLETS_COUNT
        ];
    }
}
