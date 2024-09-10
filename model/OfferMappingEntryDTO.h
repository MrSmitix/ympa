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
 * OfferMappingEntryDTO.h
 *
 * Список товаров. 
 */

#ifndef OfferMappingEntryDTO_H_
#define OfferMappingEntryDTO_H_


#include "MappingsOfferDTO.h"
#include "OfferMappingDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Список товаров. 
/// </summary>
class  OfferMappingEntryDTO
{
public:
    OfferMappingEntryDTO();
    virtual ~OfferMappingEntryDTO() = default;


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

    bool operator==(const OfferMappingEntryDTO& rhs) const;
    bool operator!=(const OfferMappingEntryDTO& rhs) const;

    /////////////////////////////////////////////
    /// OfferMappingEntryDTO members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferMappingDTO getMapping() const;
    void setMapping(org::openapitools::server::model::OfferMappingDTO const& value);
    bool mappingIsSet() const;
    void unsetMapping();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferMappingDTO getAwaitingModerationMapping() const;
    void setAwaitingModerationMapping(org::openapitools::server::model::OfferMappingDTO const& value);
    bool awaitingModerationMappingIsSet() const;
    void unsetAwaitingModerationMapping();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferMappingDTO getRejectedMapping() const;
    void setRejectedMapping(org::openapitools::server::model::OfferMappingDTO const& value);
    bool rejectedMappingIsSet() const;
    void unsetRejectedMapping();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::MappingsOfferDTO getOffer() const;
    void setOffer(org::openapitools::server::model::MappingsOfferDTO const& value);
    bool offerIsSet() const;
    void unsetOffer();

    friend  void to_json(nlohmann::json& j, const OfferMappingEntryDTO& o);
    friend  void from_json(const nlohmann::json& j, OfferMappingEntryDTO& o);
protected:
    org::openapitools::server::model::OfferMappingDTO m_Mapping;
    bool m_MappingIsSet;
    org::openapitools::server::model::OfferMappingDTO m_AwaitingModerationMapping;
    bool m_AwaitingModerationMappingIsSet;
    org::openapitools::server::model::OfferMappingDTO m_RejectedMapping;
    bool m_RejectedMappingIsSet;
    org::openapitools::server::model::MappingsOfferDTO m_Offer;
    bool m_OfferIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OfferMappingEntryDTO_H_ */
