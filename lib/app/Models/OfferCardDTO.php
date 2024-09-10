<?php
/**
 * OfferCardDTO
 */
namespace app\Models;

/**
 * OfferCardDTO
 * @description Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут.
 */
class OfferCardDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\GetMappingDTO $mapping */
    public $mapping;

    /** @var \app\Models\ParameterValueDTO[]|null $parameterValues Список характеристик с их значениями.*/
    public $parameterValues = null;

    /** @var string $cardStatus */
    public $cardStatus = "";

    /** @var int $contentRating Процент заполненности карточки.*/
    public $contentRating = 0;

    /** @var \app\Models\OfferCardRecommendationDTO[]|null $recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.*/
    public $recommendations = null;

    /** @var \app\Models\OfferErrorDTO[]|null $errors Ошибки в контенте, препятствующие размещению товара на витрине.*/
    public $errors = null;

    /** @var \app\Models\OfferErrorDTO[]|null $warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.*/
    public $warnings = null;

}
