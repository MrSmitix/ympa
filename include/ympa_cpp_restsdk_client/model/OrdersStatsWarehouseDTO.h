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
 * OrdersStatsWarehouseDTO.h
 *
 * Информация о складе, на котором хранится товар.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsWarehouseDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsWarehouseDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Информация о складе, на котором хранится товар.
/// </summary>
class  OrdersStatsWarehouseDTO
    : public ModelBase
{
public:
    OrdersStatsWarehouseDTO();
    virtual ~OrdersStatsWarehouseDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrdersStatsWarehouseDTO members

    /// <summary>
    /// Идентификатор склада.
    /// </summary>
    int64_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int64_t value);

    /// <summary>
    /// Название склада.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);


protected:
    int64_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrdersStatsWarehouseDTO_H_ */
