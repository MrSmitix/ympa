<?php
/**
 * LicenseCheckStatusType
 */
namespace app\Models;

/**
 * LicenseCheckStatusType
 * @description Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку.
 */
class LicenseCheckStatusType
{
    /**
     * Possible values of this enum
     */
    const _NEW = 'NEW';

    const SUCCESS = 'SUCCESS';

    const FAIL = 'FAIL';

    const REVOKE = 'REVOKE';

    const DONT_WANT = 'DONT_WANT';

    const FAIL_MANUAL = 'FAIL_MANUAL';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::_NEW,
            self::SUCCESS,
            self::FAIL,
            self::REVOKE,
            self::DONT_WANT,
            self::FAIL_MANUAL
        ];
    }
}
