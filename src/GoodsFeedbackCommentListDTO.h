/*
 * GoodsFeedbackCommentListDTO.h
 *
 * Комментарии к отзыву.
 */

#ifndef _GoodsFeedbackCommentListDTO_H_
#define _GoodsFeedbackCommentListDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "GoodsFeedbackCommentDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Комментарии к отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentListDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackCommentListDTO();
	GoodsFeedbackCommentListDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackCommentListDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список комментариев.
	 */
	std::list<GoodsFeedbackCommentDTO> getComments();

	/*! \brief Set Список комментариев.
	 */
	void setComments(std::list <GoodsFeedbackCommentDTO> comments);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <GoodsFeedbackCommentDTO>comments;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackCommentListDTO_H_ */
