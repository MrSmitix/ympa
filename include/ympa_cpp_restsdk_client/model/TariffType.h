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
 * TariffType.h
 *
 * Услуга Маркета или дополнительный тариф к услуге размещения:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;STORAGE&#x60; — хранение товара на складе Маркета в течение суток.  * &#x60;SURPLUS&#x60; — хранение излишков на складе Маркета.  * &#x60;WITHDRAW&#x60; — вывоз товара со склада Маркета.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;CROSSREGIONAL_DELIVERY_RETURN&#x60; — доставка невыкупов и возвратов.  * &#x60;DISPOSAL&#x60; — утилизация.  * &#x60;SORTING_CENTER_STORAGE&#x60; — хранение невыкупов и возвратов.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;FF_XDOC_SUPPLY_BOX&#x60; — поставка товара через транзитный склад (за короб).  * &#x60;FF_XDOC_SUPPLY_PALLET&#x60; — поставка товара через транзитный склад (за палету).  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  * &#x60;RETURN_PROCESSING&#x60; — обработка невыкупов и возвратов.  * &#x60;EXPRESS_CANCELLED_BY_PARTNER&#x60; — отмена заказа с экспресс-доставкой.  * &#x60;DELIVERY_TO_CUSTOMER_RETURN&#x60; — возврат доставляемого товара на склад.  * &#x60;CROSSBORDER_DELIVERY&#x60; — доставка из-за рубежа.  * &#x60;INTAKE_SORTING_BULKY_CARGO&#x60; — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_SMALL_GOODS&#x60; — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_DAILY&#x60; — организация забора заказов со склада продавца.  * &#x60;FF_STORAGE_BILLING&#x60; — хранения товаров на складе.  * &#x60;CANCELLED_ORDER_FEE_QI&#x60; — отмена заказа по вине продавца.  * &#x60;LATE_ORDER_EXECUTION_FEE_QI&#x60; — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TariffType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TariffType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  TariffType
    : public ModelBase
{
public:
    TariffType();
    virtual ~TariffType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eTariffType
    {
        TariffType_AGENCY_COMMISSION,
        TariffType_PAYMENT_TRANSFER,
        TariffType_STORAGE,
        TariffType_WITHDRAW,
        TariffType_SURPLUS,
        TariffType_FEE,
        TariffType_DELIVERY_TO_CUSTOMER,
        TariffType_CROSSREGIONAL_DELIVERY,
        TariffType_CROSSREGIONAL_DELIVERY_RETURN,
        TariffType_DISPOSAL,
        TariffType_SORTING_CENTER_STORAGE,
        TariffType_EXPRESS_DELIVERY,
        TariffType_FF_XDOC_SUPPLY_BOX,
        TariffType_FF_XDOC_SUPPLY_PALLET,
        TariffType_SORTING,
        TariffType_MIDDLE_MILE,
        TariffType_RETURN_PROCESSING,
        TariffType_EXPRESS_CANCELLED_BY_PARTNER,
        TariffType_DELIVERY_TO_CUSTOMER_RETURN,
        TariffType_CROSSBORDER_DELIVERY,
        TariffType_INTAKE_SORTING_BULKY_CARGO,
        TariffType_INTAKE_SORTING_SMALL_GOODS,
        TariffType_INTAKE_SORTING_DAILY,
        TariffType_FF_STORAGE_BILLING,
        TariffType_CANCELLED_ORDER_FEE_QI,
        TariffType_LATE_ORDER_EXECUTION_FEE_QI,
    };

    eTariffType getValue() const;
    void setValue(eTariffType const value);

    protected:
        eTariffType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TariffType_H_ */
