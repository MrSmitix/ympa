<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на обновление предложений товаров магазина.
 */
class UpdateCampaignOffersRequest
{
    /**
     * Параметры размещения товаров в заданном магазине.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection101::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection101::class})
     */
    public ?\App\DTO\Collection101 $offers = null;

}
