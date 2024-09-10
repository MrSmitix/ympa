/*
 * FeedIndexLogsFeedDTO.h
 *
 * Информация о прайс-листе.
 */

#ifndef _FeedIndexLogsFeedDTO_H_
#define _FeedIndexLogsFeedDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о прайс-листе.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsFeedDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedIndexLogsFeedDTO();
	FeedIndexLogsFeedDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedIndexLogsFeedDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор прайс-листа.
	 */
	long long getId();

	/*! \brief Set Идентификатор прайс-листа.
	 */
	void setId(long long  id);

private:
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedIndexLogsFeedDTO_H_ */
