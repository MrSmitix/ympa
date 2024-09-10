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
 * GetModelsRequest.h
 *
 * Запрос информации о моделях.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetModelsRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetModelsRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Запрос информации о моделях.
/// </summary>
class  GetModelsRequest
    : public ModelBase
{
public:
    GetModelsRequest();
    virtual ~GetModelsRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetModelsRequest members

    /// <summary>
    /// Список моделей.
    /// </summary>
    std::vector<int64_t>& getModels();
    bool modelsIsSet() const;
    void unsetModels();

    void setModels(std::vector<int64_t> value);


protected:
    std::vector<int64_t> m_Models;
    bool m_ModelsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetModelsRequest_H_ */
