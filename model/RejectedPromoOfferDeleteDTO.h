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
 * RejectedPromoOfferDeleteDTO.h
 *
 * Информация о товаре и ошибки, которые появились при его удалении.
 */

#ifndef RejectedPromoOfferDeleteDTO_H_
#define RejectedPromoOfferDeleteDTO_H_



#include <string>
#include "RejectedPromoOfferDeleteReasonType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о товаре и ошибки, которые появились при его удалении.
/// </summary>
class  RejectedPromoOfferDeleteDTO 
{
public:
    RejectedPromoOfferDeleteDTO() = default;
    explicit RejectedPromoOfferDeleteDTO(boost::property_tree::ptree const& pt);
    virtual ~RejectedPromoOfferDeleteDTO() = default;

    RejectedPromoOfferDeleteDTO(const RejectedPromoOfferDeleteDTO& other) = default; // copy constructor
    RejectedPromoOfferDeleteDTO(RejectedPromoOfferDeleteDTO&& other) noexcept = default; // move constructor

    RejectedPromoOfferDeleteDTO& operator=(const RejectedPromoOfferDeleteDTO& other) = default; // copy assignment
    RejectedPromoOfferDeleteDTO& operator=(RejectedPromoOfferDeleteDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RejectedPromoOfferDeleteDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RejectedPromoOfferDeleteReasonType getReason() const;
    void setReason(RejectedPromoOfferDeleteReasonType value);

protected:
    std::string m_OfferId = "";
    RejectedPromoOfferDeleteReasonType m_Reason = RejectedPromoOfferDeleteReasonType{};
};

std::vector<RejectedPromoOfferDeleteDTO> createRejectedPromoOfferDeleteDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RejectedPromoOfferDeleteDTO>(const RejectedPromoOfferDeleteDTO& val) {
    return val.toPropertyTree();
}

template<>
inline RejectedPromoOfferDeleteDTO fromPt<RejectedPromoOfferDeleteDTO>(const boost::property_tree::ptree& pt) {
    RejectedPromoOfferDeleteDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RejectedPromoOfferDeleteDTO_H_ */
