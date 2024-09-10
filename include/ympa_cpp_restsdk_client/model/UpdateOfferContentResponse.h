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
 * UpdateOfferContentResponse.h
 *
 * Описывает проблемы, которые появились при сохранении товара.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferContentResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferContentResponse_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/UpdateOfferContentResultDTO.h"
#include "ympa_cpp_restsdk_client/model/ApiResponseStatusType.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdateOfferContentResultDTO;


/// <summary>
/// Описывает проблемы, которые появились при сохранении товара.
/// </summary>
class  UpdateOfferContentResponse
    : public ModelBase
{
public:
    UpdateOfferContentResponse();
    virtual ~UpdateOfferContentResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateOfferContentResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(const std::shared_ptr<ApiResponseStatusType>& value);

    /// <summary>
    /// Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
    /// </summary>
    std::vector<std::shared_ptr<UpdateOfferContentResultDTO>>& getResults();
    bool resultsIsSet() const;
    void unsetResults();

    void setResults(const std::vector<std::shared_ptr<UpdateOfferContentResultDTO>>& value);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status;
    bool m_StatusIsSet;
    std::vector<std::shared_ptr<UpdateOfferContentResultDTO>> m_Results;
    bool m_ResultsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateOfferContentResponse_H_ */
