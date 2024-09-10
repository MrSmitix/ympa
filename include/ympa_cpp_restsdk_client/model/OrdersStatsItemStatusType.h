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
 * OrdersStatsItemStatusType.h
 *
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsItemStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsItemStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OrdersStatsItemStatusType
    : public ModelBase
{
public:
    OrdersStatsItemStatusType();
    virtual ~OrdersStatsItemStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOrdersStatsItemStatusType
    {
        OrdersStatsItemStatusType_REJECTED,
        OrdersStatsItemStatusType_RETURNED,
    };

    eOrdersStatsItemStatusType getValue() const;
    void setValue(eOrdersStatsItemStatusType const value);

    protected:
        eOrdersStatsItemStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsItemStatusType_H_ */
