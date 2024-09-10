<?php
/**
 * CategoryErrorType
 */
namespace app\Models;

/**
 * CategoryErrorType
 * @description Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий.
 */
class CategoryErrorType
{
    /**
     * Possible values of this enum
     */
    const UNKNOWN_CATEGORY = 'UNKNOWN_CATEGORY';

    const CATEGORY_IS_NOT_LEAF = 'CATEGORY_IS_NOT_LEAF';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::UNKNOWN_CATEGORY,
            self::CATEGORY_IS_NOT_LEAF
        ];
    }
}
