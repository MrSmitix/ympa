<?php
/**
 * CalculateTariffsRequest
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
 * Class representing the CalculateTariffsRequest model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class CalculateTariffsRequest  implements \JsonSerializable
{
        /**
     * @var CalculateTariffsParametersDTO
     * @SerializedName("parameters")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("\OpenAPIServer\Model\CalculateTariffsParametersDTO")
     * @Type("\OpenAPIServer\Model\CalculateTariffsParametersDTO")
     */
    public CalculateTariffsParametersDTO $parameters;

    /**
     * Товары, для которых нужно рассчитать стоимость услуг.
     *
     * @var CalculateTariffsOfferDTO[]
     * @SerializedName("offers")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\CalculateTariffsOfferDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\CalculateTariffsOfferDTO>")
     * @Assert\Count(
     *   max = 200
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $offers;

    /**
     * Constructor
     *
     * @param CalculateTariffsParametersDTO $parameters
     * @param CalculateTariffsOfferDTO[] $offers
     */
    public function __construct(CalculateTariffsParametersDTO $parameters, array $offers)
    {
        $this->parameters = $parameters;
        $this->offers = $offers;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['parameters']) ? CalculateTariffsParametersDTO::fromArray($data['parameters']) : null, 
            isset($data['offers']) ? array_map(fn($item) => CalculateTariffsOfferDTO::fromArray($item), $data['offers']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'parameters' => $this->parameters, 
            'offers' => $this->offers, 
        ];
    }
}


