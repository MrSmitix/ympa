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
     * @var string|null
     */
    public $id;

    /**
     * Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentType::class})
     * @var \App\DTO\OrdersStatsPaymentType|null
     */
    public $type;

    /**
     * @DTA\Data(field="source", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentSourceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentSourceType::class})
     * @var \App\DTO\OrdersStatsPaymentSourceType|null
     */
    public $source;

    /**
     * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.
     * @DTA\Data(field="total", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $total;

    /**
     * @DTA\Data(field="paymentOrder", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPaymentOrderDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPaymentOrderDTO::class})
     * @var \App\DTO\OrdersStatsPaymentOrderDTO|null
     */
    public $payment_order;

}
