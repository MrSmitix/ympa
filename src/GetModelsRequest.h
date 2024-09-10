/*
 * GetModelsRequest.h
 *
 * Запрос информации о моделях.
 */

#ifndef _GetModelsRequest_H_
#define _GetModelsRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос информации о моделях.
 *
 *  \ingroup Models
 *
 */

class GetModelsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetModelsRequest();
	GetModelsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetModelsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список моделей.
	 */
	std::list<long long> getModels();

	/*! \brief Set Список моделей.
	 */
	void setModels(std::list <long long> models);

private:
	std::list <long long>models;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetModelsRequest_H_ */
