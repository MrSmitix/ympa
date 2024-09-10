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
 * DeleteHiddenOffersRequest.h
 *
 * Запрос на возобновление показа оферов.
 */

#ifndef DeleteHiddenOffersRequest_H_
#define DeleteHiddenOffersRequest_H_


#include "HiddenOfferDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Запрос на возобновление показа оферов.
/// </summary>
class  DeleteHiddenOffersRequest
{
public:
    DeleteHiddenOffersRequest();
    virtual ~DeleteHiddenOffersRequest() = default;


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

    bool operator==(const DeleteHiddenOffersRequest& rhs) const;
    bool operator!=(const DeleteHiddenOffersRequest& rhs) const;

    /////////////////////////////////////////////
    /// DeleteHiddenOffersRequest members

    /// <summary>
    /// Список скрытых товаров. 
    /// </summary>
    std::vector<org::openapitools::server::model::HiddenOfferDTO> getHiddenOffers() const;
    void setHiddenOffers(std::vector<org::openapitools::server::model::HiddenOfferDTO> const& value);

    friend  void to_json(nlohmann::json& j, const DeleteHiddenOffersRequest& o);
    friend  void from_json(const nlohmann::json& j, DeleteHiddenOffersRequest& o);
protected:
    std::vector<org::openapitools::server::model::HiddenOfferDTO> m_HiddenOffers;

    
};

} // namespace org::openapitools::server::model

#endif /* DeleteHiddenOffersRequest_H_ */
