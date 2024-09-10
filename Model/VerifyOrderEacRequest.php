<?php
/**
 * VerifyOrderEacRequest
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
 * Class representing the VerifyOrderEacRequest model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class VerifyOrderEacRequest  implements \JsonSerializable
{
        /**
     * Код для подтверждения ЭАПП.
     *
     * @var string|null
     * @SerializedName("code")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $code;

    /**
     * Constructor
     *
     * @param string|null $code
     */
    public function __construct(?string $code)
    {
        $this->code = $code;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['code'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'code' => $this->code, 
        ];
    }
}


