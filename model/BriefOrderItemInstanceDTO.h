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
 * BriefOrderItemInstanceDTO.h
 *
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */

#ifndef BriefOrderItemInstanceDTO_H_
#define BriefOrderItemInstanceDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
/// </summary>
class  BriefOrderItemInstanceDTO 
{
public:
    BriefOrderItemInstanceDTO() = default;
    explicit BriefOrderItemInstanceDTO(boost::property_tree::ptree const& pt);
    virtual ~BriefOrderItemInstanceDTO() = default;

    BriefOrderItemInstanceDTO(const BriefOrderItemInstanceDTO& other) = default; // copy constructor
    BriefOrderItemInstanceDTO(BriefOrderItemInstanceDTO&& other) noexcept = default; // move constructor

    BriefOrderItemInstanceDTO& operator=(const BriefOrderItemInstanceDTO& other) = default; // copy assignment
    BriefOrderItemInstanceDTO& operator=(BriefOrderItemInstanceDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// BriefOrderItemInstanceDTO members

    /// <summary>
    /// Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %} 
    /// </summary>
    std::string getCis() const;
    void setCis(std::string value);

    /// <summary>
    /// Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
    /// </summary>
    std::string getUin() const;
    void setUin(std::string value);

    /// <summary>
    /// Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
    /// </summary>
    std::string getRnpt() const;
    void setRnpt(std::string value);

    /// <summary>
    /// Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
    /// </summary>
    std::string getGtd() const;
    void setGtd(std::string value);

protected:
    std::string m_Cis = "";
    std::string m_Uin = "";
    std::string m_Rnpt = "";
    std::string m_Gtd = "";
};

std::vector<BriefOrderItemInstanceDTO> createBriefOrderItemInstanceDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<BriefOrderItemInstanceDTO>(const BriefOrderItemInstanceDTO& val) {
    return val.toPropertyTree();
}

template<>
inline BriefOrderItemInstanceDTO fromPt<BriefOrderItemInstanceDTO>(const boost::property_tree::ptree& pt) {
    BriefOrderItemInstanceDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* BriefOrderItemInstanceDTO_H_ */
