/*
 * FeedbackCommentDTO.h
 *
 * Комментарий к отзыву на магазин.
 */

#ifndef _FeedbackCommentDTO_H_
#define _FeedbackCommentDTO_H_


#include <string>
#include "FeedbackCommentAuthorDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Комментарий к отзыву на магазин.
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackCommentDTO();
	FeedbackCommentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackCommentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор ответа.
	 */
	long long getId();

	/*! \brief Set Идентификатор ответа.
	 */
	void setId(long long  id);
	/*! \brief Get Идентификатор родительского ответа.
	 */
	long long getParentId();

	/*! \brief Set Идентификатор родительского ответа.
	 */
	void setParentId(long long  parentId);
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
	long long id;
	long long parentId;
	std::string body;
	std::string createdAt;
	std::string updatedAt;
	FeedbackCommentAuthorDTO author;
	std::list <FeedbackCommentDTO>children;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackCommentDTO_H_ */
