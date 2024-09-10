
/*
 * SetReturnDecisionRequest.h
 *
 * Решения по позиции в возврате.
 */

#ifndef TINY_CPP_CLIENT_SetReturnDecisionRequest_H_
#define TINY_CPP_CLIENT_SetReturnDecisionRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ReturnRequestDecisionType.h"

namespace Tiny {


/*! \brief Решения по позиции в возврате.
 *
 *  \ingroup Models
 *
 */

class SetReturnDecisionRequest{
public:

    /*! \brief Constructor.
	 */
    SetReturnDecisionRequest();
    SetReturnDecisionRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetReturnDecisionRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в возврате.
	 */
	long getReturnItemId();

	/*! \brief Set Идентификатор товара в возврате.
	 */
	void setReturnItemId(long  returnItemId);
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
    long returnItemId{};
    ReturnRequestDecisionType decisionType;
    std::string comment{};
};
}

#endif /* TINY_CPP_CLIENT_SetReturnDecisionRequest_H_ */
