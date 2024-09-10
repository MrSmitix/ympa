<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
class FeedbackDTO
{
    /**
     * Идентификатор отзыва.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.
     * @DTA\Data(field="createdAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * Комментарий автора отзыва.
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="state", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackStateType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackStateType::class})
     * @var \App\DTO\FeedbackStateType|null
     */
    public $state;

    /**
     * @DTA\Data(field="author", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackAuthorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackAuthorDTO::class})
     * @var \App\DTO\FeedbackAuthorDTO|null
     */
    public $author;

    /**
     * Достоинства магазина, описанные в отзыве.
     * @DTA\Data(field="pro", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pro;

    /**
     * Недостатки магазина, описанные в отзыве.
     * @DTA\Data(field="contra", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $contra;

    /**
     * Переписка автора отзыва с магазином.
     * @DTA\Data(field="comments")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\FeedbackCommentDTO[]|null
     */
    public $comments;

    /**
     * @DTA\Data(field="shop", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackShopDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackShopDTO::class})
     * @var \App\DTO\FeedbackShopDTO|null
     */
    public $shop;

    /**
     * Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.
     * @DTA\Data(field="resolved", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $resolved;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.
     * @DTA\Data(field="verified", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $verified;

    /**
     * Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.
     * @DTA\Data(field="recommend", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $recommend;

    /**
     * @DTA\Data(field="grades", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackGradesDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackGradesDTO::class})
     * @var \App\DTO\FeedbackGradesDTO|null
     */
    public $grades;

    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackOrderDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackOrderDTO::class})
     * @var \App\DTO\FeedbackOrderDTO|null
     */
    public $order;

}
