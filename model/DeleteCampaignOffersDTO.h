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
 * DeleteCampaignOffersDTO.h
 *
 * Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
 */

#ifndef DeleteCampaignOffersDTO_H_
#define DeleteCampaignOffersDTO_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
/// </summary>
class  DeleteCampaignOffersDTO
{
public:
    DeleteCampaignOffersDTO();
    virtual ~DeleteCampaignOffersDTO() = default;


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

    bool operator==(const DeleteCampaignOffersDTO& rhs) const;
    bool operator!=(const DeleteCampaignOffersDTO& rhs) const;

    /////////////////////////////////////////////
    /// DeleteCampaignOffersDTO members

    /// <summary>
    /// Список SKU.
    /// </summary>
    std::vector<std::string> getNotDeletedOfferIds() const;
    void setNotDeletedOfferIds(std::vector<std::string> const& value);
    bool notDeletedOfferIdsIsSet() const;
    void unsetNotDeletedOfferIds();

    friend  void to_json(nlohmann::json& j, const DeleteCampaignOffersDTO& o);
    friend  void from_json(const nlohmann::json& j, DeleteCampaignOffersDTO& o);
protected:
    std::vector<std::string> m_NotDeletedOfferIds;
    bool m_NotDeletedOfferIdsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* DeleteCampaignOffersDTO_H_ */
