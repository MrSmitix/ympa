/*
 * AddOffersToArchiveErrorType.h
 *
 * Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
 */

#ifndef _AddOffersToArchiveErrorType_H_
#define _AddOffersToArchiveErrorType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveErrorType : public Object {
public:
	/*! \brief Constructor.
	 */
	AddOffersToArchiveErrorType();
	AddOffersToArchiveErrorType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddOffersToArchiveErrorType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddOffersToArchiveErrorType_H_ */
