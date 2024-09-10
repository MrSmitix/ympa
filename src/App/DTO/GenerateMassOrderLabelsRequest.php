<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации файла.
 */
class GenerateMassOrderLabelsRequest
{
    /**
     * Идентификатор кабинета.
     * @DTA\Data(field="businessId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * Список идентификаторов заказов.
     * @DTA\Data(field="orderIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection87::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection87::class})
     * @var \App\DTO\Collection87|null
     */
    public $order_ids;

}
