/*
 * GoodsFeedbackCommentAuthorDTO.h
 *
 * Информация об авторе комментария.
 */

#ifndef _GoodsFeedbackCommentAuthorDTO_H_
#define _GoodsFeedbackCommentAuthorDTO_H_


#include <string>
#include "GoodsFeedbackCommentAuthorType.h"
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

class GoodsFeedbackCommentAuthorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackCommentAuthorDTO();
	GoodsFeedbackCommentAuthorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackCommentAuthorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	GoodsFeedbackCommentAuthorType getType();

	/*! \brief Set 
	 */
	void setType(GoodsFeedbackCommentAuthorType  type);
	/*! \brief Get Имя автора или название кабинета.
	 */
	std::string getName();

	/*! \brief Set Имя автора или название кабинета.
	 */
	void setName(std::string  name);

private:
	GoodsFeedbackCommentAuthorType type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackCommentAuthorDTO_H_ */
