<?php
/**
 * ApiResponseStatusType
 */
namespace app\Models;

/**
 * ApiResponseStatusType
 * @description Тип ответа.
 */
class ApiResponseStatusType
{
    /**
     * Possible values of this enum
     */
    const OK = 'OK';

    const ERROR = 'ERROR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OK,
            self::ERROR
        ];
    }
}
