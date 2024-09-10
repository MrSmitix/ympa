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
 * OrderSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrderSubsidyDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrderSubsidyDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OrderSubsidyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
/// </summary>
class  OrderSubsidyDTO
    : public ModelBase
{
public:
    OrderSubsidyDTO();
    virtual ~OrderSubsidyDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderSubsidyDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrderSubsidyType> getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const std::shared_ptr<OrderSubsidyType>& value);

    /// <summary>
    /// Сумма субсидии.
    /// </summary>
    double getAmount() const;
    bool amountIsSet() const;
    void unsetAmount();

    void setAmount(double value);


protected:
    std::shared_ptr<OrderSubsidyType> m_Type;
    bool m_TypeIsSet;
    double m_Amount;
    bool m_AmountIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrderSubsidyDTO_H_ */
