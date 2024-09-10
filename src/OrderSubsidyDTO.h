/*
 * OrderSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */

#ifndef _OrderSubsidyDTO_H_
#define _OrderSubsidyDTO_H_


#include <string>
#include "OrderSubsidyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 *
 *  \ingroup Models
 *
 */

class OrderSubsidyDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderSubsidyDTO();
	OrderSubsidyDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderSubsidyDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderSubsidyType getType();

	/*! \brief Set 
	 */
	void setType(OrderSubsidyType  type);
	/*! \brief Get Сумма субсидии.
	 */
	long long getAmount();

	/*! \brief Set Сумма субсидии.
	 */
	void setAmount(long long  amount);

private:
	OrderSubsidyType type;
	long long amount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderSubsidyDTO_H_ */
