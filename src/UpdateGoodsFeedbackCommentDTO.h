/*
 * UpdateGoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву или другому комментарию.
 */

#ifndef _UpdateGoodsFeedbackCommentDTO_H_
#define _UpdateGoodsFeedbackCommentDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Комментарий к отзыву или другому комментарию.
 *
 *  \ingroup Models
 *
 */

class UpdateGoodsFeedbackCommentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateGoodsFeedbackCommentDTO();
	UpdateGoodsFeedbackCommentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateGoodsFeedbackCommentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long long getId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setId(long long  id);
	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long long getParentId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setParentId(long long  parentId);
	/*! \brief Get Текст комментария.
	 */
	std::string getText();

	/*! \brief Set Текст комментария.
	 */
	void setText(std::string  text);

private:
	long long id;
	long long parentId;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateGoodsFeedbackCommentDTO_H_ */
