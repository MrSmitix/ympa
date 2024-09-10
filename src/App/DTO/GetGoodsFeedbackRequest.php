<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтр запроса отзывов в кабинете.
 */
class GetGoodsFeedbackRequest
{
    /**
     * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.
     * @DTA\Data(field="dateTimeFrom", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_time_from = null;

    /**
     * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.
     * @DTA\Data(field="dateTimeTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_time_to = null;

    /**
     * @DTA\Data(field="reactionStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackReactionStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackReactionStatusType::class})
     */
    public ?\App\DTO\FeedbackReactionStatusType $reaction_status = null;

    /**
     * Оценка товара.
     * @DTA\Data(field="ratingValues", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection93::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection93::class})
     */
    public ?\App\DTO\Collection93 $rating_values = null;

    /**
     * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).
     * @DTA\Data(field="modelIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection94::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection94::class})
     */
    public ?\App\DTO\Collection94 $model_ids = null;

    /**
     * Фильтр отзывов за баллы Плюса.
     * @DTA\Data(field="paid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $paid = null;

}
