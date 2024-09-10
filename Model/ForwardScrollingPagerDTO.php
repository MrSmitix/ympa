<?php
/**
 * ForwardScrollingPagerDTO
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
 * Class representing the ForwardScrollingPagerDTO model.
 *
 * Ссылка на следующую страницу.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ForwardScrollingPagerDTO 
{
        /**
     * Идентификатор следующей страницы результатов.
     *
     * @var string|null
     * @SerializedName("nextPageToken")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $nextPageToken = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->nextPageToken = array_key_exists('nextPageToken', $data) ? $data['nextPageToken'] : $this->nextPageToken;
        }
    }

    /**
     * Gets nextPageToken.
     *
     * @return string|null
     */
    public function getNextPageToken(): ?string
    {
        return $this->nextPageToken;
    }

    /**
    * Sets nextPageToken.
    *
    * @param string|null $nextPageToken  Идентификатор следующей страницы результатов.
    *
    * @return $this
    */
    public function setNextPageToken(?string $nextPageToken = null): self
    {
        $this->nextPageToken = $nextPageToken;

        return $this;
    }



}


