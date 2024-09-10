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
 * SetOrderBoxLayoutRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SetOrderBoxLayoutRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SetOrderBoxLayoutRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/OrderBoxLayoutDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class OrderBoxLayoutDTO;


/// <summary>
/// 
/// </summary>
class  SetOrderBoxLayoutRequest
    : public ModelBase
{
public:
    SetOrderBoxLayoutRequest();
    virtual ~SetOrderBoxLayoutRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SetOrderBoxLayoutRequest members

    /// <summary>
    /// Список коробок.
    /// </summary>
    std::vector<std::shared_ptr<OrderBoxLayoutDTO>>& getBoxes();
    bool boxesIsSet() const;
    void unsetBoxes();

    void setBoxes(const std::vector<std::shared_ptr<OrderBoxLayoutDTO>>& value);

    /// <summary>
    /// Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
    /// </summary>
    bool isAllowRemove() const;
    bool allowRemoveIsSet() const;
    void unsetAllowRemove();

    void setAllowRemove(bool value);


protected:
    std::vector<std::shared_ptr<OrderBoxLayoutDTO>> m_Boxes;
    bool m_BoxesIsSet;
    bool m_AllowRemove;
    bool m_AllowRemoveIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SetOrderBoxLayoutRequest_H_ */
