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
 * EnrichedOrderBoxLayoutDTO.h
 *
 * Информация о коробке.
 */

#ifndef EnrichedOrderBoxLayoutDTO_H_
#define EnrichedOrderBoxLayoutDTO_H_


#include <vector>
#include "OrderBoxLayoutItemDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация о коробке.
/// </summary>
class  EnrichedOrderBoxLayoutDTO
{
public:
    EnrichedOrderBoxLayoutDTO();
    virtual ~EnrichedOrderBoxLayoutDTO() = default;


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

    bool operator==(const EnrichedOrderBoxLayoutDTO& rhs) const;
    bool operator!=(const EnrichedOrderBoxLayoutDTO& rhs) const;

    /////////////////////////////////////////////
    /// EnrichedOrderBoxLayoutDTO members

    /// <summary>
    /// Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
    /// </summary>
    std::vector<org::openapitools::server::model::OrderBoxLayoutItemDTO> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::OrderBoxLayoutItemDTO> const& value);
    /// <summary>
    /// Идентификатор коробки.
    /// </summary>
    int64_t getBoxId() const;
    void setBoxId(int64_t const value);
    bool boxIdIsSet() const;
    void unsetBoxId();

    friend  void to_json(nlohmann::json& j, const EnrichedOrderBoxLayoutDTO& o);
    friend  void from_json(const nlohmann::json& j, EnrichedOrderBoxLayoutDTO& o);
protected:
    std::vector<org::openapitools::server::model::OrderBoxLayoutItemDTO> m_Items;

    int64_t m_BoxId;
    bool m_BoxIdIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* EnrichedOrderBoxLayoutDTO_H_ */
