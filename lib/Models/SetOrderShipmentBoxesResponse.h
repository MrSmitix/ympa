
/*
 * SetOrderShipmentBoxesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SetOrderShipmentBoxesResponse_H_
#define TINY_CPP_CLIENT_SetOrderShipmentBoxesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "ShipmentBoxesDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderShipmentBoxesResponse{
public:

    /*! \brief Constructor.
	 */
    SetOrderShipmentBoxesResponse();
    SetOrderShipmentBoxesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetOrderShipmentBoxesResponse();


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
	ShipmentBoxesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ShipmentBoxesDTO  result);


    private:
    ApiResponseStatusType status;
    ShipmentBoxesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_SetOrderShipmentBoxesResponse_H_ */
