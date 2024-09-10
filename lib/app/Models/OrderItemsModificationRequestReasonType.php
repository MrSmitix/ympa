<?php
/**
 * OrderItemsModificationRequestReasonType
 */
namespace app\Models;

/**
 * OrderItemsModificationRequestReasonType
 * @description Причина обновления состава заказа.
 */
class OrderItemsModificationRequestReasonType
{
    /**
     * Possible values of this enum
     */
    const PARTNER_REQUESTED_REMOVE = 'PARTNER_REQUESTED_REMOVE';

    const USER_REQUESTED_REMOVE = 'USER_REQUESTED_REMOVE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PARTNER_REQUESTED_REMOVE,
            self::USER_REQUESTED_REMOVE
        ];
    }
}
