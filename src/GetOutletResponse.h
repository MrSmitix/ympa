/*
 * GetOutletResponse.h
 *
 * Ответ на запрос информации о точке продаж.
 */

#ifndef _GetOutletResponse_H_
#define _GetOutletResponse_H_


#include <string>
#include "FullOutletDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации о точке продаж.
 *
 *  \ingroup Models
 *
 */

class GetOutletResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOutletResponse();
	GetOutletResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOutletResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FullOutletDTO getOutlet();

	/*! \brief Set 
	 */
	void setOutlet(FullOutletDTO  outlet);

private:
	FullOutletDTO outlet;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOutletResponse_H_ */
