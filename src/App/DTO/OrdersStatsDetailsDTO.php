<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об удалении товара из заказа.
 */
class OrdersStatsDetailsDTO
{
    /**
     * @DTA\Data(field="itemStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsItemStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsItemStatusType::class})
     * @var \App\DTO\OrdersStatsItemStatusType|null
     */
    public $item_status;

    /**
     * Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
     * @DTA\Data(field="itemCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $item_count;

    /**
     * Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.
     * @DTA\Data(field="updateDate", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $update_date;

    /**
     * @DTA\Data(field="stockType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsStockType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsStockType::class})
     * @var \App\DTO\OrdersStatsStockType|null
     */
    public $stock_type;

}
