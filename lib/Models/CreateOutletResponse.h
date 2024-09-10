
/*
 * CreateOutletResponse.h
 *
 * Ответ на запрос о создании точки продаж.
 */

#ifndef TINY_CPP_CLIENT_CreateOutletResponse_H_
#define TINY_CPP_CLIENT_CreateOutletResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OutletResponseDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос о создании точки продаж.
 *
 *  \ingroup Models
 *
 */

class CreateOutletResponse{
public:

    /*! \brief Constructor.
	 */
    CreateOutletResponse();
    CreateOutletResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateOutletResponse();


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
	OutletResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OutletResponseDTO  result);


    private:
    ApiResponseStatusType status;
    OutletResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_CreateOutletResponse_H_ */
