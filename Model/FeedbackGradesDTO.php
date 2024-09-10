<?php
/**
 * FeedbackGradesDTO
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
 * Class representing the FeedbackGradesDTO model.
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedbackGradesDTO  implements \JsonSerializable
{
        /**
     * Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).
     *
     * @var float|null
     * @SerializedName("average")
     * @Assert\Type("float")
     * @Type("float")
     */
    public ?float $average;

    /**
     * Количество пользователей, считающих отзыв полезным.
     *
     * @var int|null
     * @SerializedName("agreeCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $agreeCount;

    /**
     * Количество пользователей, считающих отзыв бесполезным.
     *
     * @var int|null
     * @SerializedName("rejectCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $rejectCount;

    /**
     * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор.
     *
     * @var FeedbackFactorDTO[]
     * @SerializedName("factors")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\FeedbackFactorDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\FeedbackFactorDTO>")
     */
    public array $factors;

    /**
     * Constructor
     *
     * @param float|null $average
     * @param int|null $agreeCount
     * @param int|null $rejectCount
     * @param FeedbackFactorDTO[] $factors
     */
    public function __construct(?float $average, ?int $agreeCount, ?int $rejectCount, array $factors)
    {
        $this->average = $average;
        $this->agreeCount = $agreeCount;
        $this->rejectCount = $rejectCount;
        $this->factors = $factors;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['average'] ?? null, 
            $data['agreeCount'] ?? null, 
            $data['rejectCount'] ?? null, 
            isset($data['factors']) ? array_map(fn($item) => FeedbackFactorDTO::fromArray($item), $data['factors']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'average' => $this->average, 
            'agreeCount' => $this->agreeCount, 
            'rejectCount' => $this->rejectCount, 
            'factors' => $this->factors, 
        ];
    }
}


