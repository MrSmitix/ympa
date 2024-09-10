<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о платежном получении.
 */
class OrdersStatsPaymentOrderDTO
{
    /**
     * Номер платежного поручения.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.
     * @DTA\Data(field="date", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date = null;

}
