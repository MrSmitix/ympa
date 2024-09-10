
/*
 * OrderSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */

#ifndef TINY_CPP_CLIENT_OrderSubsidyDTO_H_
#define TINY_CPP_CLIENT_OrderSubsidyDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderSubsidyType.h"

namespace Tiny {


/*! \brief Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 *
 *  \ingroup Models
 *
 */

class OrderSubsidyDTO{
public:

    /*! \brief Constructor.
	 */
    OrderSubsidyDTO();
    OrderSubsidyDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderSubsidyDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderSubsidyType getType();

	/*! \brief Set 
	 */
	void setType(OrderSubsidyType  type);
	/*! \brief Get Сумма субсидии.
	 */
	long getAmount();

	/*! \brief Set Сумма субсидии.
	 */
	void setAmount(long  amount);


    private:
    OrderSubsidyType type;
    long amount{};
};
}

#endif /* TINY_CPP_CLIENT_OrderSubsidyDTO_H_ */
