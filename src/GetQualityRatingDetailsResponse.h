/*
 * GetQualityRatingDetailsResponse.h
 *
 * 
 */

#ifndef _GetQualityRatingDetailsResponse_H_
#define _GetQualityRatingDetailsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "QualityRatingDetailsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingDetailsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQualityRatingDetailsResponse();
	GetQualityRatingDetailsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQualityRatingDetailsResponse();

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
	QualityRatingDetailsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(QualityRatingDetailsDTO  result);

private:
	ApiResponseStatusType status;
	QualityRatingDetailsDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQualityRatingDetailsResponse_H_ */
