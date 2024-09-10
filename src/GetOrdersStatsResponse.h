/*
 * GetOrdersStatsResponse.h
 *
 * Ответ на запрос информации по заказам.
 */

#ifndef _GetOrdersStatsResponse_H_
#define _GetOrdersStatsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrdersStatsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersStatsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrdersStatsResponse();
	GetOrdersStatsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrdersStatsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get 
	 */
	OrdersStatsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrdersStatsDTO  result);

private:
	ApiResponseStatusType status;
	OrdersStatsDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrdersStatsResponse_H_ */
