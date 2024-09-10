
/*
 * GoodsFeedbackListDTO.h
 *
 * Список отзывов о товарах. 
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackListDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackListDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "GoodsFeedbackDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список отзывов о товарах. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackListDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackListDTO();
    GoodsFeedbackListDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackListDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<GoodsFeedbackDTO> feedbacks;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackListDTO_H_ */
