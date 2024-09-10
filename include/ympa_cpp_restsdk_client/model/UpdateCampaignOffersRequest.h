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
 * UpdateCampaignOffersRequest.h
 *
 * Запрос на обновление предложений товаров магазина.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateCampaignOffersRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateCampaignOffersRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/UpdateCampaignOfferDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdateCampaignOfferDTO;


/// <summary>
/// Запрос на обновление предложений товаров магазина.
/// </summary>
class  UpdateCampaignOffersRequest
    : public ModelBase
{
public:
    UpdateCampaignOffersRequest();
    virtual ~UpdateCampaignOffersRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateCampaignOffersRequest members

    /// <summary>
    /// Параметры размещения товаров в заданном магазине.
    /// </summary>
    std::vector<std::shared_ptr<UpdateCampaignOfferDTO>>& getOffers();
    bool offersIsSet() const;
    void unsetOffers();

    void setOffers(const std::vector<std::shared_ptr<UpdateCampaignOfferDTO>>& value);


protected:
    std::vector<std::shared_ptr<UpdateCampaignOfferDTO>> m_Offers;
    bool m_OffersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateCampaignOffersRequest_H_ */
