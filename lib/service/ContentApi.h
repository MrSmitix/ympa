#ifndef TINY_CPP_CLIENT_ContentApi_H_
#define TINY_CPP_CLIENT_ContentApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiLockedErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GetCategoryContentParametersResponse.h"
#include "GetOfferCardsContentStatusRequest.h"
#include "GetOfferCardsContentStatusResponse.h"
#include "UpdateOfferContentRequest.h"
#include "UpdateOfferContentResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ContentApi : public Service {
public:
    ContentApi() = default;

    virtual ~ContentApi() = default;

    /**
    * Списки характеристик товаров по категориям.
    *
    * Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    * \param categoryId Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  *Required*
    */
    Response<
                GetCategoryContentParametersResponse
        >
    getCategoryContentParameters(
            
            long categoryId
            
    );
    /**
    * Получение информации о заполненности карточек магазина.
    *
    * Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    * \param getOfferCardsContentStatusRequest 
    */
    Response<
                GetOfferCardsContentStatusResponse
        >
    getOfferCardsContentStatus(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest
            
    );
    /**
    * Редактирование категорийных характеристик товара.
    *
    * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param updateOfferContentRequest  *Required*
    */
    Response<
                UpdateOfferContentResponse
        >
    updateOfferContent(
            
            long businessId
            , 
            
            UpdateOfferContentRequest updateOfferContentRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ContentApi_H_ */