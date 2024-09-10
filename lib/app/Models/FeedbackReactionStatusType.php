<?php
/**
 * FeedbackReactionStatusType
 */
namespace app\Models;

/**
 * FeedbackReactionStatusType
 * @description Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить.
 */
class FeedbackReactionStatusType
{
    /**
     * Possible values of this enum
     */
    const ALL = 'ALL';

    const NEED_REACTION = 'NEED_REACTION';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ALL,
            self::NEED_REACTION
        ];
    }
}
