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
 * DeletePromoOffersResultDTO.h
 *
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_DeletePromoOffersResultDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_DeletePromoOffersResultDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/RejectedPromoOfferDeleteDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class RejectedPromoOfferDeleteDTO;


/// <summary>
/// Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
/// </summary>
class  DeletePromoOffersResultDTO
    : public ModelBase
{
public:
    DeletePromoOffersResultDTO();
    virtual ~DeletePromoOffersResultDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// DeletePromoOffersResultDTO members

    /// <summary>
    /// Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
    /// </summary>
    std::vector<std::shared_ptr<RejectedPromoOfferDeleteDTO>>& getRejectedOffers();
    bool rejectedOffersIsSet() const;
    void unsetRejectedOffers();

    void setRejectedOffers(const std::vector<std::shared_ptr<RejectedPromoOfferDeleteDTO>>& value);


protected:
    std::vector<std::shared_ptr<RejectedPromoOfferDeleteDTO>> m_RejectedOffers;
    bool m_RejectedOffersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_DeletePromoOffersResultDTO_H_ */
