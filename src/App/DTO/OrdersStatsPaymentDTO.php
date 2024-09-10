<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о денежных переводах по заказу.
 */
class OrdersStatsPaymentDTO
{
    /**
     * Идентификатор денежного перевода.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentType::class})
     */
    public ?\App\DTO\OrdersStatsPaymentType $type = null;

    /**
     * @DTA\Data(field="source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentSourceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentSourceType::class})
     */
    public ?\App\DTO\OrdersStatsPaymentSourceType $source = null;

    /**
     * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.
     * @DTA\Data(field="total", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $total = null;

    /**
     * @DTA\Data(field="paymentOrder", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentOrderDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentOrderDTO::class})
     */
    public ?\App\DTO\OrdersStatsPaymentOrderDTO $payment_order = null;

}
