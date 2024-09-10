<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут.
 */
class OfferCardDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":255})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/"})
     * @var string|null
     */
    public $offer_id;

    /**
     * @DTA\Data(field="mapping", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetMappingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetMappingDTO::class})
     * @var \App\DTO\GetMappingDTO|null
     */
    public $mapping;

    /**
     * Список характеристик с их значениями.
     * @DTA\Data(field="parameterValues", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ParameterValueDTO[]|null
     */
    public $parameter_values;

    /**
     * @DTA\Data(field="cardStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferCardStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferCardStatusType::class})
     * @var \App\DTO\OfferCardStatusType|null
     */
    public $card_status;

    /**
     * Процент заполненности карточки.
     * @DTA\Data(field="contentRating", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $content_rating;

    /**
     * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.
     * @DTA\Data(field="recommendations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferCardRecommendationDTO[]|null
     */
    public $recommendations;

    /**
     * Ошибки в контенте, препятствующие размещению товара на витрине.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferErrorDTO[]|null
     */
    public $errors;

    /**
     * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferErrorDTO[]|null
     */
    public $warnings;

}
