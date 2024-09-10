<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на создание или изменение лицензий для точек продаж.
 */
class UpdateOutletLicenseRequest
{
    /**
     * Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.
     * @DTA\Data(field="licenses")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection91::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection91::class})
     * @var \App\DTO\Collection91|null
     */
    public $licenses;

}
