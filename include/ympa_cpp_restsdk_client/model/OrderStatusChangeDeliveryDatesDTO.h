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
 * OrderStatusChangeDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusChangeDeliveryDatesDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusChangeDeliveryDatesDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Диапазон дат доставки.
/// </summary>
class  OrderStatusChangeDeliveryDatesDTO
    : public ModelBase
{
public:
    OrderStatusChangeDeliveryDatesDTO();
    virtual ~OrderStatusChangeDeliveryDatesDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderStatusChangeDeliveryDatesDTO members

    /// <summary>
    /// **Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
    /// </summary>
    utility::datetime getRealDeliveryDate() const;
    bool realDeliveryDateIsSet() const;
    void unsetRealDeliveryDate();

    void setRealDeliveryDate(const utility::datetime& value);


protected:
    utility::datetime m_RealDeliveryDate;
    bool m_RealDeliveryDateIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrderStatusChangeDeliveryDatesDTO_H_ */
