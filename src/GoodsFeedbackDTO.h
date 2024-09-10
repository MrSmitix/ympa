/*
 * GoodsFeedbackDTO.h
 *
 * Отзыв о товаре.
 */

#ifndef _GoodsFeedbackDTO_H_
#define _GoodsFeedbackDTO_H_


#include <string>
#include "GoodsFeedbackDescriptionDTO.h"
#include "GoodsFeedbackIdentifiersDTO.h"
#include "GoodsFeedbackMediaDTO.h"
#include "GoodsFeedbackStatisticsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Отзыв о товаре.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackDTO();
	GoodsFeedbackDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор отзыва. 
	 */
	long long getFeedbackId();

	/*! \brief Set Идентификатор отзыва. 
	 */
	void setFeedbackId(long long  feedbackId);
	/*! \brief Get Дата и время создания отзыва.
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания отзыва.
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Нужен ли ответ на отзыв.
	 */
	bool getNeedReaction();

	/*! \brief Set Нужен ли ответ на отзыв.
	 */
	void setNeedReaction(bool  needReaction);
	/*! \brief Get 
	 */
	GoodsFeedbackIdentifiersDTO getIdentifiers();

	/*! \brief Set 
	 */
	void setIdentifiers(GoodsFeedbackIdentifiersDTO  identifiers);
	/*! \brief Get Имя автора отзыва.
	 */
	std::string getAuthor();

	/*! \brief Set Имя автора отзыва.
	 */
	void setAuthor(std::string  author);
	/*! \brief Get 
	 */
	GoodsFeedbackDescriptionDTO getDescription();

	/*! \brief Set 
	 */
	void setDescription(GoodsFeedbackDescriptionDTO  description);
	/*! \brief Get 
	 */
	GoodsFeedbackMediaDTO getMedia();

	/*! \brief Set 
	 */
	void setMedia(GoodsFeedbackMediaDTO  media);
	/*! \brief Get 
	 */
	GoodsFeedbackStatisticsDTO getStatistics();

	/*! \brief Set 
	 */
	void setStatistics(GoodsFeedbackStatisticsDTO  statistics);

private:
	long long feedbackId;
	std::string createdAt;
	bool needReaction;
	GoodsFeedbackIdentifiersDTO identifiers;
	std::string author;
	GoodsFeedbackDescriptionDTO description;
	GoodsFeedbackMediaDTO media;
	GoodsFeedbackStatisticsDTO statistics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackDTO_H_ */
