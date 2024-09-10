
/*
 * DeletePromoOffersResponse.h
 *
 * Результат удаления товаров из акции.
 */

#ifndef TINY_CPP_CLIENT_DeletePromoOffersResponse_H_
#define TINY_CPP_CLIENT_DeletePromoOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "DeletePromoOffersResultDTO.h"

namespace Tiny {


/*! \brief Результат удаления товаров из акции.
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersResponse{
public:

    /*! \brief Constructor.
	 */
    DeletePromoOffersResponse();
    DeletePromoOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePromoOffersResponse();


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
	DeletePromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeletePromoOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    DeletePromoOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_DeletePromoOffersResponse_H_ */
