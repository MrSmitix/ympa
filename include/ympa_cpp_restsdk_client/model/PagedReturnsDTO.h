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
 * PagedReturnsDTO.h
 *
 * Возвраты.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PagedReturnsDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PagedReturnsDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ReturnDTO.h"
#include "ympa_cpp_restsdk_client/model/ForwardScrollingPagerDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ForwardScrollingPagerDTO;
class ReturnDTO;


/// <summary>
/// Возвраты.
/// </summary>
class  PagedReturnsDTO
    : public ModelBase
{
public:
    PagedReturnsDTO();
    virtual ~PagedReturnsDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PagedReturnsDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ForwardScrollingPagerDTO> getPaging() const;
    bool pagingIsSet() const;
    void unsetPaging();

    void setPaging(const std::shared_ptr<ForwardScrollingPagerDTO>& value);

    /// <summary>
    /// Список возвратов.
    /// </summary>
    std::vector<std::shared_ptr<ReturnDTO>>& getReturns();
    bool returnsIsSet() const;
    void unsetReturns();

    void setReturns(const std::vector<std::shared_ptr<ReturnDTO>>& value);


protected:
    std::shared_ptr<ForwardScrollingPagerDTO> m_Paging;
    bool m_PagingIsSet;
    std::vector<std::shared_ptr<ReturnDTO>> m_Returns;
    bool m_ReturnsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PagedReturnsDTO_H_ */
