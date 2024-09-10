/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * UpdateStockItemDTO.h
 *
 * Информация об остатках товара. 
 */

#ifndef UpdateStockItemDTO_H_
#define UpdateStockItemDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об остатках товара. 
/// </summary>
class  UpdateStockItemDTO 
{
public:
    UpdateStockItemDTO() = default;
    explicit UpdateStockItemDTO(boost::property_tree::ptree const& pt);
    virtual ~UpdateStockItemDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// UpdateStockItemDTO members

    /// <summary>
    /// Количество доступного товара. 
    /// </summary>
    int64_t getCount() const;
    void setCount(int64_t value);

    /// <summary>
    /// Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    /// </summary>
    std::string getUpdatedAt() const;
    void setUpdatedAt(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_Count = 0L;
    std::string m_UpdatedAt = "";
};

std::vector<UpdateStockItemDTO> createUpdateStockItemDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* UpdateStockItemDTO_H_ */
