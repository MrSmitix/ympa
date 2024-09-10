<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о своем регионе магазина.
 */
class CampaignSettingsLocalRegionDTO
{
    /**
     * Идентификатор региона.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Название региона.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionType::class})
     */
    public ?\App\DTO\RegionType $type = null;

    /**
     * @DTA\Data(field="deliveryOptionsSource", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsScheduleSourceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsScheduleSourceType::class})
     */
    public ?\App\DTO\CampaignSettingsScheduleSourceType $delivery_options_source = null;

    /**
     * @DTA\Data(field="delivery", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignSettingsDeliveryDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignSettingsDeliveryDTO::class})
     */
    public ?\App\DTO\CampaignSettingsDeliveryDTO $delivery = null;

}
