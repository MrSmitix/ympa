<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */
class UpdatePromoOffersResultDTO
{
    /**
     * Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.
     * @DTA\Data(field="rejectedOffers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $rejected_offers = null;

    /**
     * Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.
     * @DTA\Data(field="warningOffers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warning_offers = null;

}
