<?php
/**
 * OutletStatusType
 */
namespace app\Models;

/**
 * OutletStatusType
 * @description Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке.
 */
class OutletStatusType
{
    /**
     * Possible values of this enum
     */
    const AT_MODERATION = 'AT_MODERATION';

    const FAILED = 'FAILED';

    const MODERATED = 'MODERATED';

    const NONMODERATED = 'NONMODERATED';

    const UNKNOWN = 'UNKNOWN';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::AT_MODERATION,
            self::FAILED,
            self::MODERATED,
            self::NONMODERATED,
            self::UNKNOWN
        ];
    }
}
