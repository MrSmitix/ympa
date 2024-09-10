<?php
/**
 * SuggestPricesResultDTO
 */
namespace app\Models;

/**
 * SuggestPricesResultDTO
 * @description Результат запроса цен для продвижения.
 */
class SuggestPricesResultDTO {

    /** @var \app\Models\PriceSuggestOfferDTO[] $offers Список товаров с ценами для продвижения.*/
    public $offers = [];

}
