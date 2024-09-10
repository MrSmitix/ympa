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
     * @var string|null
     */
    public $domain;

    /**
     * Идентификатор кампании.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Идентификатор плательщика в Яндекс Балансе.
     * @DTA\Data(field="clientId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $client_id;

    /**
     * @DTA\Data(field="business", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BusinessDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BusinessDTO::class})
     * @var \App\DTO\BusinessDTO|null
     */
    public $business;

    /**
     * @DTA\Data(field="placementType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PlacementType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PlacementType::class})
     * @var \App\DTO\PlacementType|null
     */
    public $placement_type;

}
