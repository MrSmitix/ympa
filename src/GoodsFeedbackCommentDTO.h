/*
 * GoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву.
 */

#ifndef _GoodsFeedbackCommentDTO_H_
#define _GoodsFeedbackCommentDTO_H_


#include <string>
#include "GoodsFeedbackCommentAuthorDTO.h"
#include "GoodsFeedbackCommentStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Комментарий к отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackCommentDTO();
	GoodsFeedbackCommentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackCommentDTO();

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
	/*! \brief Get Текст комментария.
	 */
	std::string getText();

	/*! \brief Set Текст комментария.
	 */
	void setText(std::string  text);
	/*! \brief Get Может ли продавец изменять комментарий или удалять его.
	 */
	bool getCanModify();

	/*! \brief Set Может ли продавец изменять комментарий или удалять его.
	 */
	void setCanModify(bool  canModify);
	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long long getParentId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setParentId(long long  parentId);
	/*! \brief Get 
	 */
	GoodsFeedbackCommentAuthorDTO getAuthor();

	/*! \brief Set 
	 */
	void setAuthor(GoodsFeedbackCommentAuthorDTO  author);
	/*! \brief Get 
	 */
	GoodsFeedbackCommentStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(GoodsFeedbackCommentStatusType  status);

private:
	long long id;
	std::string text;
	bool canModify;
	long long parentId;
	GoodsFeedbackCommentAuthorDTO author;
	GoodsFeedbackCommentStatusType status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackCommentDTO_H_ */
