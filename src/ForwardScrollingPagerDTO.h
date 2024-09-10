/*
 * ForwardScrollingPagerDTO.h
 *
 * Ссылка на следующую страницу. 
 */

#ifndef _ForwardScrollingPagerDTO_H_
#define _ForwardScrollingPagerDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ссылка на следующую страницу. 
 *
 *  \ingroup Models
 *
 */

class ForwardScrollingPagerDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ForwardScrollingPagerDTO();
	ForwardScrollingPagerDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ForwardScrollingPagerDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор следующей страницы результатов.
	 */
	std::string getNextPageToken();

	/*! \brief Set Идентификатор следующей страницы результатов.
	 */
	void setNextPageToken(std::string  nextPageToken);

private:
	std::string nextPageToken;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ForwardScrollingPagerDTO_H_ */
