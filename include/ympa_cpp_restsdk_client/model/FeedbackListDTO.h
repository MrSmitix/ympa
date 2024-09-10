/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FeedbackListDTO.h
 *
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackListDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackListDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ScrollingPagerDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedbackDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ScrollingPagerDTO;
class FeedbackDTO;


/// <summary>
/// Отзывы пользователей Яндекс Маркета об указанном магазине.
/// </summary>
class  FeedbackListDTO
    : public ModelBase
{
public:
    FeedbackListDTO();
    virtual ~FeedbackListDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FeedbackListDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ScrollingPagerDTO> getPaging() const;
    bool pagingIsSet() const;
    void unsetPaging();

    void setPaging(const std::shared_ptr<ScrollingPagerDTO>& value);

    /// <summary>
    /// Список отзывов.  Содержит не более 20 отзывов. 
    /// </summary>
    std::vector<std::shared_ptr<FeedbackDTO>>& getFeedbackList();
    bool feedbackListIsSet() const;
    void unsetFeedbackList();

    void setFeedbackList(const std::vector<std::shared_ptr<FeedbackDTO>>& value);


protected:
    std::shared_ptr<ScrollingPagerDTO> m_Paging;
    bool m_PagingIsSet;
    std::vector<std::shared_ptr<FeedbackDTO>> m_FeedbackList;
    bool m_FeedbackListIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackListDTO_H_ */
