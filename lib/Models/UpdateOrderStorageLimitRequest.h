
/*
 * UpdateOrderStorageLimitRequest.h
 *
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStorageLimitRequest_H_
#define TINY_CPP_CLIENT_UpdateOrderStorageLimitRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Запрос на обновление срока хранения заказа в ПВЗ.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStorageLimitRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStorageLimitRequest();
    UpdateOrderStorageLimitRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStorageLimitRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getNewDate();

	/*! \brief Set Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setNewDate(Date  newDate);


    private:
    Date newDate;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStorageLimitRequest_H_ */
