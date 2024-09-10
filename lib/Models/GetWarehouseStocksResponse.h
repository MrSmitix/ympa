
/*
 * GetWarehouseStocksResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetWarehouseStocksResponse_H_
#define TINY_CPP_CLIENT_GetWarehouseStocksResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetWarehouseStocksDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetWarehouseStocksResponse{
public:

    /*! \brief Constructor.
	 */
    GetWarehouseStocksResponse();
    GetWarehouseStocksResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetWarehouseStocksResponse();


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
	GetWarehouseStocksDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetWarehouseStocksDTO  result);


    private:
    ApiResponseStatusType status;
    GetWarehouseStocksDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetWarehouseStocksResponse_H_ */
