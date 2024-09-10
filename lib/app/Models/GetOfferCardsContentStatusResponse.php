<?php
/**
 * GetOfferCardsContentStatusResponse
 */
namespace app\Models;

/**
 * GetOfferCardsContentStatusResponse
 * @description Ответ со списком состояний товаров и пагинацией.
 */
class GetOfferCardsContentStatusResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferCardsContentStatusDTO $result */
    public $result;

}
