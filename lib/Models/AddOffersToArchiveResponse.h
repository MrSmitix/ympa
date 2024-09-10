
/*
 * AddOffersToArchiveResponse.h
 *
 * Результат архивации товаров.
 */

#ifndef TINY_CPP_CLIENT_AddOffersToArchiveResponse_H_
#define TINY_CPP_CLIENT_AddOffersToArchiveResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AddOffersToArchiveDTO.h"
#include "ApiResponseStatusType.h"

namespace Tiny {


/*! \brief Результат архивации товаров.
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveResponse{
public:

    /*! \brief Constructor.
	 */
    AddOffersToArchiveResponse();
    AddOffersToArchiveResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddOffersToArchiveResponse();


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
	AddOffersToArchiveDTO getResult();

	/*! \brief Set 
	 */
	void setResult(AddOffersToArchiveDTO  result);


    private:
    ApiResponseStatusType status;
    AddOffersToArchiveDTO result;
};
}

#endif /* TINY_CPP_CLIENT_AddOffersToArchiveResponse_H_ */
