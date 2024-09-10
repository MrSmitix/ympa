<?php
/**
 * GetPricesByOfferIdsRequest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the GetPricesByOfferIdsRequest model.
 *
 * Запрос списка цен.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetPricesByOfferIdsRequest 
{
        /**
     * Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}   
     *
     * @var string[]|null
     * @SerializedName("offerIds")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    #[Assert\Count(max: 2000)]
    #[Assert\Count(min: 1)]
    protected ?array $offerIds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offerIds = array_key_exists('offerIds', $data) ? $data['offerIds'] : $this->offerIds;
        }
    }

    /**
     * Gets offerIds.
     *
     * @return string[]|null
     */
    public function getOfferIds(): ?array
    {
        return $this->offerIds;
    }

    /**
    * Sets offerIds.
    *
    * @param string[]|null $offerIds  Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}   
    *
    * @return $this
    */
    public function setOfferIds(?array $offerIds = null): self
    {
        $this->offerIds = $offerIds;

        return $this;
    }



}


