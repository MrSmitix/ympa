<?php
/**
 * DeliveryServiceInfoDTO
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
 * Class representing the DeliveryServiceInfoDTO model.
 *
 * Информация о службе доставки.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class DeliveryServiceInfoDTO 
{
        /**
     * Идентификатор службы доставки.
     *
     * @var int|null
     * @SerializedName("id")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $id = null;

    /**
     * Наименование службы доставки.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
        }
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId(): ?int
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param int|null $id  Идентификатор службы доставки.
    *
    * @return $this
    */
    public function setId(?int $id): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  Наименование службы доставки.
    *
    * @return $this
    */
    public function setName(?string $name): self
    {
        $this->name = $name;

        return $this;
    }



}


