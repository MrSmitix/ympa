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
 * DeleteOffersFromArchiveRequest.h
 *
 * Товары, которые нужно восстановить из архива. 
 */

#ifndef DeleteOffersFromArchiveRequest_H_
#define DeleteOffersFromArchiveRequest_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Товары, которые нужно восстановить из архива. 
/// </summary>
class  DeleteOffersFromArchiveRequest
{
public:
    DeleteOffersFromArchiveRequest();
    virtual ~DeleteOffersFromArchiveRequest() = default;


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

    bool operator==(const DeleteOffersFromArchiveRequest& rhs) const;
    bool operator!=(const DeleteOffersFromArchiveRequest& rhs) const;

    /////////////////////////////////////////////
    /// DeleteOffersFromArchiveRequest members

    /// <summary>
    /// Список товаров, которые нужно восстановить из архива.
    /// </summary>
    std::vector<std::string> getOfferIds() const;
    void setOfferIds(std::vector<std::string> const& value);

    friend  void to_json(nlohmann::json& j, const DeleteOffersFromArchiveRequest& o);
    friend  void from_json(const nlohmann::json& j, DeleteOffersFromArchiveRequest& o);
protected:
    std::vector<std::string> m_OfferIds;

    
};

} // namespace org::openapitools::server::model

#endif /* DeleteOffersFromArchiveRequest_H_ */
