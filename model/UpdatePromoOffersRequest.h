/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * UpdatePromoOffersRequest.h
 *
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */

#ifndef UpdatePromoOffersRequest_H_
#define UpdatePromoOffersRequest_H_


#include "UpdatePromoOfferDTO.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
/// </summary>
class  UpdatePromoOffersRequest
{
public:
    UpdatePromoOffersRequest();
    virtual ~UpdatePromoOffersRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const UpdatePromoOffersRequest& rhs) const;
    bool operator!=(const UpdatePromoOffersRequest& rhs) const;

    /////////////////////////////////////////////
    /// UpdatePromoOffersRequest members

    /// <summary>
    /// Идентификатор акции.
    /// </summary>
    std::string getPromoId() const;
    void setPromoId(std::string const& value);
    /// <summary>
    /// Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
    /// </summary>
    std::vector<org::openapitools::server::model::UpdatePromoOfferDTO> getOffers() const;
    void setOffers(std::vector<org::openapitools::server::model::UpdatePromoOfferDTO> const& value);

    friend  void to_json(nlohmann::json& j, const UpdatePromoOffersRequest& o);
    friend  void from_json(const nlohmann::json& j, UpdatePromoOffersRequest& o);
protected:
    std::string m_PromoId;

    std::vector<org::openapitools::server::model::UpdatePromoOfferDTO> m_Offers;

    
};

} // namespace org::openapitools::server::model

#endif /* UpdatePromoOffersRequest_H_ */
