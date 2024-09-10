<?php
/**
 * GetGoodsFeedbackRequest
 */
namespace app\Models;

/**
 * GetGoodsFeedbackRequest
 * @description Фильтр запроса отзывов в кабинете.
 */
class GetGoodsFeedbackRequest {

    /** @var \DateTime $dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты.*/
    public $dateTimeFrom;

    /** @var \DateTime $dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.*/
    public $dateTimeTo;

    /** @var string $reactionStatus */
    public $reactionStatus = "";

    /** @var int[]|null $ratingValues Оценка товара.*/
    public $ratingValues = null;

    /** @var int[]|null $modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).*/
    public $modelIds = null;

    /** @var bool $paid Фильтр отзывов за баллы Плюса.*/
    public $paid = false;

}
