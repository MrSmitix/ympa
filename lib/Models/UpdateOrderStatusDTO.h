
/*
 * UpdateOrderStatusDTO.h
 *
 * Список заказов.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusDTO_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"
#include "OrderUpdateStatusType.h"

namespace Tiny {


/*! \brief Список заказов.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusDTO();
    UpdateOrderStatusDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа.
	 */
	long getId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setId(long  id);
	/*! \brief Get 
	 */
	OrderStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderStatusType  status);
	/*! \brief Get 
	 */
	OrderSubstatusType getSubstatus();

	/*! \brief Set 
	 */
	void setSubstatus(OrderSubstatusType  substatus);
	/*! \brief Get 
	 */
	OrderUpdateStatusType getUpdateStatus();

	/*! \brief Set 
	 */
	void setUpdateStatus(OrderUpdateStatusType  updateStatus);
	/*! \brief Get Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
	 */
	std::string getErrorDetails();

	/*! \brief Set Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
	 */
	void setErrorDetails(std::string  errorDetails);


    private:
    long id{};
    OrderStatusType status;
    OrderSubstatusType substatus;
    OrderUpdateStatusType updateStatus;
    std::string errorDetails{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusDTO_H_ */
