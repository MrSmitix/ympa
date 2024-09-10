package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedbackAuthorDTO;
import org.openapitools.model.FeedbackCommentDTO;
import org.openapitools.model.FeedbackGradesDTO;
import org.openapitools.model.FeedbackOrderDTO;
import org.openapitools.model.FeedbackShopDTO;
import org.openapitools.model.FeedbackStateType;

@Canonical
class FeedbackDTO {
    /* Идентификатор отзыва. */
    Long id
    /* Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    Date createdAt
    /* Комментарий автора отзыва. */
    String text
    
    FeedbackStateType state
    
    FeedbackAuthorDTO author
    /* Достоинства магазина, описанные в отзыве. */
    String pro
    /* Недостатки магазина, описанные в отзыве. */
    String contra
    /* Переписка автора отзыва с магазином. */
    List<FeedbackCommentDTO> comments = new ArrayList<>()
    
    FeedbackShopDTO shop
    /* Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  */
    Boolean resolved
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет.  */
    Boolean verified
    /* Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет.  */
    Boolean recommend
    
    FeedbackGradesDTO grades
    
    FeedbackOrderDTO order
}
