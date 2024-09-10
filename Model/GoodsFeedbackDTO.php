<?php
/**
 * GoodsFeedbackDTO
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
 * Class representing the GoodsFeedbackDTO model.
 *
 * Отзыв о товаре.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GoodsFeedbackDTO 
{
        /**
     * Идентификатор отзыва.
     *
     * @var int|null
     * @SerializedName("feedbackId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $feedbackId = null;

    /**
     * Дата и время создания отзыва.
     *
     * @var \DateTime|null
     * @SerializedName("createdAt")
     * @Type("DateTime")
    */
    #[Assert\NotNull]
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $createdAt = null;

    /**
     * Нужен ли ответ на отзыв.
     *
     * @var bool|null
     * @SerializedName("needReaction")
     * @Type("bool")
    */
    #[Assert\NotNull]
    #[Assert\Type("bool")]
    protected ?bool $needReaction = null;

    /**
     * @var GoodsFeedbackIdentifiersDTO|null
     * @SerializedName("identifiers")
     * @Type("OpenAPI\Server\Model\GoodsFeedbackIdentifiersDTO")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\GoodsFeedbackIdentifiersDTO")]
    protected ?GoodsFeedbackIdentifiersDTO $identifiers = null;

    /**
     * Имя автора отзыва.
     *
     * @var string|null
     * @SerializedName("author")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $author = null;

    /**
     * @var GoodsFeedbackDescriptionDTO|null
     * @SerializedName("description")
     * @Type("OpenAPI\Server\Model\GoodsFeedbackDescriptionDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\GoodsFeedbackDescriptionDTO")]
    protected ?GoodsFeedbackDescriptionDTO $description = null;

    /**
     * @var GoodsFeedbackMediaDTO|null
     * @SerializedName("media")
     * @Type("OpenAPI\Server\Model\GoodsFeedbackMediaDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\GoodsFeedbackMediaDTO")]
    protected ?GoodsFeedbackMediaDTO $media = null;

    /**
     * @var GoodsFeedbackStatisticsDTO|null
     * @SerializedName("statistics")
     * @Type("OpenAPI\Server\Model\GoodsFeedbackStatisticsDTO")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\GoodsFeedbackStatisticsDTO")]
    protected ?GoodsFeedbackStatisticsDTO $statistics = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->feedbackId = array_key_exists('feedbackId', $data) ? $data['feedbackId'] : $this->feedbackId;
            $this->createdAt = array_key_exists('createdAt', $data) ? $data['createdAt'] : $this->createdAt;
            $this->needReaction = array_key_exists('needReaction', $data) ? $data['needReaction'] : $this->needReaction;
            $this->identifiers = array_key_exists('identifiers', $data) ? $data['identifiers'] : $this->identifiers;
            $this->author = array_key_exists('author', $data) ? $data['author'] : $this->author;
            $this->description = array_key_exists('description', $data) ? $data['description'] : $this->description;
            $this->media = array_key_exists('media', $data) ? $data['media'] : $this->media;
            $this->statistics = array_key_exists('statistics', $data) ? $data['statistics'] : $this->statistics;
        }
    }

    /**
     * Gets feedbackId.
     *
     * @return int|null
     */
    public function getFeedbackId(): ?int
    {
        return $this->feedbackId;
    }

    /**
    * Sets feedbackId.
    *
    * @param int|null $feedbackId  Идентификатор отзыва.
    *
    * @return $this
    */
    public function setFeedbackId(?int $feedbackId): self
    {
        $this->feedbackId = $feedbackId;

        return $this;
    }




    /**
     * Gets createdAt.
     *
     * @return \DateTime|null
     */
    public function getCreatedAt(): ?\DateTime
    {
        return $this->createdAt;
    }

    /**
    * Sets createdAt.
    *
    * @param \DateTime|null $createdAt  Дата и время создания отзыва.
    *
    * @return $this
    */
    public function setCreatedAt(?\DateTime $createdAt): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }




    /**
     * Gets needReaction.
     *
     * @return bool|null
     */
    public function isNeedReaction(): ?bool
    {
        return $this->needReaction;
    }

    /**
    * Sets needReaction.
    *
    * @param bool|null $needReaction  Нужен ли ответ на отзыв.
    *
    * @return $this
    */
    public function setNeedReaction(?bool $needReaction): self
    {
        $this->needReaction = $needReaction;

        return $this;
    }




    /**
     * Gets identifiers.
     *
     * @return GoodsFeedbackIdentifiersDTO|null
     */
    public function getIdentifiers(): ?GoodsFeedbackIdentifiersDTO
    {
        return $this->identifiers;
    }

    /**
    * Sets identifiers.
    *
    * @param GoodsFeedbackIdentifiersDTO|null $identifiers
    *
    * @return $this
    */
    public function setIdentifiers(?GoodsFeedbackIdentifiersDTO $identifiers): self
    {
        $this->identifiers = $identifiers;

        return $this;
    }




    /**
     * Gets author.
     *
     * @return string|null
     */
    public function getAuthor(): ?string
    {
        return $this->author;
    }

    /**
    * Sets author.
    *
    * @param string|null $author  Имя автора отзыва.
    *
    * @return $this
    */
    public function setAuthor(?string $author = null): self
    {
        $this->author = $author;

        return $this;
    }




    /**
     * Gets description.
     *
     * @return GoodsFeedbackDescriptionDTO|null
     */
    public function getDescription(): ?GoodsFeedbackDescriptionDTO
    {
        return $this->description;
    }

    /**
    * Sets description.
    *
    * @param GoodsFeedbackDescriptionDTO|null $description
    *
    * @return $this
    */
    public function setDescription(?GoodsFeedbackDescriptionDTO $description = null): self
    {
        $this->description = $description;

        return $this;
    }




    /**
     * Gets media.
     *
     * @return GoodsFeedbackMediaDTO|null
     */
    public function getMedia(): ?GoodsFeedbackMediaDTO
    {
        return $this->media;
    }

    /**
    * Sets media.
    *
    * @param GoodsFeedbackMediaDTO|null $media
    *
    * @return $this
    */
    public function setMedia(?GoodsFeedbackMediaDTO $media = null): self
    {
        $this->media = $media;

        return $this;
    }




    /**
     * Gets statistics.
     *
     * @return GoodsFeedbackStatisticsDTO|null
     */
    public function getStatistics(): ?GoodsFeedbackStatisticsDTO
    {
        return $this->statistics;
    }

    /**
    * Sets statistics.
    *
    * @param GoodsFeedbackStatisticsDTO|null $statistics
    *
    * @return $this
    */
    public function setStatistics(?GoodsFeedbackStatisticsDTO $statistics): self
    {
        $this->statistics = $statistics;

        return $this;
    }



}


