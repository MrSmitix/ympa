
/*
 * OrdersStatsPriceDTO.h
 *
 * Цена или скидки на товар.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPriceDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsPriceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrdersStatsPriceType.h"

namespace Tiny {


/*! \brief Цена или скидки на товар.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPriceDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPriceDTO();
    OrdersStatsPriceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPriceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrdersStatsPriceType getType();

	/*! \brief Set 
	 */
	void setType(OrdersStatsPriceType  type);
	/*! \brief Get Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	long getCostPerItem();

	/*! \brief Set Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	void setCostPerItem(long  costPerItem);
	/*! \brief Get Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	long getTotal();

	/*! \brief Set Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
	 */
	void setTotal(long  total);


    private:
    OrdersStatsPriceType type;
    long costPerItem{};
    long total{};
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPriceDTO_H_ */
