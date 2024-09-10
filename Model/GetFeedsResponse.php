<?php
/**
 * GetFeedsResponse
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
 * Class representing the GetFeedsResponse model.
 *
 * Ответ на запрос списка прайс-листов.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetFeedsResponse 
{
        /**
     * Список прайс-листов.
     *
     * @var FeedDTO[]|null
     * @SerializedName("feeds")
     * @Type("array<OpenAPI\Server\Model\FeedDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\FeedDTO"),
    ])]
    protected ?array $feeds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->feeds = array_key_exists('feeds', $data) ? $data['feeds'] : $this->feeds;
        }
    }

    /**
     * Gets feeds.
     *
     * @return FeedDTO[]|null
     */
    public function getFeeds(): ?array
    {
        return $this->feeds;
    }

    /**
    * Sets feeds.
    *
    * @param FeedDTO[]|null $feeds  Список прайс-листов.
    *
    * @return $this
    */
    public function setFeeds(?array $feeds): self
    {
        $this->feeds = $feeds;

        return $this;
    }



}


