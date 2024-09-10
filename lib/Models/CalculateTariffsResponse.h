
/*
 * CalculateTariffsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsResponse_H_
#define TINY_CPP_CLIENT_CalculateTariffsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CalculateTariffsResponseDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsResponse{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsResponse();
    CalculateTariffsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsResponse();


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
	CalculateTariffsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CalculateTariffsResponseDTO  result);


    private:
    ApiResponseStatusType status;
    CalculateTariffsResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsResponse_H_ */
