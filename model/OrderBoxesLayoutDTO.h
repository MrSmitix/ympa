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
 * OrderBoxesLayoutDTO.h
 *
 * Распределение товаров по коробкам.
 */

#ifndef OrderBoxesLayoutDTO_H_
#define OrderBoxesLayoutDTO_H_


#include "EnrichedOrderBoxLayoutDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Распределение товаров по коробкам.
/// </summary>
class  OrderBoxesLayoutDTO
{
public:
    OrderBoxesLayoutDTO();
    virtual ~OrderBoxesLayoutDTO() = default;


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

    bool operator==(const OrderBoxesLayoutDTO& rhs) const;
    bool operator!=(const OrderBoxesLayoutDTO& rhs) const;

    /////////////////////////////////////////////
    /// OrderBoxesLayoutDTO members

    /// <summary>
    /// Список коробок.
    /// </summary>
    std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO> getBoxes() const;
    void setBoxes(std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO> const& value);

    friend  void to_json(nlohmann::json& j, const OrderBoxesLayoutDTO& o);
    friend  void from_json(const nlohmann::json& j, OrderBoxesLayoutDTO& o);
protected:
    std::vector<org::openapitools::server::model::EnrichedOrderBoxLayoutDTO> m_Boxes;

    
};

} // namespace org::openapitools::server::model

#endif /* OrderBoxesLayoutDTO_H_ */
