
/*
 * GoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackCommentDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackCommentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GoodsFeedbackCommentAuthorDTO.h"
#include "GoodsFeedbackCommentStatusType.h"

namespace Tiny {


/*! \brief Комментарий к отзыву.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackCommentDTO();
    GoodsFeedbackCommentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackCommentDTO();


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
	/*! \brief Get Текст комментария.
	 */
	std::string getText();

	/*! \brief Set Текст комментария.
	 */
	void setText(std::string  text);
	/*! \brief Get Может ли продавец изменять комментарий или удалять его.
	 */
	bool isCanModify();

	/*! \brief Set Может ли продавец изменять комментарий или удалять его.
	 */
	void setCanModify(bool  canModify);
	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long getParentId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setParentId(long  parentId);
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
    long id{};
    std::string text{};
    bool canModify{};
    long parentId{};
    GoodsFeedbackCommentAuthorDTO author;
    GoodsFeedbackCommentStatusType status;
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackCommentDTO_H_ */
