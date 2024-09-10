
/*
 * GetOfferCardsContentStatusResponse.h
 *
 * Ответ со списком состояний товаров и пагинацией.
 */

#ifndef TINY_CPP_CLIENT_GetOfferCardsContentStatusResponse_H_
#define TINY_CPP_CLIENT_GetOfferCardsContentStatusResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferCardsContentStatusDTO.h"

namespace Tiny {


/*! \brief Ответ со списком состояний товаров и пагинацией.
 *
 *  \ingroup Models
 *
 */

class GetOfferCardsContentStatusResponse{
public:

    /*! \brief Constructor.
	 */
    GetOfferCardsContentStatusResponse();
    GetOfferCardsContentStatusResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferCardsContentStatusResponse();


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
	OfferCardsContentStatusDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferCardsContentStatusDTO  result);


    private:
    ApiResponseStatusType status;
    OfferCardsContentStatusDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferCardsContentStatusResponse_H_ */
