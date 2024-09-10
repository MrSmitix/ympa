<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на обновление товаров.
 */
class UpdateOfferMappingEntryRequest
{
    /**
     * Информация о товарах в каталоге.
     * @DTA\Data(field="offerMappingEntries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     * @var \App\DTO\Collection54|null
     */
    public $offer_mapping_entries;

}
