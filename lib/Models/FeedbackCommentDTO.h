
/*
 * FeedbackCommentDTO.h
 *
 * Комментарий к отзыву на магазин.
 */

#ifndef TINY_CPP_CLIENT_FeedbackCommentDTO_H_
#define TINY_CPP_CLIENT_FeedbackCommentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackCommentAuthorDTO.h"
#include <list>

namespace Tiny {


/*! \brief Комментарий к отзыву на магазин.
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackCommentDTO();
    FeedbackCommentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackCommentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор ответа.
	 */
	long getId();

	/*! \brief Set Идентификатор ответа.
	 */
	void setId(long  id);
	/*! \brief Get Идентификатор родительского ответа.
	 */
	long getParentId();

	/*! \brief Set Идентификатор родительского ответа.
	 */
	void setParentId(long  parentId);
	/*! \brief Get Текст ответа.
	 */
	std::string getBody();

	/*! \brief Set Текст ответа.
	 */
	void setBody(std::string  body);
	/*! \brief Get Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	void setUpdatedAt(std::string  updatedAt);
	/*! \brief Get 
	 */
	FeedbackCommentAuthorDTO getAuthor();

	/*! \brief Set 
	 */
	void setAuthor(FeedbackCommentAuthorDTO  author);
	/*! \brief Get Дочерние ответы.
	 */
	std::list<FeedbackCommentDTO> getChildren();

	/*! \brief Set Дочерние ответы.
	 */
	void setChildren(std::list <FeedbackCommentDTO> children);


    private:
    long id{};
    long parentId{};
    std::string body{};
    std::string createdAt{};
    std::string updatedAt{};
    FeedbackCommentAuthorDTO author;
    std::list<FeedbackCommentDTO> children;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackCommentDTO_H_ */
