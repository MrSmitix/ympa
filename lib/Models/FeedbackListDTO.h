
/*
 * FeedbackListDTO.h
 *
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

#ifndef TINY_CPP_CLIENT_FeedbackListDTO_H_
#define TINY_CPP_CLIENT_FeedbackListDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Отзывы пользователей Яндекс Маркета об указанном магазине.
 *
 *  \ingroup Models
 *
 */

class FeedbackListDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackListDTO();
    FeedbackListDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackListDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<FeedbackDTO> feedbackList;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackListDTO_H_ */
