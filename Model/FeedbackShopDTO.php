<?php
/**
 * FeedbackShopDTO
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
 * Class representing the FeedbackShopDTO model.
 *
 * Информация о магазине.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedbackShopDTO  implements \JsonSerializable
{
        /**
     * Название магазина.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $name;

    /**
     * Constructor
     *
     * @param string|null $name
     */
    public function __construct(?string $name)
    {
        $this->name = $name;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['name'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'name' => $this->name, 
        ];
    }
}


