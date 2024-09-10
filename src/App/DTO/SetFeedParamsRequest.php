<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на обновление изменение параметров прайс-листа.
 */
class SetFeedParamsRequest
{
    /**
     * Параметры прайс-листа.  Обязательный параметр.
     * @DTA\Data(field="parameters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection106::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection106::class})
     */
    public ?\App\DTO\Collection106 $parameters = null;

}
