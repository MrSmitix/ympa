
/*
 * OrderDeliveryDateDTO.h
 *
 * Информация о новой дате доставки заказа.
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryDateDTO_H_
#define TINY_CPP_CLIENT_OrderDeliveryDateDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Информация о новой дате доставки заказа.
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDateDTO{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryDateDTO();
    OrderDeliveryDateDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryDateDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getToDate();

	/*! \brief Set Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setToDate(Date  toDate);


    private:
    Date toDate;
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryDateDTO_H_ */
