<?php
/**
 * GoodsFeedbackListDTO
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
 * Class representing the GoodsFeedbackListDTO model.
 *
 * Список отзывов о товарах.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GoodsFeedbackListDTO 
{
        /**
     * Список отзывов.
     *
     * @var GoodsFeedbackDTO[]|null
     * @SerializedName("feedbacks")
     * @Type("array<OpenAPI\Server\Model\GoodsFeedbackDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\GoodsFeedbackDTO"),
    ])]
    protected ?array $feedbacks = null;

    /**
     * @var ForwardScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")]
    protected ?ForwardScrollingPagerDTO $paging = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->feedbacks = array_key_exists('feedbacks', $data) ? $data['feedbacks'] : $this->feedbacks;
            $this->paging = array_key_exists('paging', $data) ? $data['paging'] : $this->paging;
        }
    }

    /**
     * Gets feedbacks.
     *
     * @return GoodsFeedbackDTO[]|null
     */
    public function getFeedbacks(): ?array
    {
        return $this->feedbacks;
    }

    /**
    * Sets feedbacks.
    *
    * @param GoodsFeedbackDTO[]|null $feedbacks  Список отзывов.
    *
    * @return $this
    */
    public function setFeedbacks(?array $feedbacks): self
    {
        $this->feedbacks = $feedbacks;

        return $this;
    }




    /**
     * Gets paging.
     *
     * @return ForwardScrollingPagerDTO|null
     */
    public function getPaging(): ?ForwardScrollingPagerDTO
    {
        return $this->paging;
    }

    /**
    * Sets paging.
    *
    * @param ForwardScrollingPagerDTO|null $paging
    *
    * @return $this
    */
    public function setPaging(?ForwardScrollingPagerDTO $paging = null): self
    {
        $this->paging = $paging;

        return $this;
    }



}


