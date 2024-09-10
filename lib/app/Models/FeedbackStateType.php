<?php
/**
 * FeedbackStateType
 */
namespace app\Models;

/**
 * FeedbackStateType
 * @description Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален.
 */
class FeedbackStateType
{
    /**
     * Possible values of this enum
     */
    const LAST = 'LAST';

    const PREVIOUS = 'PREVIOUS';

    const DELETED = 'DELETED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::LAST,
            self::PREVIOUS,
            self::DELETED
        ];
    }
}
