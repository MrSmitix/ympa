
/*
 * DeleteOffersFromArchiveResponse.h
 *
 * Результат разархивации товаров.
 */

#ifndef TINY_CPP_CLIENT_DeleteOffersFromArchiveResponse_H_
#define TINY_CPP_CLIENT_DeleteOffersFromArchiveResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "DeleteOffersFromArchiveDTO.h"

namespace Tiny {


/*! \brief Результат разархивации товаров.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveResponse{
public:

    /*! \brief Constructor.
	 */
    DeleteOffersFromArchiveResponse();
    DeleteOffersFromArchiveResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteOffersFromArchiveResponse();


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
	DeleteOffersFromArchiveDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeleteOffersFromArchiveDTO  result);


    private:
    ApiResponseStatusType status;
    DeleteOffersFromArchiveDTO result;
};
}

#endif /* TINY_CPP_CLIENT_DeleteOffersFromArchiveResponse_H_ */
