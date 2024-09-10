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
 * GetOfferMappingEntriesResponse.h
 *
 * Ответ на запрос списка товаров в каталоге.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferMappingEntriesResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferMappingEntriesResponse_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OfferMappingEntriesDTO.h"
#include "ympa_cpp_restsdk_client/model/ApiResponseStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class OfferMappingEntriesDTO;


/// <summary>
/// Ответ на запрос списка товаров в каталоге.
/// </summary>
class  GetOfferMappingEntriesResponse
    : public ModelBase
{
public:
    GetOfferMappingEntriesResponse();
    virtual ~GetOfferMappingEntriesResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetOfferMappingEntriesResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const std::shared_ptr<ApiResponseStatusType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferMappingEntriesDTO> getResult() const;
    bool resultIsSet() const;
    void unsetResult();

    void setResult(const std::shared_ptr<OfferMappingEntriesDTO>& value);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status;
    bool m_StatusIsSet;
    std::shared_ptr<OfferMappingEntriesDTO> m_Result;
    bool m_ResultIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetOfferMappingEntriesResponse_H_ */
