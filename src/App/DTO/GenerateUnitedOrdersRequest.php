<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GenerateUnitedOrdersRequest
{
    /**
     * Идентификатор бизнеса.
     * @DTA\Data(field="businessId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_from;

    /**
     * Конец периода, включительно. Максимальный период — 1 год.
     * @DTA\Data(field="dateTo")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_to;

    /**
     * Список магазинов, которые нужны в отчете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection82::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection82::class})
     * @var \App\DTO\Collection82|null
     */
    public $campaign_ids;

    /**
     * Идентификатор акции, товары из которой нужны в отчете.
     * @DTA\Data(field="promoId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promo_id;

}
