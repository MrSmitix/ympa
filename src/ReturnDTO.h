/*
 * ReturnDTO.h
 *
 * Возврат заказа.
 */

#ifndef _ReturnDTO_H_
#define _ReturnDTO_H_


#include <string>
#include "LogisticPickupPointDTO.h"
#include "RecipientType.h"
#include "RefundStatusType.h"
#include "ReturnItemDTO.h"
#include "ReturnShipmentStatusType.h"
#include "ReturnType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Возврат заказа.
 *
 *  \ingroup Models
 *
 */

class ReturnDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ReturnDTO();
	ReturnDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReturnDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор возврата.
	 */
	long long getId();

	/*! \brief Set Идентификатор возврата.
	 */
	void setId(long long  id);
	/*! \brief Get Номер заказа.
	 */
	long long getOrderId();

	/*! \brief Set Номер заказа.
	 */
	void setOrderId(long long  orderId);
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
	long long getRefundAmount();

	/*! \brief Set Сумма возврата.
	 */
	void setRefundAmount(long long  refundAmount);
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
	bool getFastReturn();

	/*! \brief Set Используется ли опция **Быстрый возврат денег за дешевый брак**. 
	 */
	void setFastReturn(bool  fastReturn);

private:
	long long id;
	long long orderId;
	std::string creationDate;
	std::string updateDate;
	RefundStatusType refundStatus;
	LogisticPickupPointDTO logisticPickupPoint;
	RecipientType shipmentRecipientType;
	ReturnShipmentStatusType shipmentStatus;
	long long refundAmount;
	std::list <ReturnItemDTO>items;
	ReturnType returnType;
	bool fastReturn;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReturnDTO_H_ */
