<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о коробке.
 */
class EnrichedOrderBoxLayoutDTO
{
    /**
     * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

    /**
     * Идентификатор коробки.
     * @DTA\Data(field="boxId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $box_id = null;

}
