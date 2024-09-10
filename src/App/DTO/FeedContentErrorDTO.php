<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;.
 */
class FeedContentErrorDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedContentErrorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedContentErrorType::class})
     * @var \App\DTO\FeedContentErrorType|null
     */
    public $type;

}
