
/*
 * ProvideOrderItemIdentifiersResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProvideOrderItemIdentifiersResponse_H_
#define TINY_CPP_CLIENT_ProvideOrderItemIdentifiersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderItemsModificationResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProvideOrderItemIdentifiersResponse{
public:

    /*! \brief Constructor.
	 */
    ProvideOrderItemIdentifiersResponse();
    ProvideOrderItemIdentifiersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProvideOrderItemIdentifiersResponse();


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
	OrderItemsModificationResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderItemsModificationResultDTO  result);


    private:
    ApiResponseStatusType status;
    OrderItemsModificationResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_ProvideOrderItemIdentifiersResponse_H_ */
