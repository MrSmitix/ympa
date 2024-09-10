/*
 * OrderItemSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */

#ifndef _OrderItemSubsidyDTO_H_
#define _OrderItemSubsidyDTO_H_


#include <string>
#include "OrderItemSubsidyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 *
 *  \ingroup Models
 *
 */

class OrderItemSubsidyDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemSubsidyDTO();
	OrderItemSubsidyDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemSubsidyDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderItemSubsidyType getType();

	/*! \brief Set 
	 */
	void setType(OrderItemSubsidyType  type);
	/*! \brief Get Сумма субсидии.
	 */
	long long getAmount();

	/*! \brief Set Сумма субсидии.
	 */
	void setAmount(long long  amount);

private:
	OrderItemSubsidyType type;
	long long amount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemSubsidyDTO_H_ */
