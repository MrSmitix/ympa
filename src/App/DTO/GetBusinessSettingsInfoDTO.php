<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о кабинете и его настройках.
 */
class GetBusinessSettingsInfoDTO
{
    /**
     * @DTA\Data(field="info", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessDTO::class})
     */
    public ?\App\DTO\BusinessDTO $info = null;

    /**
     * @DTA\Data(field="settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessSettingsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessSettingsDTO::class})
     */
    public ?\App\DTO\BusinessSettingsDTO $settings = null;

}
