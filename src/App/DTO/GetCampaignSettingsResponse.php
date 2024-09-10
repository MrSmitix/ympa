<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос настроек магазина.
 */
class GetCampaignSettingsResponse
{
    /**
     * @DTA\Data(field="settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsDTO::class})
     * @var \App\DTO\CampaignSettingsDTO|null
     */
    public $settings;

}
