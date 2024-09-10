
/*
 * OrdersStatsCommissionDTO.h
 *
 * Информация о стоимости услуг.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsCommissionDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsCommissionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrdersStatsCommissionType.h"

namespace Tiny {


/*! \brief Информация о стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsCommissionDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsCommissionDTO();
    OrdersStatsCommissionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsCommissionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrdersStatsCommissionType getType();

	/*! \brief Set 
	 */
	void setType(OrdersStatsCommissionType  type);
	/*! \brief Get Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	 */
	long getActual();

	/*! \brief Set Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
	 */
	void setActual(long  actual);


    private:
    OrdersStatsCommissionType type;
    long actual{};
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsCommissionDTO_H_ */
