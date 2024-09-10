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
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var int|null
     */
    public $current;

    /**
     * На сколько всего частей разделен товар.
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":2, "inclusive":true})
     * @var int|null
     */
    public $total;

}
