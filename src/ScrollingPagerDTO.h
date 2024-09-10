/*
 * ScrollingPagerDTO.h
 *
 * Информация о страницах результатов.
 */

#ifndef _ScrollingPagerDTO_H_
#define _ScrollingPagerDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о страницах результатов.
 *
 *  \ingroup Models
 *
 */

class ScrollingPagerDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ScrollingPagerDTO();
	ScrollingPagerDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScrollingPagerDTO();

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
	/*! \brief Get Идентификатор предыдущей страницы результатов.
	 */
	std::string getPrevPageToken();

	/*! \brief Set Идентификатор предыдущей страницы результатов.
	 */
	void setPrevPageToken(std::string  prevPageToken);

private:
	std::string nextPageToken;
	std::string prevPageToken;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScrollingPagerDTO_H_ */
