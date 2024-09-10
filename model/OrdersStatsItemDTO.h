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
 * OrdersStatsItemDTO.h
 *
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
 */

#ifndef OrdersStatsItemDTO_H_
#define OrdersStatsItemDTO_H_



#include "OrdersStatsPriceDTO.h"
#include "OrdersStatsWarehouseDTO.h"
#include <string>
#include "OrdersStatsDetailsDTO.h"
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
/// Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
/// </summary>
class  OrdersStatsItemDTO 
{
public:
    OrdersStatsItemDTO() = default;
    explicit OrdersStatsItemDTO(boost::property_tree::ptree const& pt);
    virtual ~OrdersStatsItemDTO() = default;

    OrdersStatsItemDTO(const OrdersStatsItemDTO& other) = default; // copy constructor
    OrdersStatsItemDTO(OrdersStatsItemDTO&& other) noexcept = default; // move constructor

    OrdersStatsItemDTO& operator=(const OrdersStatsItemDTO& other) = default; // copy assignment
    OrdersStatsItemDTO& operator=(OrdersStatsItemDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// OrdersStatsItemDTO members

    /// <summary>
    /// Название товара.
    /// </summary>
    std::string getOfferName() const;
    void setOfferName(std::string value);

    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t value);

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getShopSku() const;
    void setShopSku(std::string value);

    /// <summary>
    /// Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. 
    /// </summary>
    int32_t getCount() const;
    void setCount(int32_t value);

    /// <summary>
    /// Цена или скидки на товар.
    /// </summary>
    std::vector<OrdersStatsPriceDTO> getPrices() const;
    void setPrices(std::vector<OrdersStatsPriceDTO> value);

    /// <summary>
    /// 
    /// </summary>
    OrdersStatsWarehouseDTO getWarehouse() const;
    void setWarehouse(OrdersStatsWarehouseDTO value);

    /// <summary>
    /// Информация об удалении товара из заказа.
    /// </summary>
    std::vector<OrdersStatsDetailsDTO> getDetails() const;
    void setDetails(std::vector<OrdersStatsDetailsDTO> value);

    /// <summary>
    /// Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
    /// </summary>
    std::vector<std::string> getCisList() const;
    void setCisList(std::vector<std::string> value);

    /// <summary>
    /// Первоначальное количество единиц товара.
    /// </summary>
    int32_t getInitialCount() const;
    void setInitialCount(int32_t value);

    /// <summary>
    /// Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
    /// </summary>
    int32_t getBidFee() const;
    void setBidFee(int32_t value);

    /// <summary>
    /// Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
    /// </summary>
    double getCofinanceThreshold() const;
    void setCofinanceThreshold(double value);

    /// <summary>
    /// Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
    /// </summary>
    double getCofinanceValue() const;
    void setCofinanceValue(double value);

protected:
    std::string m_OfferName = "";
    int64_t m_MarketSku = 0L;
    std::string m_ShopSku = "";
    int32_t m_Count = 0;
    std::vector<OrdersStatsPriceDTO> m_Prices;
    OrdersStatsWarehouseDTO m_Warehouse;
    std::vector<OrdersStatsDetailsDTO> m_Details;
    std::vector<std::string> m_CisList;
    int32_t m_InitialCount = 0;
    int32_t m_BidFee = 0;
    double m_CofinanceThreshold = 0.0;
    double m_CofinanceValue = 0.0;
};

std::vector<OrdersStatsItemDTO> createOrdersStatsItemDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OrdersStatsItemDTO>(const OrdersStatsItemDTO& val) {
    return val.toPropertyTree();
}

template<>
inline OrdersStatsItemDTO fromPt<OrdersStatsItemDTO>(const boost::property_tree::ptree& pt) {
    OrdersStatsItemDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OrdersStatsItemDTO_H_ */
