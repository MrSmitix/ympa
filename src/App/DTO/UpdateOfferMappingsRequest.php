<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdateOfferMappingsRequest
{
    /**
     * Перечень товаров, которые нужно добавить или обновить.
     * @DTA\Data(field="offerMappings")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection43::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection43::class})
     */
    public ?\App\DTO\Collection43 $offer_mappings = null;

    /**
     * Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.
     * @DTA\Data(field="onlyPartnerMediaContent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $only_partner_media_content = null;

}
