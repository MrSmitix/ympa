/*
 * GoodsFeedbackListDTO.h
 *
 * Список отзывов о товарах. 
 */

#ifndef _GoodsFeedbackListDTO_H_
#define _GoodsFeedbackListDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "GoodsFeedbackDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список отзывов о товарах. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackListDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackListDTO();
	GoodsFeedbackListDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackListDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список отзывов.
	 */
	std::list<GoodsFeedbackDTO> getFeedbacks();

	/*! \brief Set Список отзывов.
	 */
	void setFeedbacks(std::list <GoodsFeedbackDTO> feedbacks);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <GoodsFeedbackDTO>feedbacks;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackListDTO_H_ */
