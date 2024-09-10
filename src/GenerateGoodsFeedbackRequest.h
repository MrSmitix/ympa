/*
 * GenerateGoodsFeedbackRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateGoodsFeedbackRequest_H_
#define _GenerateGoodsFeedbackRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsFeedbackRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateGoodsFeedbackRequest();
	GenerateGoodsFeedbackRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateGoodsFeedbackRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор бизнеса.
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.
	 */
	void setBusinessId(long long  businessId);

private:
	long long businessId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateGoodsFeedbackRequest_H_ */
