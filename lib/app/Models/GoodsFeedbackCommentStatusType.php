<?php
/**
 * GoodsFeedbackCommentStatusType
 */
namespace app\Models;

/**
 * GoodsFeedbackCommentStatusType
 * @description Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален.
 */
class GoodsFeedbackCommentStatusType
{
    /**
     * Possible values of this enum
     */
    const PUBLISHED = 'PUBLISHED';

    const UNMODERATED = 'UNMODERATED';

    const BANNED = 'BANNED';

    const DELETED = 'DELETED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PUBLISHED,
            self::UNMODERATED,
            self::BANNED,
            self::DELETED
        ];
    }
}
