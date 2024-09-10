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
 * OutletDeliveryRuleDTO.h
 *
 * Информация об условиях доставки для данной точки продаж.
 */

#ifndef OutletDeliveryRuleDTO_H_
#define OutletDeliveryRuleDTO_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об условиях доставки для данной точки продаж.
/// </summary>
class  OutletDeliveryRuleDTO 
{
public:
    OutletDeliveryRuleDTO() = default;
    explicit OutletDeliveryRuleDTO(boost::property_tree::ptree const& pt);
    virtual ~OutletDeliveryRuleDTO() = default;

    OutletDeliveryRuleDTO(const OutletDeliveryRuleDTO& other) = default; // copy constructor
    OutletDeliveryRuleDTO(OutletDeliveryRuleDTO&& other) noexcept = default; // move constructor

    OutletDeliveryRuleDTO& operator=(const OutletDeliveryRuleDTO& other) = default; // copy assignment
    OutletDeliveryRuleDTO& operator=(OutletDeliveryRuleDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OutletDeliveryRuleDTO members

    /// <summary>
    /// Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. 
    /// </summary>
    int32_t getMinDeliveryDays() const;
    void setMinDeliveryDays(int32_t value);

    /// <summary>
    /// Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. 
    /// </summary>
    int32_t getMaxDeliveryDays() const;
    void setMaxDeliveryDays(int32_t value);

    /// <summary>
    /// Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). 
    /// </summary>
    int64_t getDeliveryServiceId() const;
    void setDeliveryServiceId(int64_t value);

    /// <summary>
    /// Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от &#x60;minDeliveryDays&#x60; до &#x60;maxDeliveryDays&#x60;.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от &#x60;minDeliveryDays&#x60; + 1 рабочий день до &#x60;maxDeliveryDays&#x60; + 1 рабочий день.  Значение по умолчанию: &#x60;24&#x60;. 
    /// </summary>
    int32_t getOrderBefore() const;
    void setOrderBefore(int32_t value);

    /// <summary>
    /// Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
    /// </summary>
    double getPriceFreePickup() const;
    void setPriceFreePickup(double value);

    /// <summary>
    /// Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * &#x60;true&#x60; — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением &#x60;true&#x60;.  Взаимоисключающий с параметрами &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;. 
    /// </summary>
    bool isUnspecifiedDeliveryInterval() const;
    void setUnspecifiedDeliveryInterval(bool value);

protected:
    int32_t m_MinDeliveryDays = 0;
    int32_t m_MaxDeliveryDays = 0;
    int64_t m_DeliveryServiceId = 0L;
    int32_t m_OrderBefore = 0;
    double m_PriceFreePickup = 0.0;
    bool m_UnspecifiedDeliveryInterval = false;
};

std::vector<OutletDeliveryRuleDTO> createOutletDeliveryRuleDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OutletDeliveryRuleDTO>(const OutletDeliveryRuleDTO& val) {
    return val.toPropertyTree();
}

template<>
inline OutletDeliveryRuleDTO fromPt<OutletDeliveryRuleDTO>(const boost::property_tree::ptree& pt) {
    OutletDeliveryRuleDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OutletDeliveryRuleDTO_H_ */
