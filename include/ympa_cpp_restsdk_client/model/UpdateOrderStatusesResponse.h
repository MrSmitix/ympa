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
 * UpdateOrderStatusesResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOrderStatusesResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOrderStatusesResponse_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ApiResponseStatusType.h"
#include "ympa_cpp_restsdk_client/model/UpdateOrderStatusesDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdateOrderStatusesDTO;


/// <summary>
/// 
/// </summary>
class  UpdateOrderStatusesResponse
    : public ModelBase
{
public:
    UpdateOrderStatusesResponse();
    virtual ~UpdateOrderStatusesResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateOrderStatusesResponse members

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
    std::shared_ptr<UpdateOrderStatusesDTO> getResult() const;
    bool resultIsSet() const;
    void unsetResult();

    void setResult(const std::shared_ptr<UpdateOrderStatusesDTO>& value);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status;
    bool m_StatusIsSet;
    std::shared_ptr<UpdateOrderStatusesDTO> m_Result;
    bool m_ResultIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOrderStatusesResponse_H_ */
