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
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_from;

    /**
     * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.
     * @DTA\Data(field="dateTimeTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_to;

    /**
     * @DTA\Data(field="reactionStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackReactionStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackReactionStatusType::class})
     * @var \App\DTO\FeedbackReactionStatusType|null
     */
    public $reaction_status;

    /**
     * Оценка товара.
     * @DTA\Data(field="ratingValues", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection93::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection93::class})
     * @var \App\DTO\Collection93|null
     */
    public $rating_values;

    /**
     * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).
     * @DTA\Data(field="modelIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection94::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection94::class})
     * @var \App\DTO\Collection94|null
     */
    public $model_ids;

    /**
     * Фильтр отзывов за баллы Плюса.
     * @DTA\Data(field="paid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $paid;

}
