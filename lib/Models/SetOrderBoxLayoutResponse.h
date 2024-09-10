
/*
 * SetOrderBoxLayoutResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SetOrderBoxLayoutResponse_H_
#define TINY_CPP_CLIENT_SetOrderBoxLayoutResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderBoxesLayoutDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderBoxLayoutResponse{
public:

    /*! \brief Constructor.
	 */
    SetOrderBoxLayoutResponse();
    SetOrderBoxLayoutResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetOrderBoxLayoutResponse();


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
	OrderBoxesLayoutDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBoxesLayoutDTO  result);


    private:
    ApiResponseStatusType status;
    OrderBoxesLayoutDTO result;
};
}

#endif /* TINY_CPP_CLIENT_SetOrderBoxLayoutResponse_H_ */
