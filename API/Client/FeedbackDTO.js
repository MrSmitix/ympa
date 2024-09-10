goog.provide('API.Client.FeedbackDTO');

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 * @record
 */
API.Client.FeedbackDTO = function() {}

/**
 * Идентификатор отзыва.
 * @type {!number}
 * @export
 */
API.Client.FeedbackDTO.prototype.id;

/**
 * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedbackDTO.prototype.createdAt;

/**
 * Комментарий автора отзыва.
 * @type {!string}
 * @export
 */
API.Client.FeedbackDTO.prototype.text;

/**
 * @type {!API.Client.FeedbackStateType}
 * @export
 */
API.Client.FeedbackDTO.prototype.state;

/**
 * @type {!API.Client.FeedbackAuthorDTO}
 * @export
 */
API.Client.FeedbackDTO.prototype.author;

/**
 * Достоинства магазина, описанные в отзыве.
 * @type {!string}
 * @export
 */
API.Client.FeedbackDTO.prototype.pro;

/**
 * Недостатки магазина, описанные в отзыве.
 * @type {!string}
 * @export
 */
API.Client.FeedbackDTO.prototype.contra;

/**
 * Переписка автора отзыва с магазином.
 * @type {!Array<!API.Client.FeedbackCommentDTO>}
 * @export
 */
API.Client.FeedbackDTO.prototype.comments;

/**
 * @type {!API.Client.FeedbackShopDTO}
 * @export
 */
API.Client.FeedbackDTO.prototype.shop;

/**
 * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
 * @type {!boolean}
 * @export
 */
API.Client.FeedbackDTO.prototype.resolved;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
 * @type {!boolean}
 * @export
 */
API.Client.FeedbackDTO.prototype.verified;

/**
 * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
 * @type {!boolean}
 * @export
 */
API.Client.FeedbackDTO.prototype.recommend;

/**
 * @type {!API.Client.FeedbackGradesDTO}
 * @export
 */
API.Client.FeedbackDTO.prototype.grades;

/**
 * @type {!API.Client.FeedbackOrderDTO}
 * @export
 */
API.Client.FeedbackDTO.prototype.order;

