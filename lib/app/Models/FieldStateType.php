<?php
/**
 * FieldStateType
 */
namespace app\Models;

/**
 * FieldStateType
 * @description Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено.
 */
class FieldStateType
{
    /**
     * Possible values of this enum
     */
    const SPECIFIED = 'SPECIFIED';

    const _EMPTY = 'EMPTY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::SPECIFIED,
            self::_EMPTY
        ];
    }
}
