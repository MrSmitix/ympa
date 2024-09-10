
/*
 * GetOrderLabelsDataResponse.h
 *
 * Ответ с информацией для печати ярлыков.
 */

#ifndef TINY_CPP_CLIENT_GetOrderLabelsDataResponse_H_
#define TINY_CPP_CLIENT_GetOrderLabelsDataResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderLabelDTO.h"

namespace Tiny {


/*! \brief Ответ с информацией для печати ярлыков.
 *
 *  \ingroup Models
 *
 */

class GetOrderLabelsDataResponse{
public:

    /*! \brief Constructor.
	 */
    GetOrderLabelsDataResponse();
    GetOrderLabelsDataResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOrderLabelsDataResponse();


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
	OrderLabelDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderLabelDTO  result);


    private:
    ApiResponseStatusType status;
    OrderLabelDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOrderLabelsDataResponse_H_ */
