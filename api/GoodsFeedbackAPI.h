#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/delete_goods_feedback_comment_request.h"
#include "../model/empty_api_response.h"
#include "../model/get_goods_feedback_comments_request.h"
#include "../model/get_goods_feedback_comments_response.h"
#include "../model/get_goods_feedback_request.h"
#include "../model/get_goods_feedback_response.h"
#include "../model/skip_goods_feedback_reaction_request.h"
#include "../model/update_goods_feedback_comment_request.h"
#include "../model/update_goods_feedback_comment_response.h"


// Удаление комментария к отзыву
//
// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
GoodsFeedbackAPI_deleteGoodsFeedbackComment(apiClient_t *apiClient, long businessId, delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request);


// Получение комментариев к отзыву
//
// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_comments_response_t*
GoodsFeedbackAPI_getGoodsFeedbackComments(apiClient_t *apiClient, long businessId, get_goods_feedback_comments_request_t *get_goods_feedback_comments_request, char *page_token, int *limit);


// Получение отзывов о товарах продавца
//
// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_response_t*
GoodsFeedbackAPI_getGoodsFeedbacks(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_goods_feedback_request_t *get_goods_feedback_request);


// Отказ от ответа на отзывы
//
// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
GoodsFeedbackAPI_skipGoodsFeedbacksReaction(apiClient_t *apiClient, long businessId, skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request);


// Добавление нового или изменение созданного комментария
//
// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
update_goods_feedback_comment_response_t*
GoodsFeedbackAPI_updateGoodsFeedbackComment(apiClient_t *apiClient, long businessId, update_goods_feedback_comment_request_t *update_goods_feedback_comment_request);


