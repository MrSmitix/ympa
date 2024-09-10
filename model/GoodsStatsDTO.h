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
 * GoodsStatsDTO.h
 *
 * Отчет по товарам.
 */

#ifndef GoodsStatsDTO_H_
#define GoodsStatsDTO_H_


#include "GoodsStatsGoodsDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Отчет по товарам.
/// </summary>
class  GoodsStatsDTO
{
public:
    GoodsStatsDTO();
    virtual ~GoodsStatsDTO() = default;


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

    bool operator==(const GoodsStatsDTO& rhs) const;
    bool operator!=(const GoodsStatsDTO& rhs) const;

    /////////////////////////////////////////////
    /// GoodsStatsDTO members

    /// <summary>
    /// Список товаров.
    /// </summary>
    std::vector<org::openapitools::server::model::GoodsStatsGoodsDTO> getShopSkus() const;
    void setShopSkus(std::vector<org::openapitools::server::model::GoodsStatsGoodsDTO> const& value);

    friend  void to_json(nlohmann::json& j, const GoodsStatsDTO& o);
    friend  void from_json(const nlohmann::json& j, GoodsStatsDTO& o);
protected:
    std::vector<org::openapitools::server::model::GoodsStatsGoodsDTO> m_ShopSkus;

    
};

} // namespace org::openapitools::server::model

#endif /* GoodsStatsDTO_H_ */
