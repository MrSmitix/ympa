
/*
 * GoodsFeedbackStatisticsDTO.h
 *
 * Статистическая информация по отзыву.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackStatisticsDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackStatisticsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статистическая информация по отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackStatisticsDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackStatisticsDTO();
    GoodsFeedbackStatisticsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackStatisticsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Оценка товара.
	 */
	int getRating();

	/*! \brief Set Оценка товара.
	 */
	void setRating(int  rating);
	/*! \brief Get Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	 */
	long getCommentsCount();

	/*! \brief Set Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
	 */
	void setCommentsCount(long  commentsCount);
	/*! \brief Get Рекомендуют ли этот товар.
	 */
	bool isRecommended();

	/*! \brief Set Рекомендуют ли этот товар.
	 */
	void setRecommended(bool  recommended);
	/*! \brief Get Количество баллов Плюса, которое автор получил за отзыв.
	 */
	long getPaidAmount();

	/*! \brief Set Количество баллов Плюса, которое автор получил за отзыв.
	 */
	void setPaidAmount(long  paidAmount);


    private:
    int rating{};
    long commentsCount{};
    bool recommended{};
    long paidAmount{};
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackStatisticsDTO_H_ */
