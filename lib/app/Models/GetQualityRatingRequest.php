<?php
/**
 * GetQualityRatingRequest
 */
namespace app\Models;

/**
 * GetQualityRatingRequest
 * @description Запрос информации по индексу качества.
 */
class GetQualityRatingRequest {

    /** @var \DateTime $dateFrom Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты.*/
    public $dateTo;

    /** @var int[] $campaignIds Список идентификаторов магазинов.*/
    public $campaignIds = [];

}
