<?php
/**
 * GoodsFeedbackCommentAuthorType
 */
namespace app\Models;

/**
 * GoodsFeedbackCommentAuthorType
 * @description Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет.
 */
class GoodsFeedbackCommentAuthorType
{
    /**
     * Possible values of this enum
     */
    const USER = 'USER';

    const BUSINESS = 'BUSINESS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::USER,
            self::BUSINESS
        ];
    }
}
