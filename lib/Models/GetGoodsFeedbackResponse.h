
/*
 * GetGoodsFeedbackResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetGoodsFeedbackResponse_H_
#define TINY_CPP_CLIENT_GetGoodsFeedbackResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackListDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackResponse{
public:

    /*! \brief Constructor.
	 */
    GetGoodsFeedbackResponse();
    GetGoodsFeedbackResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsFeedbackResponse();


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
	GoodsFeedbackListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackListDTO  result);


    private:
    ApiResponseStatusType status;
    GoodsFeedbackListDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsFeedbackResponse_H_ */
