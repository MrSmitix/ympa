/*
 * FeedContentErrorDTO.h
 *
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
 */

#ifndef _FeedContentErrorDTO_H_
#define _FeedContentErrorDTO_H_


#include <string>
#include "FeedContentErrorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 *
 *  \ingroup Models
 *
 */

class FeedContentErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedContentErrorDTO();
	FeedContentErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedContentErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedContentErrorType getType();

	/*! \brief Set 
	 */
	void setType(FeedContentErrorType  type);

private:
	FeedContentErrorType type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedContentErrorDTO_H_ */
