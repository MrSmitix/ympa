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
 * OfferMappingSuggestionsListDTO.h
 *
 * Список рекомендованных карточек товара.
 */

#ifndef OfferMappingSuggestionsListDTO_H_
#define OfferMappingSuggestionsListDTO_H_


#include <vector>
#include "EnrichedMappingsOfferDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Список рекомендованных карточек товара.
/// </summary>
class  OfferMappingSuggestionsListDTO
{
public:
    OfferMappingSuggestionsListDTO();
    virtual ~OfferMappingSuggestionsListDTO() = default;


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

    bool operator==(const OfferMappingSuggestionsListDTO& rhs) const;
    bool operator!=(const OfferMappingSuggestionsListDTO& rhs) const;

    /////////////////////////////////////////////
    /// OfferMappingSuggestionsListDTO members

    /// <summary>
    /// Список товаров.
    /// </summary>
    std::vector<org::openapitools::server::model::EnrichedMappingsOfferDTO> getOffers() const;
    void setOffers(std::vector<org::openapitools::server::model::EnrichedMappingsOfferDTO> const& value);

    friend  void to_json(nlohmann::json& j, const OfferMappingSuggestionsListDTO& o);
    friend  void from_json(const nlohmann::json& j, OfferMappingSuggestionsListDTO& o);
protected:
    std::vector<org::openapitools::server::model::EnrichedMappingsOfferDTO> m_Offers;

    
};

} // namespace org::openapitools::server::model

#endif /* OfferMappingSuggestionsListDTO_H_ */
