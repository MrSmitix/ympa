
/*
 * GetOrdersStatsResponse.h
 *
 * Ответ на запрос информации по заказам.
 */

#ifndef TINY_CPP_CLIENT_GetOrdersStatsResponse_H_
#define TINY_CPP_CLIENT_GetOrdersStatsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrdersStatsDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersStatsResponse{
public:

    /*! \brief Constructor.
	 */
    GetOrdersStatsResponse();
    GetOrdersStatsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOrdersStatsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_GetOrdersStatsResponse_H_ */
