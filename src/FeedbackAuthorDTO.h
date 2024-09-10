/*
 * FeedbackAuthorDTO.h
 *
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */

#ifndef _FeedbackAuthorDTO_H_
#define _FeedbackAuthorDTO_H_


#include <string>
#include "RegionDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 *
 *  \ingroup Models
 *
 */

class FeedbackAuthorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackAuthorDTO();
	FeedbackAuthorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackAuthorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Имя автора отзыва.
	 */
	std::string getName();

	/*! \brief Set Имя автора отзыва.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RegionDTO getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionDTO  region);

private:
	std::string name;
	RegionDTO region;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackAuthorDTO_H_ */
