
/*
 * GetGoodsStatsResponse.h
 *
 * Ответ на запрос отчета по товарам.
 */

#ifndef TINY_CPP_CLIENT_GetGoodsStatsResponse_H_
#define TINY_CPP_CLIENT_GetGoodsStatsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GoodsStatsDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос отчета по товарам.
 *
 *  \ingroup Models
 *
 */

class GetGoodsStatsResponse{
public:

    /*! \brief Constructor.
	 */
    GetGoodsStatsResponse();
    GetGoodsStatsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsStatsResponse();


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
	GoodsStatsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsStatsDTO  result);


    private:
    ApiResponseStatusType status;
    GoodsStatsDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsStatsResponse_H_ */
