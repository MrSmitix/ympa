
/*
 * OrderItemSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemSubsidyDTO_H_
#define TINY_CPP_CLIENT_OrderItemSubsidyDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderItemSubsidyType.h"

namespace Tiny {


/*! \brief Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 *
 *  \ingroup Models
 *
 */

class OrderItemSubsidyDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemSubsidyDTO();
    OrderItemSubsidyDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemSubsidyDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderItemSubsidyType getType();

	/*! \brief Set 
	 */
	void setType(OrderItemSubsidyType  type);
	/*! \brief Get Сумма субсидии.
	 */
	long getAmount();

	/*! \brief Set Сумма субсидии.
	 */
	void setAmount(long  amount);


    private:
    OrderItemSubsidyType type;
    long amount{};
};
}

#endif /* TINY_CPP_CLIENT_OrderItemSubsidyDTO_H_ */
