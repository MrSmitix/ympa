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
 * UpdateStocksRequest.h
 *
 * Запрос на изменение информации по остаткам товаров.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateStocksRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateStocksRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/UpdateStockDTO.h"
#include <set>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UpdateStockDTO;


/// <summary>
/// Запрос на изменение информации по остаткам товаров.
/// </summary>
class  UpdateStocksRequest
    : public ModelBase
{
public:
    UpdateStocksRequest();
    virtual ~UpdateStocksRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateStocksRequest members

    /// <summary>
    /// Данные об остатках товаров. 
    /// </summary>
    std::set<std::shared_ptr<UpdateStockDTO>>& getSkus();
    bool skusIsSet() const;
    void unsetSkus();

    void setSkus(const std::set<std::shared_ptr<UpdateStockDTO>>& value);


protected:
    std::set<std::shared_ptr<UpdateStockDTO>> m_Skus;
    bool m_SkusIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateStocksRequest_H_ */
