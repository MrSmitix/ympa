<?php
/**
 * PageFormatType
 */
namespace app\Models;

/**
 * PageFormatType
 * @description Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей.
 */
class PageFormatType
{
    /**
     * Possible values of this enum
     */
    const A7 = 'A7';

    const A4 = 'A4';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::A7,
            self::A4
        ];
    }
}
