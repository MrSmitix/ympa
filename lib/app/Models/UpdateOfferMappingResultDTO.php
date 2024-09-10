<?php
/**
 * UpdateOfferMappingResultDTO
 */
namespace app\Models;

/**
 * UpdateOfferMappingResultDTO
 * @description Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */
class UpdateOfferMappingResultDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\OfferMappingErrorDTO[]|null $errors Ошибки — информация в каталоге не обновится.*/
    public $errors = null;

    /** @var \app\Models\OfferMappingErrorDTO[]|null $warnings Предупреждения — информация в каталоге обновится.*/
    public $warnings = null;

}
