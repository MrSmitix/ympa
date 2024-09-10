
/*
 * GoodsFeedbackDTO.h
 *
 * Отзыв о товаре.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GoodsFeedbackDescriptionDTO.h"
#include "GoodsFeedbackIdentifiersDTO.h"
#include "GoodsFeedbackMediaDTO.h"
#include "GoodsFeedbackStatisticsDTO.h"

namespace Tiny {


/*! \brief Отзыв о товаре.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackDTO();
    GoodsFeedbackDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор отзыва. 
	 */
	long getFeedbackId();

	/*! \brief Set Идентификатор отзыва. 
	 */
	void setFeedbackId(long  feedbackId);
	/*! \brief Get Дата и время создания отзыва.
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания отзыва.
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Нужен ли ответ на отзыв.
	 */
	bool isNeedReaction();

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
    long feedbackId{};
    std::string createdAt{};
    bool needReaction{};
    GoodsFeedbackIdentifiersDTO identifiers;
    std::string author{};
    GoodsFeedbackDescriptionDTO description;
    GoodsFeedbackMediaDTO media;
    GoodsFeedbackStatisticsDTO statistics;
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackDTO_H_ */
