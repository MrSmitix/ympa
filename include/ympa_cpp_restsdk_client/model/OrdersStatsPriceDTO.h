/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OrdersStatsPriceDTO.h
 *
 * Цена или скидки на товар.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsPriceDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsPriceDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OrdersStatsPriceType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Цена или скидки на товар.
/// </summary>
class  OrdersStatsPriceDTO
    : public ModelBase
{
public:
    OrdersStatsPriceDTO();
    virtual ~OrdersStatsPriceDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrdersStatsPriceDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrdersStatsPriceType> getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const std::shared_ptr<OrdersStatsPriceType>& value);

    /// <summary>
    /// Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
    /// </summary>
    double getCostPerItem() const;
    bool costPerItemIsSet() const;
    void unsetCostPerItem();

    void setCostPerItem(double value);

    /// <summary>
    /// Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
    /// </summary>
    double getTotal() const;
    bool totalIsSet() const;
    void unsetTotal();

    void setTotal(double value);


protected:
    std::shared_ptr<OrdersStatsPriceType> m_Type;
    bool m_TypeIsSet;
    double m_CostPerItem;
    bool m_CostPerItemIsSet;
    double m_Total;
    bool m_TotalIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsPriceDTO_H_ */
