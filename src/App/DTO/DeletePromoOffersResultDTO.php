<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;.
 */
class DeletePromoOffersResultDTO
{
    /**
     * Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.
     * @DTA\Data(field="rejectedOffers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $rejected_offers = null;

}
