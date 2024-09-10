<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о доставке в своем регионе магазина.
 */
class CampaignSettingsDeliveryDTO
{
    /**
     * @DTA\Data(field="schedule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsScheduleDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsScheduleDTO::class})
     * @var \App\DTO\CampaignSettingsScheduleDTO|null
     */
    public $schedule;

}
