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
 * ApiServerErrorResponse.h
 *
 * Внутренняя ошибка сервера.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ApiServerErrorResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ApiServerErrorResponse_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ApiErrorDTO.h"
#include "ympa_cpp_restsdk_client/model/ApiResponseStatusType.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ApiErrorDTO;


/// <summary>
/// Внутренняя ошибка сервера.
/// </summary>
class  ApiServerErrorResponse
    : public ModelBase
{
public:
    ApiServerErrorResponse();
    virtual ~ApiServerErrorResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ApiServerErrorResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const std::shared_ptr<ApiResponseStatusType>& value);

    /// <summary>
    /// Список ошибок.
    /// </summary>
    std::vector<std::shared_ptr<ApiErrorDTO>>& getErrors();
    bool errorsIsSet() const;
    void unsetErrors();

    void setErrors(const std::vector<std::shared_ptr<ApiErrorDTO>>& value);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status;
    bool m_StatusIsSet;
    std::vector<std::shared_ptr<ApiErrorDTO>> m_Errors;
    bool m_ErrorsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ApiServerErrorResponse_H_ */
