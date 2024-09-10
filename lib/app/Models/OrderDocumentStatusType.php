<?php
/**
 * OrderDocumentStatusType
 */
namespace app\Models;

/**
 * OrderDocumentStatusType
 * @description Статус документа:  * `READY` — готов. * `NOT_READY` — не готов.
 */
class OrderDocumentStatusType
{
    /**
     * Possible values of this enum
     */
    const READY = 'READY';

    const NOT_READY = 'NOT_READY';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::READY,
            self::NOT_READY
        ];
    }
}
