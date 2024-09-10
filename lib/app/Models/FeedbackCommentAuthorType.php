<?php
/**
 * FeedbackCommentAuthorType
 */
namespace app\Models;

/**
 * FeedbackCommentAuthorType
 * @description Тип автора:  * `USER` — пользователь. * `SHOP` — магазин.
 */
class FeedbackCommentAuthorType
{
    /**
     * Possible values of this enum
     */
    const USER = 'USER';

    const SHOP = 'SHOP';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::USER,
            self::SHOP
        ];
    }
}
