<?php
/**
 * ShipmentPalletLabelPageFormatType
 */
namespace app\Models;

/**
 * ShipmentPalletLabelPageFormatType
 * @description Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8.
 */
class ShipmentPalletLabelPageFormatType
{
    /**
     * Possible values of this enum
     */
    const A4 = 'A4';

    const A8 = 'A8';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::A4,
            self::A8
        ];
    }
}
