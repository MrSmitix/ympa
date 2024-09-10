<?php
/**
 * OrderDeliveryDispatchType
 */
namespace app\Models;

/**
 * OrderDeliveryDispatchType
 * @description Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип.
 */
class OrderDeliveryDispatchType
{
    /**
     * Possible values of this enum
     */
    const UNKNOWN = 'UNKNOWN';

    const BUYER = 'BUYER';

    const MARKET_PARTNER_OUTLET = 'MARKET_PARTNER_OUTLET';

    const MARKET_BRANDED_OUTLET = 'MARKET_BRANDED_OUTLET';

    const SHOP_OUTLET = 'SHOP_OUTLET';

    const DROPOFF = 'DROPOFF';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::UNKNOWN,
            self::BUYER,
            self::MARKET_PARTNER_OUTLET,
            self::MARKET_BRANDED_OUTLET,
            self::SHOP_OUTLET,
            self::DROPOFF
        ];
    }
}
