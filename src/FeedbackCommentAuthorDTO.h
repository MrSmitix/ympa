/*
 * FeedbackCommentAuthorDTO.h
 *
 * Информация об авторе комментария.
 */

#ifndef _FeedbackCommentAuthorDTO_H_
#define _FeedbackCommentAuthorDTO_H_


#include <string>
#include "FeedbackCommentAuthorType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об авторе комментария.
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentAuthorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackCommentAuthorDTO();
	FeedbackCommentAuthorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackCommentAuthorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedbackCommentAuthorType getType();

	/*! \brief Set 
	 */
	void setType(FeedbackCommentAuthorType  type);
	/*! \brief Get Имя автора отзыва или название магазина.
	 */
	std::string getName();

	/*! \brief Set Имя автора отзыва или название магазина.
	 */
	void setName(std::string  name);

private:
	FeedbackCommentAuthorType type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackCommentAuthorDTO_H_ */
