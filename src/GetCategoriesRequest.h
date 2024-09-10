/*
 * GetCategoriesRequest.h
 *
 * Параметры запроса категорий. 
 */

#ifndef _GetCategoriesRequest_H_
#define _GetCategoriesRequest_H_


#include <string>
#include "LanguageType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры запроса категорий. 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCategoriesRequest();
	GetCategoriesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCategoriesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LanguageType getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageType  language);

private:
	LanguageType language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCategoriesRequest_H_ */
