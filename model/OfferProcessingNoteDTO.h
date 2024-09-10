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
 * OfferProcessingNoteDTO.h
 *
 * Причины, по которым товар не прошел модерацию.
 */

#ifndef OfferProcessingNoteDTO_H_
#define OfferProcessingNoteDTO_H_


#include <string>
#include "OfferProcessingNoteType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Причины, по которым товар не прошел модерацию.
/// </summary>
class  OfferProcessingNoteDTO
{
public:
    OfferProcessingNoteDTO();
    virtual ~OfferProcessingNoteDTO() = default;


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

    bool operator==(const OfferProcessingNoteDTO& rhs) const;
    bool operator!=(const OfferProcessingNoteDTO& rhs) const;

    /////////////////////////////////////////////
    /// OfferProcessingNoteDTO members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferProcessingNoteType getType() const;
    void setType(org::openapitools::server::model::OfferProcessingNoteType const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Дополнительная информация о причине отклонения товара. 
    /// </summary>
    std::string getPayload() const;
    void setPayload(std::string const& value);
    bool payloadIsSet() const;
    void unsetPayload();

    friend  void to_json(nlohmann::json& j, const OfferProcessingNoteDTO& o);
    friend  void from_json(const nlohmann::json& j, OfferProcessingNoteDTO& o);
protected:
    org::openapitools::server::model::OfferProcessingNoteType m_Type;
    bool m_TypeIsSet;
    std::string m_Payload;
    bool m_PayloadIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OfferProcessingNoteDTO_H_ */
