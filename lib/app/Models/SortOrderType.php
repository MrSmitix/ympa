<?php
/**
 * SortOrderType
 */
namespace app\Models;

/**
 * SortOrderType
 * @description Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию.
 */
class SortOrderType
{
    /**
     * Possible values of this enum
     */
    const ASC = 'ASC';

    const DESC = 'DESC';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ASC,
            self::DESC
        ];
    }
}
