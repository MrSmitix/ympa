/*
 * SetReturnDecisionRequest.h
 *
 * Решения по позиции в возврате.
 */

#ifndef _SetReturnDecisionRequest_H_
#define _SetReturnDecisionRequest_H_


#include <string>
#include "ReturnRequestDecisionType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Решения по позиции в возврате.
 *
 *  \ingroup Models
 *
 */

class SetReturnDecisionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetReturnDecisionRequest();
	SetReturnDecisionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetReturnDecisionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в возврате.
	 */
	long long getReturnItemId();

	/*! \brief Set Идентификатор товара в возврате.
	 */
	void setReturnItemId(long long  returnItemId);
	/*! \brief Get 
	 */
	ReturnRequestDecisionType getDecisionType();

	/*! \brief Set 
	 */
	void setDecisionType(ReturnRequestDecisionType  decisionType);
	/*! \brief Get Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
	 */
	std::string getComment();

	/*! \brief Set Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
	 */
	void setComment(std::string  comment);

private:
	long long returnItemId;
	ReturnRequestDecisionType decisionType;
	std::string comment;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetReturnDecisionRequest_H_ */
