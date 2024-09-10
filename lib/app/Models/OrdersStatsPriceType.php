<?php
/**
 * OrdersStatsPriceType
 */
namespace app\Models;

/**
 * OrdersStatsPriceType
 * @description Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны.
 */
class OrdersStatsPriceType
{
    /**
     * Possible values of this enum
     */
    const BUYER = 'BUYER';

    const CASHBACK = 'CASHBACK';

    const MARKETPLACE = 'MARKETPLACE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::BUYER,
            self::CASHBACK,
            self::MARKETPLACE
        ];
    }
}
