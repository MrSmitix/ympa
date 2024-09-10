<?php
/**
 * ReturnInstanceStockType
 */
namespace app\Models;

/**
 * ReturnInstanceStockType
 * @description Тип остатка на складе.
 */
class ReturnInstanceStockType
{
    /**
     * Possible values of this enum
     */
    const FIT = 'FIT';

    const DEFECT = 'DEFECT';

    const ANOMALY = 'ANOMALY';

    const SURPLUS = 'SURPLUS';

    const EXPIRED = 'EXPIRED';

    const MISGRADING = 'MISGRADING';

    const UNDEFINED = 'UNDEFINED';

    const INCORRECT_IMEI = 'INCORRECT_IMEI';

    const INCORRECT_SERIAL_NUMBER = 'INCORRECT_SERIAL_NUMBER';

    const INCORRECT_CIS = 'INCORRECT_CIS';

    const PART_MISSING = 'PART_MISSING';

    const NON_COMPLIENT = 'NON_COMPLIENT';

    const NOT_ACCEPTABLE = 'NOT_ACCEPTABLE';

    const SERVICE = 'SERVICE';

    const MARKDOWN = 'MARKDOWN';

    const DEMO = 'DEMO';

    const REPAIR = 'REPAIR';

    const FIRMWARE = 'FIRMWARE';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::FIT,
            self::DEFECT,
            self::ANOMALY,
            self::SURPLUS,
            self::EXPIRED,
            self::MISGRADING,
            self::UNDEFINED,
            self::INCORRECT_IMEI,
            self::INCORRECT_SERIAL_NUMBER,
            self::INCORRECT_CIS,
            self::PART_MISSING,
            self::NON_COMPLIENT,
            self::NOT_ACCEPTABLE,
            self::SERVICE,
            self::MARKDOWN,
            self::DEMO,
            self::REPAIR,
            self::FIRMWARE,
            self::UNKNOWN
        ];
    }
}
