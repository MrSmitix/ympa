/*
 * GoodsFeedbackStatisticsDTO.h
 *
 * Статистическая информация по отзыву.
 */

#ifndef _GoodsFeedbackStatisticsDTO_H_
#define _GoodsFeedbackStatisticsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статистическая информация по отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackStatisticsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackStatisticsDTO();
	GoodsFeedbackStatisticsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackStatisticsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Оценка товара.
	 */
	int getRating();

	/*! \brief Set Оценка товара.
	 */
	void setRating(int  rating);
	/*! \brief Get Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	 */
	long long getCommentsCount();

	/*! \brief Set Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	 */
	void setCommentsCount(long long  commentsCount);
	/*! \brief Get Рекомендуют ли этот товар.
	 */
	bool getRecommended();

	/*! \brief Set Рекомендуют ли этот товар.
	 */
	void setRecommended(bool  recommended);
	/*! \brief Get Количество баллов Плюса, которое автор получил за отзыв.
	 */
	long long getPaidAmount();

	/*! \brief Set Количество баллов Плюса, которое автор получил за отзыв.
	 */
	void setPaidAmount(long long  paidAmount);

private:
	int rating;
	long long commentsCount;
	bool recommended;
	long long paidAmount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackStatisticsDTO_H_ */
