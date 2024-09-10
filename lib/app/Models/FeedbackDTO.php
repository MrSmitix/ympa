<?php
/**
 * FeedbackDTO
 */
namespace app\Models;

/**
 * FeedbackDTO
 * @description Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
class FeedbackDTO {

    /** @var int $id Идентификатор отзыва.*/
    public $id = 0;

    /** @var \DateTime $createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.*/
    public $createdAt;

    /** @var string $text Комментарий автора отзыва.*/
    public $text = "";

    /** @var string $state */
    public $state = "";

    /** @var \app\Models\FeedbackAuthorDTO $author */
    public $author;

    /** @var string $pro Достоинства магазина, описанные в отзыве.*/
    public $pro = "";

    /** @var string $contra Недостатки магазина, описанные в отзыве.*/
    public $contra = "";

    /** @var \app\Models\FeedbackCommentDTO[] $comments Переписка автора отзыва с магазином.*/
    public $comments = [];

    /** @var \app\Models\FeedbackShopDTO $shop */
    public $shop;

    /** @var bool $resolved Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.*/
    public $resolved = false;

    /** @var bool $verified {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.*/
    public $verified = false;

    /** @var bool $recommend Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.*/
    public $recommend = false;

    /** @var \app\Models\FeedbackGradesDTO $grades */
    public $grades;

    /** @var \app\Models\FeedbackOrderDTO $order */
    public $order;

}
