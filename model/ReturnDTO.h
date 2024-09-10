/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ReturnDTO.h
 *
 * Возврат заказа.
 */

#ifndef ReturnDTO_H_
#define ReturnDTO_H_


#include "RefundStatusType.h"
#include "RecipientType.h"
#include "ReturnType.h"
#include "ReturnShipmentStatusType.h"
#include <string>
#include "LogisticPickupPointDTO.h"
#include "ReturnItemDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Возврат заказа.
/// </summary>
class  ReturnDTO
{
public:
    ReturnDTO();
    virtual ~ReturnDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ReturnDTO& rhs) const;
    bool operator!=(const ReturnDTO& rhs) const;

    /////////////////////////////////////////////
    /// ReturnDTO members

    /// <summary>
    /// Идентификатор возврата.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t const value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Номер заказа.
    /// </summary>
    int64_t getOrderId() const;
    void setOrderId(int64_t const value);
    bool orderIdIsSet() const;
    void unsetOrderId();
    /// <summary>
    /// Дата создания возврата клиентом.
    /// </summary>
    std::string getCreationDate() const;
    void setCreationDate(std::string const& value);
    bool creationDateIsSet() const;
    void unsetCreationDate();
    /// <summary>
    /// Дата обновления возврата.
    /// </summary>
    std::string getUpdateDate() const;
    void setUpdateDate(std::string const& value);
    bool updateDateIsSet() const;
    void unsetUpdateDate();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RefundStatusType getRefundStatus() const;
    void setRefundStatus(org::openapitools::server::model::RefundStatusType const& value);
    bool refundStatusIsSet() const;
    void unsetRefundStatus();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::LogisticPickupPointDTO getLogisticPickupPoint() const;
    void setLogisticPickupPoint(org::openapitools::server::model::LogisticPickupPointDTO const& value);
    bool logisticPickupPointIsSet() const;
    void unsetLogisticPickupPoint();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RecipientType getShipmentRecipientType() const;
    void setShipmentRecipientType(org::openapitools::server::model::RecipientType const& value);
    bool shipmentRecipientTypeIsSet() const;
    void unsetShipmentRecipientType();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ReturnShipmentStatusType getShipmentStatus() const;
    void setShipmentStatus(org::openapitools::server::model::ReturnShipmentStatusType const& value);
    bool shipmentStatusIsSet() const;
    void unsetShipmentStatus();
    /// <summary>
    /// Сумма возврата.
    /// </summary>
    int64_t getRefundAmount() const;
    void setRefundAmount(int64_t const value);
    bool refundAmountIsSet() const;
    void unsetRefundAmount();
    /// <summary>
    /// Список товаров в возврате.
    /// </summary>
    std::vector<org::openapitools::server::model::ReturnItemDTO> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::ReturnItemDTO> const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ReturnType getReturnType() const;
    void setReturnType(org::openapitools::server::model::ReturnType const& value);
    bool returnTypeIsSet() const;
    void unsetReturnType();
    /// <summary>
    /// Используется ли опция **Быстрый возврат денег за дешевый брак**. 
    /// </summary>
    bool isFastReturn() const;
    void setFastReturn(bool const value);
    bool fastReturnIsSet() const;
    void unsetFastReturn();

    friend  void to_json(nlohmann::json& j, const ReturnDTO& o);
    friend  void from_json(const nlohmann::json& j, ReturnDTO& o);
protected:
    int64_t m_Id;
    bool m_IdIsSet;
    int64_t m_OrderId;
    bool m_OrderIdIsSet;
    std::string m_CreationDate;
    bool m_CreationDateIsSet;
    std::string m_UpdateDate;
    bool m_UpdateDateIsSet;
    org::openapitools::server::model::RefundStatusType m_RefundStatus;
    bool m_RefundStatusIsSet;
    org::openapitools::server::model::LogisticPickupPointDTO m_LogisticPickupPoint;
    bool m_LogisticPickupPointIsSet;
    org::openapitools::server::model::RecipientType m_ShipmentRecipientType;
    bool m_ShipmentRecipientTypeIsSet;
    org::openapitools::server::model::ReturnShipmentStatusType m_ShipmentStatus;
    bool m_ShipmentStatusIsSet;
    int64_t m_RefundAmount;
    bool m_RefundAmountIsSet;
    std::vector<org::openapitools::server::model::ReturnItemDTO> m_Items;

    org::openapitools::server::model::ReturnType m_ReturnType;
    bool m_ReturnTypeIsSet;
    bool m_FastReturn;
    bool m_FastReturnIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ReturnDTO_H_ */
