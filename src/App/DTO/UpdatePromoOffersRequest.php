<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;.
 */
class UpdatePromoOffersRequest
{
    /**
     * Идентификатор акции.
     * @DTA\Data(field="promoId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promo_id;

    /**
     * Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection122::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection122::class})
     * @var \App\DTO\Collection122|null
     */
    public $offers;

}
