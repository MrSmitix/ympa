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
#include "../model/api_locked_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/get_category_content_parameters_response.h"
#include "../model/get_offer_cards_content_status_request.h"
#include "../model/get_offer_cards_content_status_response.h"
#include "../model/update_offer_content_request.h"
#include "../model/update_offer_content_response.h"


// Списки характеристик товаров по категориям
//
// Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
//
get_category_content_parameters_response_t*
ContentAPI_getCategoryContentParameters(apiClient_t *apiClient, long categoryId);


// Получение информации о заполненности карточек магазина
//
// Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
//
get_offer_cards_content_status_response_t*
ContentAPI_getOfferCardsContentStatus(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_cards_content_status_request_t *get_offer_cards_content_status_request);


// Редактирование категорийных характеристик товара
//
// Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
update_offer_content_response_t*
ContentAPI_updateOfferContent(apiClient_t *apiClient, long businessId, update_offer_content_request_t *update_offer_content_request);


