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
 * UpdatePromoOffersRequest.h
 *
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePromoOffersRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePromoOffersRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/UpdatePromoOfferDTO.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdatePromoOfferDTO;


/// <summary>
/// Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
/// </summary>
class  UpdatePromoOffersRequest
    : public ModelBase
{
public:
    UpdatePromoOffersRequest();
    virtual ~UpdatePromoOffersRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdatePromoOffersRequest members

    /// <summary>
    /// Идентификатор акции.
    /// </summary>
    utility::string_t getPromoId() const;
    bool promoIdIsSet() const;
    void unsetPromoId();

    void setPromoId(const utility::string_t& value);

    /// <summary>
    /// Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
    /// </summary>
    std::vector<std::shared_ptr<UpdatePromoOfferDTO>>& getOffers();
    bool offersIsSet() const;
    void unsetOffers();

    void setOffers(const std::vector<std::shared_ptr<UpdatePromoOfferDTO>>& value);


protected:
    utility::string_t m_PromoId;
    bool m_PromoIdIsSet;
    std::vector<std::shared_ptr<UpdatePromoOfferDTO>> m_Offers;
    bool m_OffersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePromoOffersRequest_H_ */
