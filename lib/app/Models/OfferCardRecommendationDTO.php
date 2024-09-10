<?php
/**
 * OfferCardRecommendationDTO
 */
namespace app\Models;

/**
 * OfferCardRecommendationDTO
 * @description Рекомендация по заполнению карточки товара.
 */
class OfferCardRecommendationDTO {

    /** @var string $type */
    public $type = "";

    /** @var int $percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.*/
    public $percent = 0;

}
