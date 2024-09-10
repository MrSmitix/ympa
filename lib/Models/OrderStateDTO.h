
/*
 * OrderStateDTO.h
 *
 * Информация по заказу.
 */

#ifndef TINY_CPP_CLIENT_OrderStateDTO_H_
#define TINY_CPP_CLIENT_OrderStateDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"

namespace Tiny {


/*! \brief Информация по заказу.
 *
 *  \ingroup Models
 *
 */

class OrderStateDTO{
public:

    /*! \brief Constructor.
	 */
    OrderStateDTO();
    OrderStateDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderStateDTO();


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


    private:
    long id{};
    OrderStatusType status;
    OrderSubstatusType substatus;
};
}

#endif /* TINY_CPP_CLIENT_OrderStateDTO_H_ */
