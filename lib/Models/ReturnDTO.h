
/*
 * ReturnDTO.h
 *
 * Возврат заказа.
 */

#ifndef TINY_CPP_CLIENT_ReturnDTO_H_
#define TINY_CPP_CLIENT_ReturnDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LogisticPickupPointDTO.h"
#include "RecipientType.h"
#include "RefundStatusType.h"
#include "ReturnItemDTO.h"
#include "ReturnShipmentStatusType.h"
#include "ReturnType.h"
#include <list>

namespace Tiny {


/*! \brief Возврат заказа.
 *
 *  \ingroup Models
 *
 */

class ReturnDTO{
public:

    /*! \brief Constructor.
	 */
    ReturnDTO();
    ReturnDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор возврата.
	 */
	long getId();

	/*! \brief Set Идентификатор возврата.
	 */
	void setId(long  id);
	/*! \brief Get Номер заказа.
	 */
	long getOrderId();

	/*! \brief Set Номер заказа.
	 */
	void setOrderId(long  orderId);
	/*! \brief Get Дата создания возврата клиентом.
	 */
	std::string getCreationDate();

	/*! \brief Set Дата создания возврата клиентом.
	 */
	void setCreationDate(std::string  creationDate);
	/*! \brief Get Дата обновления возврата.
	 */
	std::string getUpdateDate();

	/*! \brief Set Дата обновления возврата.
	 */
	void setUpdateDate(std::string  updateDate);
	/*! \brief Get 
	 */
	RefundStatusType getRefundStatus();

	/*! \brief Set 
	 */
	void setRefundStatus(RefundStatusType  refundStatus);
	/*! \brief Get 
	 */
	LogisticPickupPointDTO getLogisticPickupPoint();

	/*! \brief Set 
	 */
	void setLogisticPickupPoint(LogisticPickupPointDTO  logisticPickupPoint);
	/*! \brief Get 
	 */
	RecipientType getShipmentRecipientType();

	/*! \brief Set 
	 */
	void setShipmentRecipientType(RecipientType  shipmentRecipientType);
	/*! \brief Get 
	 */
	ReturnShipmentStatusType getShipmentStatus();

	/*! \brief Set 
	 */
	void setShipmentStatus(ReturnShipmentStatusType  shipmentStatus);
	/*! \brief Get Сумма возврата.
	 */
	long getRefundAmount();

	/*! \brief Set Сумма возврата.
	 */
	void setRefundAmount(long  refundAmount);
	/*! \brief Get Список товаров в возврате.
	 */
	std::list<ReturnItemDTO> getItems();

	/*! \brief Set Список товаров в возврате.
	 */
	void setItems(std::list <ReturnItemDTO> items);
	/*! \brief Get 
	 */
	ReturnType getReturnType();

	/*! \brief Set 
	 */
	void setReturnType(ReturnType  returnType);
	/*! \brief Get Используется ли опция **Быстрый возврат денег за дешевый брак**. 
	 */
	bool isFastReturn();

	/*! \brief Set Используется ли опция **Быстрый возврат денег за дешевый брак**. 
	 */
	void setFastReturn(bool  fastReturn);


    private:
    long id{};
    long orderId{};
    std::string creationDate{};
    std::string updateDate{};
    RefundStatusType refundStatus;
    LogisticPickupPointDTO logisticPickupPoint;
    RecipientType shipmentRecipientType;
    ReturnShipmentStatusType shipmentStatus;
    long refundAmount{};
    std::list<ReturnItemDTO> items;
    ReturnType returnType;
    bool fastReturn{};
};
}

#endif /* TINY_CPP_CLIENT_ReturnDTO_H_ */
