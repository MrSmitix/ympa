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
 * DeleteOffersFromArchiveDTO.h
 *
 * Товары, которые не удалось восстановить из архива.
 */

#ifndef DeleteOffersFromArchiveDTO_H_
#define DeleteOffersFromArchiveDTO_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Товары, которые не удалось восстановить из архива.
/// </summary>
class  DeleteOffersFromArchiveDTO 
{
public:
    DeleteOffersFromArchiveDTO() = default;
    explicit DeleteOffersFromArchiveDTO(boost::property_tree::ptree const& pt);
    virtual ~DeleteOffersFromArchiveDTO() = default;

    DeleteOffersFromArchiveDTO(const DeleteOffersFromArchiveDTO& other) = default; // copy constructor
    DeleteOffersFromArchiveDTO(DeleteOffersFromArchiveDTO&& other) noexcept = default; // move constructor

    DeleteOffersFromArchiveDTO& operator=(const DeleteOffersFromArchiveDTO& other) = default; // copy assignment
    DeleteOffersFromArchiveDTO& operator=(DeleteOffersFromArchiveDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// DeleteOffersFromArchiveDTO members

    /// <summary>
    /// Список товаров, которые не удалось восстановить из архива.
    /// </summary>
    std::vector<std::string> getNotUnarchivedOfferIds() const;
    void setNotUnarchivedOfferIds(std::vector<std::string> value);

protected:
    std::vector<std::string> m_NotUnarchivedOfferIds;
};

std::vector<DeleteOffersFromArchiveDTO> createDeleteOffersFromArchiveDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<DeleteOffersFromArchiveDTO>(const DeleteOffersFromArchiveDTO& val) {
    return val.toPropertyTree();
}

template<>
inline DeleteOffersFromArchiveDTO fromPt<DeleteOffersFromArchiveDTO>(const boost::property_tree::ptree& pt) {
    DeleteOffersFromArchiveDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* DeleteOffersFromArchiveDTO_H_ */
