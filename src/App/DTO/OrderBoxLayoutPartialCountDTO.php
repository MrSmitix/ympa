<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о части товара в коробке.
 */
class OrderBoxLayoutPartialCountDTO
{
    /**
     * Номер части, начиная с 1.
     * @DTA\Data(field="current")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $current = null;

    /**
     * На сколько всего частей разделен товар.
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":2})
     */
    public ?int $total = null;

}
