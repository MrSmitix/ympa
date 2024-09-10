/*
 * OrderDocumentStatusType.h
 *
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
 */

#ifndef _OrderDocumentStatusType_H_
#define _OrderDocumentStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 *
 *  \ingroup Models
 *
 */

class OrderDocumentStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDocumentStatusType();
	OrderDocumentStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDocumentStatusType();

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

#endif /* _OrderDocumentStatusType_H_ */
