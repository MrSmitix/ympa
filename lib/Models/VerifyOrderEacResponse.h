
/*
 * VerifyOrderEacResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VerifyOrderEacResponse_H_
#define TINY_CPP_CLIENT_VerifyOrderEacResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "EacVerificationResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VerifyOrderEacResponse{
public:

    /*! \brief Constructor.
	 */
    VerifyOrderEacResponse();
    VerifyOrderEacResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VerifyOrderEacResponse();


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
	EacVerificationResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(EacVerificationResultDTO  result);


    private:
    ApiResponseStatusType status;
    EacVerificationResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_VerifyOrderEacResponse_H_ */
