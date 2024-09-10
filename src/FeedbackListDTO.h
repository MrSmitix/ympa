/*
 * FeedbackListDTO.h
 *
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

#ifndef _FeedbackListDTO_H_
#define _FeedbackListDTO_H_


#include <string>
#include "FeedbackDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Отзывы пользователей Яндекс Маркета об указанном магазине.
 *
 *  \ingroup Models
 *
 */

class FeedbackListDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackListDTO();
	FeedbackListDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackListDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Список отзывов.  Содержит не более 20 отзывов. 
	 */
	std::list<FeedbackDTO> getFeedbackList();

	/*! \brief Set Список отзывов.  Содержит не более 20 отзывов. 
	 */
	void setFeedbackList(std::list <FeedbackDTO> feedbackList);

private:
	ScrollingPagerDTO paging;
	std::list <FeedbackDTO>feedbackList;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackListDTO_H_ */
