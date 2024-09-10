<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товарах в каталоге.
 */
class OfferMappingEntriesDTO
{
    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @var \App\DTO\ScrollingPagerDTO|null
     */
    public $paging;

    /**
     * Информация о товарах в каталоге.
     * @DTA\Data(field="offerMappingEntries")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferMappingEntryDTO[]|null
     */
    public $offer_mapping_entries;

}
