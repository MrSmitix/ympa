
/*
 * SearchShipmentsResponse.h
 *
 * Ответ на запрос информации об отгрузках.
 */

#ifndef TINY_CPP_CLIENT_SearchShipmentsResponse_H_
#define TINY_CPP_CLIENT_SearchShipmentsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "SearchShipmentsResponseDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос информации об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsResponse{
public:

    /*! \brief Constructor.
	 */
    SearchShipmentsResponse();
    SearchShipmentsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SearchShipmentsResponse();


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
	SearchShipmentsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(SearchShipmentsResponseDTO  result);


    private:
    ApiResponseStatusType status;
    SearchShipmentsResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_SearchShipmentsResponse_H_ */
