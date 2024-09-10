<?php
/**
 * OfferRecommendationsResultDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
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


namespace OpenAPIServer\Model;

/**
 * Class representing the OfferRecommendationsResultDTO model.
 *
 * Список товаров с рекомендациями.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OfferRecommendationsResultDTO  implements \JsonSerializable
{
        /**
     * @var ScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Assert\Type("\OpenAPIServer\Model\ScrollingPagerDTO")
     * @Type("\OpenAPIServer\Model\ScrollingPagerDTO")
     */
    public ?ScrollingPagerDTO $paging;

    /**
     * Страница списка товаров.
     *
     * @var OfferRecommendationDTO[]
     * @SerializedName("offerRecommendations")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\OfferRecommendationDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\OfferRecommendationDTO>")
     */
    public array $offerRecommendations;

    /**
     * Constructor
     *
     * @param ScrollingPagerDTO|null $paging
     * @param OfferRecommendationDTO[] $offerRecommendations
     */
    public function __construct(?ScrollingPagerDTO $paging, array $offerRecommendations)
    {
        $this->paging = $paging;
        $this->offerRecommendations = $offerRecommendations;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['paging']) ? ScrollingPagerDTO::fromArray($data['paging']) : null, 
            isset($data['offerRecommendations']) ? array_map(fn($item) => OfferRecommendationDTO::fromArray($item), $data['offerRecommendations']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'paging' => $this->paging, 
            'offerRecommendations' => $this->offerRecommendations, 
        ];
    }
}


