/*
 * SetFeedParamsRequest.h
 *
 * Запрос на обновление изменение параметров прайс-листа.
 */

#ifndef _SetFeedParamsRequest_H_
#define _SetFeedParamsRequest_H_


#include <string>
#include "FeedParameterDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на обновление изменение параметров прайс-листа.
 *
 *  \ingroup Models
 *
 */

class SetFeedParamsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetFeedParamsRequest();
	SetFeedParamsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetFeedParamsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Параметры прайс-листа.  Обязательный параметр. 
	 */
	std::list<FeedParameterDTO> getParameters();

	/*! \brief Set Параметры прайс-листа.  Обязательный параметр. 
	 */
	void setParameters(std::list <FeedParameterDTO> parameters);

private:
	std::list <FeedParameterDTO>parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetFeedParamsRequest_H_ */
