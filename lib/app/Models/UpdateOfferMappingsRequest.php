<?php
/**
 * UpdateOfferMappingsRequest
 */
namespace app\Models;

/**
 * UpdateOfferMappingsRequest
 */
class UpdateOfferMappingsRequest {

    /** @var \app\Models\UpdateOfferMappingDTO[] $offerMappings Перечень товаров, которые нужно добавить или обновить.*/
    public $offerMappings = [];

    /** @var bool $onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.*/
    public $onlyPartnerMediaContent = false;

}
