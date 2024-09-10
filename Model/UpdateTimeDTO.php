<?php
/**
 * UpdateTimeDTO
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
 * Class representing the UpdateTimeDTO model.
 *
 * Время последнего обновления.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class UpdateTimeDTO  implements \JsonSerializable
{
        /**
     * Время последнего обновления.
     *
     * @var \DateTime
     * @SerializedName("updatedAt")
     * @Assert\NotNull()
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public \DateTime $updatedAt;

    /**
     * Constructor
     *
     * @param \DateTime $updatedAt
     */
    public function __construct(\DateTime $updatedAt)
    {
        $this->updatedAt = $updatedAt;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['updatedAt']) ? new \DateTime($data['updatedAt']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'updatedAt' => $this->updatedAt?->format('c'), 
        ];
    }
}


