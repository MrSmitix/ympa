
/*
 * DeleteOffersResponse.h
 *
 * Результат удаления товаров.
 */

#ifndef TINY_CPP_CLIENT_DeleteOffersResponse_H_
#define TINY_CPP_CLIENT_DeleteOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "DeleteOffersDTO.h"

namespace Tiny {


/*! \brief Результат удаления товаров.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersResponse{
public:

    /*! \brief Constructor.
	 */
    DeleteOffersResponse();
    DeleteOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteOffersResponse();


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
	DeleteOffersDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeleteOffersDTO  result);


    private:
    ApiResponseStatusType status;
    DeleteOffersDTO result;
};
}

#endif /* TINY_CPP_CLIENT_DeleteOffersResponse_H_ */
