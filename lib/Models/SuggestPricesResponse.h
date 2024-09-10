
/*
 * SuggestPricesResponse.h
 *
 * Ответ на запрос списка цен для продвижения.
 */

#ifndef TINY_CPP_CLIENT_SuggestPricesResponse_H_
#define TINY_CPP_CLIENT_SuggestPricesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "SuggestPricesResultDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesResponse{
public:

    /*! \brief Constructor.
	 */
    SuggestPricesResponse();
    SuggestPricesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuggestPricesResponse();


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
	SuggestPricesResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(SuggestPricesResultDTO  result);


    private:
    ApiResponseStatusType status;
    SuggestPricesResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_SuggestPricesResponse_H_ */
