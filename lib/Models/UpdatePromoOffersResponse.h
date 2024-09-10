
/*
 * UpdatePromoOffersResponse.h
 *
 * Результат добавления товаров в акцию.
 */

#ifndef TINY_CPP_CLIENT_UpdatePromoOffersResponse_H_
#define TINY_CPP_CLIENT_UpdatePromoOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "UpdatePromoOffersResultDTO.h"

namespace Tiny {


/*! \brief Результат добавления товаров в акцию.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersResponse{
public:

    /*! \brief Constructor.
	 */
    UpdatePromoOffersResponse();
    UpdatePromoOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePromoOffersResponse();


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
	UpdatePromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(UpdatePromoOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    UpdatePromoOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePromoOffersResponse_H_ */
