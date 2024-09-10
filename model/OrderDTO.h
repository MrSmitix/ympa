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
 * OrderDTO.h
 *
 * Заказ.
 */

#ifndef OrderDTO_H_
#define OrderDTO_H_



#include "CurrencyType.h"
#include "OrderItemDTO.h"
#include "OrderPaymentMethodType.h"
#include "OrderStatusType.h"
#include "OrderSubsidyDTO.h"
#include "OrderTaxSystemType.h"
#include "OrderBuyerDTO.h"
#include "OrderDeliveryDTO.h"
#include "OrderPaymentType.h"
#include <string>
#include <vector>
#include "OrderSubstatusType.h"
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
/// Заказ.
/// </summary>
class  OrderDTO 
{
public:
    OrderDTO() = default;
    explicit OrderDTO(boost::property_tree::ptree const& pt);
    virtual ~OrderDTO() = default;

    OrderDTO(const OrderDTO& other) = default; // copy constructor
    OrderDTO(OrderDTO&& other) noexcept = default; // move constructor

    OrderDTO& operator=(const OrderDTO& other) = default; // copy assignment
    OrderDTO& operator=(OrderDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OrderDTO members

    /// <summary>
    /// Идентификатор заказа.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    OrderStatusType getStatus() const;
    void setStatus(OrderStatusType value);

    /// <summary>
    /// 
    /// </summary>
    OrderSubstatusType getSubstatus() const;
    void setSubstatus(OrderSubstatusType value);

    /// <summary>
    /// 
    /// </summary>
    std::string getCreationDate() const;
    void setCreationDate(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getUpdatedAt() const;
    void setUpdatedAt(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CurrencyType getCurrency() const;
    void setCurrency(CurrencyType value);

    /// <summary>
    /// Платеж покупателя. 
    /// </summary>
    double getItemsTotal() const;
    void setItemsTotal(double value);

    /// <summary>
    /// Стоимость доставки. 
    /// </summary>
    double getDeliveryTotal() const;
    void setDeliveryTotal(double value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
    /// </summary>
    double getBuyerItemsTotal() const;
    void setBuyerItemsTotal(double value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
    /// </summary>
    double getBuyerTotal() const;
    void setBuyerTotal(double value);

    /// <summary>
    /// Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
    /// </summary>
    double getBuyerItemsTotalBeforeDiscount() const;
    void setBuyerItemsTotalBeforeDiscount(double value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
    /// </summary>
    double getBuyerTotalBeforeDiscount() const;
    void setBuyerTotalBeforeDiscount(double value);

    /// <summary>
    /// 
    /// </summary>
    OrderPaymentType getPaymentType() const;
    void setPaymentType(OrderPaymentType value);

    /// <summary>
    /// 
    /// </summary>
    OrderPaymentMethodType getPaymentMethod() const;
    void setPaymentMethod(OrderPaymentMethodType value);

    /// <summary>
    /// Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    /// </summary>
    bool isFake() const;
    void setFake(bool value);

    /// <summary>
    /// Список товаров в заказе.
    /// </summary>
    std::vector<OrderItemDTO> getItems() const;
    void setItems(std::vector<OrderItemDTO> value);

    /// <summary>
    /// Список субсидий по типам.
    /// </summary>
    std::vector<OrderSubsidyDTO> getSubsidies() const;
    void setSubsidies(std::vector<OrderSubsidyDTO> value);

    /// <summary>
    /// 
    /// </summary>
    OrderDeliveryDTO getDelivery() const;
    void setDelivery(OrderDeliveryDTO value);

    /// <summary>
    /// 
    /// </summary>
    OrderBuyerDTO getBuyer() const;
    void setBuyer(OrderBuyerDTO value);

    /// <summary>
    /// Комментарий к заказу.
    /// </summary>
    std::string getNotes() const;
    void setNotes(std::string value);

    /// <summary>
    /// 
    /// </summary>
    OrderTaxSystemType getTaxSystem() const;
    void setTaxSystem(OrderTaxSystemType value);

    /// <summary>
    /// **Только для модели DBS**  Запрошена ли отмена. 
    /// </summary>
    bool isCancelRequested() const;
    void setCancelRequested(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::string getExpiryDate() const;
    void setExpiryDate(std::string value);

protected:
    int64_t m_Id = 0L;
    OrderStatusType m_Status = OrderStatusType{};
    OrderSubstatusType m_Substatus = OrderSubstatusType{};
    std::string m_CreationDate = "";
    std::string m_UpdatedAt = "";
    CurrencyType m_Currency = CurrencyType{};
    double m_ItemsTotal = 0.0;
    double m_DeliveryTotal = 0.0;
    double m_BuyerItemsTotal = 0.0;
    double m_BuyerTotal = 0.0;
    double m_BuyerItemsTotalBeforeDiscount = 0.0;
    double m_BuyerTotalBeforeDiscount = 0.0;
    OrderPaymentType m_PaymentType = OrderPaymentType{};
    OrderPaymentMethodType m_PaymentMethod = OrderPaymentMethodType{};
    bool m_Fake = false;
    std::vector<OrderItemDTO> m_Items;
    std::vector<OrderSubsidyDTO> m_Subsidies;
    OrderDeliveryDTO m_Delivery;
    OrderBuyerDTO m_Buyer;
    std::string m_Notes = "";
    OrderTaxSystemType m_TaxSystem = OrderTaxSystemType{};
    bool m_CancelRequested = false;
    std::string m_ExpiryDate = "";
};

std::vector<OrderDTO> createOrderDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OrderDTO>(const OrderDTO& val) {
    return val.toPropertyTree();
}

template<>
inline OrderDTO fromPt<OrderDTO>(const boost::property_tree::ptree& pt) {
    OrderDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OrderDTO_H_ */
