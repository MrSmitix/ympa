<?php
/**
 * FeedIndexLogsFeedDTO
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
 * Class representing the FeedIndexLogsFeedDTO model.
 *
 * Информация о прайс-листе.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedIndexLogsFeedDTO  implements \JsonSerializable
{
        /**
     * Идентификатор прайс-листа.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $id;

    /**
     * Constructor
     *
     * @param int|null $id
     */
    public function __construct(?int $id)
    {
        $this->id = $id;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['id'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'id' => $this->id, 
        ];
    }
}


