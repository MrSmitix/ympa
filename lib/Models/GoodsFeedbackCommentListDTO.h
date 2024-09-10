
/*
 * GoodsFeedbackCommentListDTO.h
 *
 * Комментарии к отзыву.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackCommentListDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackCommentListDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "GoodsFeedbackCommentDTO.h"
#include <list>

namespace Tiny {


/*! \brief Комментарии к отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentListDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackCommentListDTO();
    GoodsFeedbackCommentListDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackCommentListDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<GoodsFeedbackCommentDTO> comments;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackCommentListDTO_H_ */
