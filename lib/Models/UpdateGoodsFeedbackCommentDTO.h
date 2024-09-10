
/*
 * UpdateGoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву или другому комментарию.
 */

#ifndef TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentDTO_H_
#define TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Комментарий к отзыву или другому комментарию.
 *
 *  \ingroup Models
 *
 */

class UpdateGoodsFeedbackCommentDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateGoodsFeedbackCommentDTO();
    UpdateGoodsFeedbackCommentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateGoodsFeedbackCommentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long getId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setId(long  id);
	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long getParentId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setParentId(long  parentId);
	/*! \brief Get Текст комментария.
	 */
	std::string getText();

	/*! \brief Set Текст комментария.
	 */
	void setText(std::string  text);


    private:
    long id{};
    long parentId{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateGoodsFeedbackCommentDTO_H_ */
