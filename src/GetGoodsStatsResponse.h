/*
 * GetGoodsStatsResponse.h
 *
 * Ответ на запрос отчета по товарам.
 */

#ifndef _GetGoodsStatsResponse_H_
#define _GetGoodsStatsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GoodsStatsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос отчета по товарам.
 *
 *  \ingroup Models
 *
 */

class GetGoodsStatsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsStatsResponse();
	GetGoodsStatsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsStatsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsStatsResponse_H_ */
