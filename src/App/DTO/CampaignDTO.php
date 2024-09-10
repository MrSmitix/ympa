<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о магазине.
 */
class CampaignDTO
{
    /**
     * URL магазина.
     * @DTA\Data(field="domain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $domain = null;

    /**
     * Идентификатор кампании.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Идентификатор плательщика в Яндекс Балансе.
     * @DTA\Data(field="clientId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $client_id = null;

    /**
     * @DTA\Data(field="business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessDTO::class})
     */
    public ?\App\DTO\BusinessDTO $business = null;

    /**
     * @DTA\Data(field="placementType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementType::class})
     */
    public ?\App\DTO\PlacementType $placement_type = null;

}
