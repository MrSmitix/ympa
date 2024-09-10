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
 * OrderStatusType.h
 *
 * Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  OrderStatusType
    : public ModelBase
{
public:
    OrderStatusType();
    virtual ~OrderStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eOrderStatusType
    {
        OrderStatusType_PLACING,
        OrderStatusType_RESERVED,
        OrderStatusType_UNPAID,
        OrderStatusType_PROCESSING,
        OrderStatusType_DELIVERY,
        OrderStatusType_PICKUP,
        OrderStatusType_DELIVERED,
        OrderStatusType_CANCELLED,
        OrderStatusType_PENDING,
        OrderStatusType_PARTIALLY_RETURNED,
        OrderStatusType_RETURNED,
        OrderStatusType_UNKNOWN,
    };

    eOrderStatusType getValue() const;
    void setValue(eOrderStatusType const value);

    protected:
        eOrderStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusType_H_ */
